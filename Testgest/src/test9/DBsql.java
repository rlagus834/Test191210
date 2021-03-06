package test9;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBsql {
	Naver na=null;
	Connection con = null;
	PreparedStatement pstmt = null;
	PreparedStatement pstmtSelect = null;
	ResultSet rs = null;
	Scanner scan = new Scanner(System.in);
DBConnection dbc=new DBConnection();
	public void Connetion() {
		con=dbc.makeConnection();
	}
	
	public void joinMembership() {
		String sql = "INSERT INTO MEMBER VALUES(?,?,?,?,?,?,SYSDATE,?)";
		try {
			pstmt = con.prepareStatement(sql);
			System.out.println("아이디 입력");			
			String Input0 = scan.next();
			pstmt.setString(1, Input0);
			System.out.println("비밀번호 입력");
			String Input1 = scan.next();
			pstmt.setString(2, Input1);
			System.out.println("이름 입력");
			String Input2 = scan.next();
			pstmt.setString(3, Input2);
			System.out.println("생일 입력");
			String Input3 = scan.next();
			pstmt.setString(4, Input3);
			System.out.println("이메일 입력");
			String Input4 = scan.next();
			pstmt.setString(5, Input4);
			System.out.println("전화번호 입력");
			String Input5 = scan.next();
			pstmt.setString(6, Input5);
			System.out.println("성별 입력");
			String Input6 = scan.next();
			pstmt.setString(7, Input6);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("제한에 맞지않게 입력하셨습니다.");
		}

	}

	public void membershipInformationPassword() {
		String sql = "UPDATE MEMBER SET PASSWORD=? WHERE ID=? AND PASSWORD=?";
		try {
			pstmt = con.prepareStatement(sql);
			System.out.println("아이디입력");
			String input0 = scan.next();
			pstmt.setString(2, input0);
			System.out.println("비밀번호입력");
			String input1 = scan.next();
			pstmt.setString(3, input1);
			System.out.println("변경할 비밀번호를 입력하세요");
			String input2 = scan.next();
			pstmt.setString(1, input2);
			System.out.println("변경완료");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("해당 아이디가 없거나 잘못입력하셨습니다.");
		}

	}

	public void membershipInformationName() {
		String sql = "UPDATE MEMBER SET NAME=? WHERE ID=? AND PASSWORD=?";
		try {
			pstmt = con.prepareStatement(sql);
			System.out.println("아이디입력");
			String input0 = scan.next();
			pstmt.setString(2, input0);
			System.out.println("비밀번호입력");
			String input1 = scan.next();
			pstmt.setString(3, input1);
			System.out.println("변경할 이름을 입력하세요");
			String input2 = scan.next();
			pstmt.setString(1, input2);
			System.out.println("변경완료");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("해당 아이디가 없거나 잘못입력하셨습니다.");
		}
	}

	public void membershipInformationBirth() {
		String sql = "UPDATE MEMBER SET BIRTH=? WHERE ID=? AND PASSWORD=?";
		try {
			pstmt = con.prepareStatement(sql);
			System.out.println("아이디입력");
			String input0 = scan.next();
			pstmt.setString(2, input0);
			System.out.println("비밀번호입력");
			String input1 = scan.next();
			pstmt.setString(3, input1);
			System.out.println("변경할 생일을 입력하세요");
			String input2 = scan.next();
			pstmt.setString(1, input2);
			System.out.println("변경완료");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("해당 아이디가 없거나 잘못입력하셨습니다.");
		}

	}

	public void membershipInformationEmail() {
		String sql = "UPDATE MEMBER SET EMAIL=? WHERE ID=? AND PASSWORD=?";
		try {
			pstmt = con.prepareStatement(sql);
			System.out.println("아이디입력");
			String input0 = scan.next();
			pstmt.setString(2, input0);
			System.out.println("비밀번호입력");
			String input1 = scan.next();
			pstmt.setString(3, input1);
			System.out.println("변경할 이메일을 입력하세요");
			String input2 = scan.next();
			pstmt.setString(1, input2);
			System.out.println("변경완료");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("해당 아이디가 없거나 잘못입력하셨습니다.");
		}

	}

	public void membershipInformationPhone() {
		String sql = "UPDATE MEMBER SET PHONE=? WHERE ID=? AND PASSWORD=?";
		try {
			pstmt = con.prepareStatement(sql);
			System.out.println("아이디입력");
			String input0 = scan.next();
			pstmt.setString(2, input0);
			System.out.println("비밀번호입력");
			String input1 = scan.next();
			pstmt.setString(3, input1);
			System.out.println("변경할 전화번호를 입력하세요");
			String input2 = scan.next();
			pstmt.setString(1, input2);
			System.out.println("변경완료");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("해당 아이디가 없거나 잘못입력하셨습니다.");
		}

	}
	public void membershipInformationGender() {
		String sql = "UPDATE MEMBER SET GENDER=? WHERE ID=? AND PASSWORD=?";
		try {
			pstmt = con.prepareStatement(sql);
			System.out.println("아이디입력");
			String input0 = scan.next();
			pstmt.setString(2, input0);
			System.out.println("비밀번호입력");
			String input1 = scan.next();
			pstmt.setString(3, input1);
			System.out.println("변경할 성별을 입력하세요");
			String input2 = scan.next();
			pstmt.setString(1, input2);
			System.out.println("변경완료");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("해당 아이디가 없거나 잘못입력하셨습니다.");
		}

	}


	public void deleteMembership() {
		String sql = "DELETE FROM MEMBER WHERE ID=? AND PASSWORD=?";
		try {
			pstmt = con.prepareStatement(sql);
			System.out.println("아이디 입력");
			String input0 = scan.next();
			pstmt.setString(1, input0);
			System.out.println("비밀번호 입력");
			String input1 = scan.next();
			pstmt.setString(2, input1);
			System.out.println("삭제완료");
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("해당 아이디가 없거나 잘못입력하셨습니다.");
			
		}

	}

	
			
	

	public List<Naver> selectAll2() {
		List<Naver> list=new ArrayList<Naver>();
		String sql = "SELECT * FROM MEMBER ORDER BY JOINDAY";
		try {
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
			
				Naver na=new Naver(	rs.getString("id"),
						rs.getString("password"),
						rs.getString("name"),rs.getString("birth"),
						rs.getString("email"),rs.getString("phone"),
						rs.getString("joinday"),rs.getString("gender"));
				
				list.add(na);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
		
	}

	
	
	
	
	
}
