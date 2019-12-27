package test8;

//쿼리문을 모아놓은 클래스
import java.sql.*;
import java.util.Scanner;

import java.util.*;

public class DBsql {
	List<Student> list =new ArrayList<Student>();
//DB접속
	Connection con = null;
//쿼리문 전송을 위한 변수 선언
	PreparedStatement pstmt = null;
//조회(SELECT)결과를 저장하기 위한 변수 선언
	ResultSet rs = null;

	public void dbConnection() {
		con = DBConnection.makeConnection();
	}

	// student 테이블 전체조회 메소드
public void selectDB() {
	String sql="SELECT * FROM STUDENT";
	try {
		pstmt=con.prepareStatement(sql);
		rs=pstmt.executeQuery(sql);
		while(rs.next()) {
		System.out.print(rs.getInt("StudentNo"));
		System.out.print(rs.getString("name"));
		System.out.print(rs.getInt("age"));
		System.out.print(rs.getString("address"));
		System.out.print(rs.getString("gender"));
		System.out.println(rs.getString("phone"));}				
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}
	// STUDENT 테이블에 데이터 추가
	public void insertDB() {
		String sql = "INSERT INTO STUDENT VALUES(6,'구마적',11,'강원도 강릉시','남성','010-7777-7776')";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			System.out.println("DB에 저장성공");
			int result = pstmt.executeUpdate(); // 0 1만나옴
			System.out.println("insert결과" + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	

	public void insertDB4(Student sd) {
		String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			Scanner scan = new Scanner(System.in);
			System.out.println("학생번호");
			int input1 = scan.nextInt();
			sd.setStudentNo(input1);
			System.out.println("이름");
			String input2 = scan.next();
			sd.setName(input2);
			System.out.println("나이");
			int input3 = scan.nextInt();
			sd.setAge(input3);
			System.out.println("주소");
			String input4 = scan.next();
			sd.setAddress(input4);
			System.out.println("성별");
			String input5 = scan.next();
			sd.setGender(input5);
			System.out.println("전화번호");
			String input6 = scan.next();
			sd.setPhone(input6);

			pstmt.setInt(1, sd.getStudentNo());// 물음표의순서 처음은 1부터시작
			pstmt.setString(2, sd.getName());
			pstmt.setInt(3, sd.getAge());
			pstmt.setString(4, sd.getAddress());
			pstmt.setString(5, sd.getGender());
			pstmt.setString(6, sd.getPhone());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public  List<Student> selectDB1() {
		// 실행하고자 하는 쿼리문을 String 변수로 지정
		String sql = "SELECT * FROM STUDENT";

		try {
			// 접속한 DB에 쿼리문을 전송할 준비
			pstmt = con.prepareStatement(sql);
		
			// 쿼리문을 실행하고 실행결과를 rs에저장
			rs = pstmt.executeQuery();
			while (rs.next()) {
		
				Student sd=new Student(rs.getInt("studentno"),rs.getInt("age"), rs.getString("name")
						,rs.getString("address"),rs.getString("gender"),rs.getString("phone"));
				 list.add(sd);
				  
				
			 
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}
public void girl() {
	String sql="SELECT * FROM STUDENT WHERE GENDER='여자'";
	try {
		pstmt=con.prepareStatement(sql);
		rs=pstmt.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getInt("studentNo"));
			System.out.print(rs.getString("name"));
			System.out.print(rs.getInt("age"));
			System.out.print(rs.getString("address"));
			System.out.print(rs.getString("gender"));
			System.out.println(rs.getString("phone"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public void incheon() {
	String sql="SELECT * FROM STUDENT WHERE ADDRESS LIKE ?";

	try {
				
		pstmt=con.prepareStatement(sql);
		Scanner scan=new Scanner(System.in);
		System.out.println("주소검색");
		String input=scan.next();		
		pstmt.setString(1, "%"+input+"%");
		rs=pstmt.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getInt("studentNo"));
			System.out.print(rs.getString("name"));
			System.out.print(rs.getInt("age"));
			System.out.print(rs.getString("address"));
			System.out.print(rs.getString("gender"));
			System.out.println(rs.getString("phone"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
public void updatePhone() {
	String sql="UPDATE STUDENT SET PHONE=? WHERE STUDENTNO=?";
	try {
		pstmt=con.prepareStatement(sql);
		Scanner scan=new Scanner(System.in);
		System.out.println("번호를입력하세요");
		int input=scan.nextInt();
		pstmt.setInt(2, input);
		System.out.println("번호를입력하세요");
		String input1=scan.next();
		pstmt.setString(1, input1);
		pstmt.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
public void delete() {
	String sql="DELETE FROM STUDENT WHERE STUDENTNO=?";
	try {
		pstmt=con.prepareStatement(sql);
		Scanner scan=new Scanner(System.in);
		System.out.println("삭제할 학생의 번호를 입력하세요.");
		int input=scan.nextInt();		
		pstmt.setInt(1, input);
		pstmt.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void group() {
	
	
}







}
