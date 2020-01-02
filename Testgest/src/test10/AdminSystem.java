package test10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminSystem {
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	Scanner scan=new Scanner(System.in);
	DBConnection dbc=new DBConnection();
	boolean lie=false;
	int count=0;
	
public void connection(Connection con) {
	this.con=con;
}
public void allSelect() {
	
	String sql="SELECT * FROM BANKSYSTEM";
try {
	pstmt=con.prepareStatement(sql);
	rs=pstmt.executeQuery();
	while(rs.next()) {
		System.out.print("고객번호: "+rs.getInt("clientNo"));
		System.out.print(" 계좌: "+rs.getString("accountNumber"));
		System.out.print(" 비밀번호: "+rs.getString("password"));
		System.out.print(" 이름: "+rs.getString("name"));
		System.out.print(" 잔액: "+rs.getString("money"));
		System.out.println(" 가입일자: "+rs.getString("joinDay"));
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	


	
}
	
public void clientNoUpdate() {
	String sql="UPDATE BANKSYSTEM SET CLIENTNO=? WHERE ACCOUNTNUMBER=? AND PASSWORD=?";
	try {
		pstmt=con.prepareStatement(sql);
		System.out.println("해당 계좌입력");
		String anInput=scan.next();
		pstmt.setString(2,anInput);
		System.out.println("해당 비밀번호입력");
		String pwInput=scan.next();
		pstmt.setString(3,pwInput);
		System.out.println("고객번호 입력");
		int cnInput=scan.nextInt();
		pstmt.setInt(1,cnInput);
		pstmt.executeQuery();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
	System.out.println("계좌또는 비밀번호가 다릅니다");
	}
	
	
	
}

public void accountNoUpdate() {
	String sql="UPDATE BANKSYSTEM SET ACCOUNTNUMBER=? WHERE ACCOUNTNUMBER=? AND PASSWORD=?";
	try {
		pstmt=con.prepareStatement(sql);
		System.out.println("해당 계좌입력");
		String anInput=scan.next();
		pstmt.setString(2,anInput);
		System.out.println("해당 비밀번호입력");
		String pwInput=scan.next();
		pstmt.setString(3,pwInput);
		System.out.println("계좌 입력");
		String cnInput=scan.next();
		pstmt.setString(1,cnInput);
		pstmt.executeQuery();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
	System.out.println("계좌또는 비밀번호가 다르거나 이미있는 계좌입니다. ");
	}
	
	
	
}

public void passwordUpdate() {
	String sql="UPDATE BANKSYSTEM SET PASSWORD=? WHERE ACCOUNTNUMBER=? AND PASSWORD=?";
	try {
		pstmt=con.prepareStatement(sql);
		System.out.println("해당 계좌입력");
		String anInput=scan.next();
		pstmt.setString(2,anInput);
		System.out.println("해당 비밀번호입력");
		String pwInput=scan.next();
		pstmt.setString(3,pwInput);
		System.out.println("비밀번호 입력");
		String cnInput=scan.next();
		pstmt.setString(1,cnInput);
		pstmt.executeQuery();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
	System.out.println("계좌또는 비밀번호가 다릅니다");
	}
	
	
	
}

public void nameUpdate() {
	String sql="UPDATE BANKSYSTEM SET NAME=? WHERE ACCOUNTNUMBER=? AND PASSWORD=?";
	try {
		pstmt=con.prepareStatement(sql);
		System.out.println("해당 계좌입력");
		String anInput=scan.next();
		pstmt.setString(2,anInput);
		System.out.println("해당 비밀번호입력");
		String pwInput=scan.next();
		pstmt.setString(3,pwInput);
		System.out.println("이름 입력");
		String cnInput=scan.next();
		pstmt.setString(1,cnInput);
		pstmt.executeQuery();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
	System.out.println("계좌또는 비밀번호가 다릅니다");
	}
	
	
	
}

public void moneyUpdate() {
	String sql="UPDATE BANKSYSTEM SET MONEY=? WHERE ACCOUNTNUMBER=? AND PASSWORD=?";
	try {
		pstmt=con.prepareStatement(sql);
		System.out.println("해당 계좌입력");
		String anInput=scan.next();
		pstmt.setString(2,anInput);
		System.out.println("해당 비밀번호입력");
		String pwInput=scan.next();
		pstmt.setString(3,pwInput);
		System.out.println("잔액 입력");
		int cnInput=scan.nextInt();
		pstmt.setInt(1,cnInput);
		pstmt.executeQuery();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
	System.out.println("계좌또는 비밀번호가 다릅니다");
	}
	
	
	
}
public boolean lieSelect(String nameSave, int numberSave) {
	
	String sql="SELECT NAME FROM BANKSYSTEM WHERE CLIENTNO=?";
try {
	pstmt=con.prepareStatement(sql);
	pstmt.setInt(1, numberSave);
	rs=pstmt.executeQuery();
	while(rs.next()) {
		
		if(nameSave.equals(rs.getString("name"))) {
			lie=true;
		}else {			
			lie=false;
		}
		
	}
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return lie;
	


	
}	

public int count() {
	String sql="SELECT count(*) FROM BANKSYSTEM";
	try {
		pstmt=con.prepareStatement(sql);
		rs=pstmt.executeQuery();
		while(rs.next()) {
			count=rs.getInt("count(*)");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return count;
		

	
}
	
}