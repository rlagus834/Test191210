package test10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class StartMenu {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Scanner scan = new Scanner(System.in);
	DBConnection dbc = new DBConnection();
	String nameSave = "";
	int moneySave = 0;
	int numberSave = 0;
	boolean runs = false, runss = false;
	AdminSystem as = new AdminSystem();
	BankSystem bs=new BankSystem();

	public void Connection() {

		con = dbc.makeConnection();
	}

	public void join() {
		String sql = "INSERT INTO BANKSYSTEM VALUES(?,?,?,?,0,SYSDATE)";
		try {
			as.connection(con);
			pstmt = con.prepareStatement(sql);			
			pstmt.setInt(1,as.count());
			System.out.println("계좌입력");
			String input2 = scan.next();
			pstmt.setString(2, input2);
			System.out.println("비밀번호입력");
			String input3 = scan.next();
			pstmt.setString(3, input3);
			System.out.println("이름입력");
			String input4 = scan.next();
			pstmt.setString(4, input4);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("중복된 입력입니다.");
		}

	}

	public void login() {

		String sql = "SELECT CLIENTNO,NAME,MONEY FROM BANKSYSTEM WHERE ACCOUNTNUMBER=? AND PASSWORD=?";
		try {
			numberSave =0;
			nameSave = "";
			moneySave = 0;
			pstmt = con.prepareStatement(sql);
			System.out.println("계좌를 입력하십시오");
			String inputAccountNumber = scan.next();
			pstmt.setString(1, inputAccountNumber);
			System.out.println("비밀번호를 입력하십시오");
			String inputPassword = scan.next();
			pstmt.setString(2, inputPassword);		
			rs = pstmt.executeQuery();			
			while (rs.next()) {
				numberSave = rs.getInt("clientNo");
				nameSave = rs.getString("name");
				moneySave = rs.getInt("money");
			}
			runs = true;
			as.connection(con);
			if (numberSave == 7347) {
				
				System.out.println("관리자접속완료");

				while (runs) {
					System.out.println("1.회원정보변경|2.회원목록|3.관리자접속종료");
					int input = scan.nextInt();
					switch (input) {
					case 1:
						System.out.println("1.고객번호변경|2.계좌변경|3.비밀번호변경|4.이름변경|5.잔액변경");
						int adminInput = scan.nextInt();
						runss = true;
						while (runss) {
							switch (adminInput) {
							case 1:
								as.clientNoUpdate();
								runss = false;
								break;
							case 2:
								as.accountNoUpdate();
								runss = false;
								break;
							case 3:
								as.passwordUpdate();
								runss = false;
								break;
							case 4:
								as.nameUpdate();
								runss = false;
								break;
							case 5:
								as.moneyUpdate();
								runss = false;
								break;
							
							}
						}
					case 2:
						as.allSelect();
						break;
					case 3:
						runs = false;
					
				}
				}
			} else if(as.lieSelect(nameSave, numberSave)){
				bs.connection(con);
				System.out.println(nameSave + "님 반갑습니다.");
				while (runs) {
					System.out.println("1.입금|2.출금|3.송금|4.잔액확인|5.비밀번호변경|6.종료");
					int memberInput = scan.nextInt();
					switch (memberInput) {
					case 1:
						moneySave=bs.depositfunction(numberSave, moneySave);
						break;
					case 2:
						moneySave=bs.withdrawalfunction(numberSave, moneySave);
						break;
					case 3:
						moneySave=bs.moneyTransferFunction(numberSave, moneySave);
						break;
					case 4:
System.out.println("잔액: "+moneySave);
						break;
					case 5:
						as.passwordUpdate();
						break;
					case 6:
						runs = false;				
					}
				}
			}else {
				System.out.println("없는계정입니다.");
			}
		} catch (SQLException e) {
			
			System.out.println("계좌 또는 비밀번호가 틀립니다.");
		}

	}

}