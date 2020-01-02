package test10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class BankSystem {
	Connection con=null;
	PreparedStatement pstmt=null,pstmtTransfer=null;
	ResultSet rs=null;
	Scanner scan=new Scanner(System.in);
	DBConnection dbc=new DBConnection();
	int saveMoney=0;
	public void connection(Connection con) {
		this.con=con;
	}	
	
public int depositfunction(int cnInput,int money) {
	String sql="UPDATE BANKSYSTEM SET MONEY=? WHERE CLIENTNO=?";
	try {
		pstmt=con.prepareStatement(sql);	
		pstmt.setInt(2,cnInput);		
		System.out.println("입금액 입력");
		int moneyInput=scan.nextInt();
		saveMoney=money+moneyInput;
		pstmt.setInt(1,saveMoney);
		pstmt.executeQuery();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
	System.out.println("에러발생");
	}
	return saveMoney;
	
}
	
public int withdrawalfunction(int cnInput,int money) {
	String sql="UPDATE BANKSYSTEM SET MONEY=? WHERE CLIENTNO=?";
	try {
		pstmt=con.prepareStatement(sql);
		System.out.println("출금액 입력");
		int moneyInput=scan.nextInt();
		if(money<moneyInput) {
			System.out.println("잔액이 부족합니다.");
		}else {
		pstmt.setInt(2,cnInput);		
		saveMoney=money-moneyInput;
		pstmt.setInt(1,saveMoney);
		pstmt.executeQuery();
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
	System.out.println("에러발생");
	}
	return saveMoney;
}

public int moneyTransferFunction(int cnInput,int money) {
	String sql="UPDATE BANKSYSTEM SET MONEY=? WHERE CLIENTNO=?";

	try {
		System.out.println("송금할 계좌를 입력하세요");
		String accountInput=scan.next();
		pstmt=con.prepareStatement(sql);
		System.out.println("송금액 입력");
		int moneyInput=scan.nextInt();
		saveMoney=money;
		if(money<moneyInput) {
			System.out.println("잔액이 부족합니다.");
		}else {
			
		pstmt.setInt(2,cnInput);		
		saveMoney=money-moneyInput;
		pstmt.setInt(1,saveMoney);
		pstmt.executeUpdate();
		sql="SELECT MONEY FROM BANKSYSTEM WHERE ACCOUNTNUMBER=?";
			
		pstmt=con.prepareStatement(sql);
		pstmt.setString(1,accountInput);
		rs=pstmt.executeQuery();
		while(rs.next()) {
			saveMoney=rs.getInt("money");
		}
		
		sql="UPDATE BANKSYSTEM SET MONEY=? WHERE ACCOUNTNUMBER=?";
				pstmt=con.prepareStatement(sql);
		pstmt.setString(2, accountInput);
		saveMoney=saveMoney+moneyInput;
		pstmt.setInt(1, saveMoney);
		pstmt.executeUpdate();
		saveMoney=money-moneyInput;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
	System.out.println("에러발생");
	}
	return saveMoney;
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}