package 개인;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class DBsql {
	boolean run=true;
	DBConnection dbc = new DBConnection();
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	Scanner scan = new Scanner(System.in);
	int dice1 = 0, dice2 = 0, savePrice = 0, saveMoney = 0,i=2;
	String saveCity = "", saveProperty = "";

	public void connection() {
		con = dbc.makeConnection();
	}

	public void join(String user1, String user2) {
		String sql = "INSERT INTO USERLIST VALUES((SELECT COUNT(*) FROM USERLIST),?,1500)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user1);
			pstmt.executeUpdate();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user2);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void start(String user1, String user2) {
		
		while(run) {
			if ( i% 2 == 0) {
				map();
				searchMoney(user1);
				searchCity(user1);
				System.out.println(user1 + "의 순서입니다 주사위를 굴려주세요");				
				String diceInput = scan.next();
				int dice = (int) (Math.random() * 6) + 1;
				System.out.println(dice+"칸 이동");
				i++;
				dice1 = dice;
				if (dice1 >= 13) {					
					dice1 = dice1 - 12;					
						// 보너스
						bonus(user1);					
						play(dice1, user1, user2);
				} else {
					play(dice1, user1, user2);
				}

			} else if (i % 2 == 1) {
				map();
				searchMoney(user2);
				searchCity(user2);
				System.out.println(user2 + "의 순서입니다 주사위를 굴려주세요");				
				String diceInput = scan.next();
				int dice = (int) (Math.random() * 6) + 1;
				System.out.println(dice+"칸 이동");
				i++;
				dice2 = dice;
				if (dice2 >= 13) {
					dice2 = dice2 - 12;
					if (1 <= dice2) {
						// 보너스
						bonus(user2);
					} else {
						play(dice2, user2, user1);
					}
				} else {
					play(dice2, user2, user1);
				}

			}
		}
		

	}

	public void play(int dice, String user1, String user2) {
		String sql = "SELECT CITY,PROPERTY,PRICE FROM MONOPOLY WHERE CITYNO=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dice);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				saveCity = rs.getString("city");
				saveProperty = rs.getString("property");
				savePrice = rs.getInt("price");
				System.out.println(saveCity + "에 도착했습니다");
			}
			if(saveCity.equals("출발지")) {
				System.out.println("출발지입니다.");
			}
			else if (saveCity.equals("국세청")) {
				System.out.println("국세청 입니다.");
				// 국세청메소드
				tax(user1);
			}

			else if (saveProperty.equals(user2)) {
				System.out.println(user2 + "의 소유지입니다. 지불금액: " + savePrice);
				// 지불메소드
				payment(savePrice, user1, user2);
			} else {
				// 공백도시메소드
				System.out.println("소유한 사람이 없습니다.  지불금액: " + savePrice);
				buyCity(user1, savePrice);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void bonus(String user) {
		String sql = "UPDATE USERLIST SET MONEY=MONEY+100 WHERE NAME=?";
		try {
			System.out.println("출발지를 지났으므로 보너스가 지급됩니다");
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user);
			pstmt.executeUpdate();
			searchMoney(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void tax(String user) {
		String sql = "UPDATE USERLIST SET MONEY=MONEY-100 WHERE NAME=?";
		try {
			if (saveMoney <= 100) {
				System.out.println("잔액이 부족하여 파산합니다.");
				run=false;
				rollback();
				DisConnection();
			} else {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, user);
				pstmt.executeUpdate();
				searchMoney(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchMoney(String user) {
		String sql = "SELECT MONEY FROM USERLIST WHERE NAME=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				saveMoney = rs.getInt("money");
				System.out.println("잔액: " + saveMoney);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void searchCity(String user) {
		String sql = "SELECT CITY FROM MONOPOLY WHERE PROPERTY=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user);
			rs = pstmt.executeQuery();
			System.out.print("소유 건물 리스트  ");
			while (rs.next()) {
				System.out.print(rs.getString("city"));
				System.out.print(" ");
			}
			System.out.println(" ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void payment(int price, String user1, String user2) {
		String sql = "UPDATE USERLIST SET MONEY=MONEY-? WHERE NAME=?";
		try {
			searchMoney(user1);
			if (price >= saveMoney) {
				System.out.println("잔액이 부족하여 파산합니다.");
				run=false;
				rollback();
				DisConnection();
			} else {				
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, price);
				pstmt.setString(2, user1);
				pstmt.executeUpdate();
				sql = "UPDATE USERLIST SET MONEY=MONEY+? WHERE NAME=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, price);
				pstmt.setString(2, user2);
				pstmt.executeUpdate();
				if (saveMoney > price) {
					System.out.println("지불완료");
					System.out.println("도시를 인수하시겠습니까? 가격: " + price);
					System.out.println("1.인수 2.포기");
					String insu = scan.next();
					if (insu.equals("1")) {
						sql = "UPDATE USERLIST SET MONEY=MONEY-? WHERE NAME=?";
						pstmt = con.prepareStatement(sql);
						pstmt.setInt(1, price);
						pstmt.setString(2, user1);
						pstmt.executeUpdate();
						sql = "UPDATE USERLIST SET MONEY=MONEY+? WHERE NAME=?";
						pstmt = con.prepareStatement(sql);
						pstmt.setInt(1, price);
						pstmt.setString(2, user2);
						pstmt.executeUpdate();
						searchMoney(user1);
						sql = "UPDATE MONOPOLY SET PROPERTY=? WHERE PRICE=?";
						pstmt = con.prepareStatement(sql);
						pstmt.setString(1, user1);
						pstmt.setInt(2, price);
						pstmt.executeUpdate();
						System.out.println("인수완료");
					} else {
						System.out.println("인수하지않고 진행합니다.");
					}
				} else {
					System.out.println("지불완료");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void buyCity(String user1, int price) {
		String sql = "UPDATE USERLIST SET MONEY=MONEY-? WHERE NAME=?";
		try {
			System.out.println("구입하시겠습니까?  1.도시 구입 2.패스");
			String inputBuy = scan.next();
			if (inputBuy.equals("1")) {
				if (saveMoney <= price) {
					System.out.println("잔액이 부족합니다.");
				} else {
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, price);
					pstmt.setString(2, user1);
					pstmt.executeUpdate();
					searchMoney(user1);
					sql = "UPDATE MONOPOLY SET PROPERTY=? WHERE PRICE=?";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, user1);
					pstmt.setInt(2, price);
					pstmt.executeUpdate();
					System.out.println("구입완료");
				}
			} else {
				System.out.println("구입하지않고 진행합니다.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void DisConnection() {
		try {
			System.out.println("");
			System.out.println("");
			System.out.println("게임종료");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			con.close();
		} catch (SQLException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
	}
	public void rollback() {
		try {
			System.out.println("리셋");
			con.rollback();
		} catch (SQLException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		
	}
	public void AutoCommitOff() { //1먼 커맨드 누르면 실행, 이미 저장되아있는 DB를 건들지 않기위해 자동커밋기능을 해제하는 메소드
		try {
			System.out.println("자동 커밋 해제");
			con.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	public void map() {
		System.out.println("+-------+-------+--------+--------+");
		System.out.println("+ 1  출      + 2  인      + 3  대        + 4  부        +");
		System.out.println("+   발      +   천      +   전        +   산        +");
		System.out.println("+-------+-------+--------+--------+");
		System.out.println("+ 12  서      +                +  5 국        +");
		System.out.println("+       +                +   세        +");
		System.out.println("+   울      +                +   청        +");
		System.out.println("+-------+                +--------+");
		System.out.println("+ 11  수      +                + 6  제        +");
		System.out.println("+       +                +   주        +");
		System.out.println("+   원      +                +   도        +");
		System.out.println("+-------+-------+--------+--------+");
		System.out.println("+ 10  송      + 9  대      + 8  광        +  7 독        +");
		System.out.println("+   도      +   구      +   주        +   도        +");
		System.out.println("+-------+-------+--------+--------+");
	}
}
