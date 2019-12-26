package test8;
//쿼리문을 모아놓은 클래스
import java.sql.*;
import java.util.Scanner;

public class DBsql {
//DB접속
Connection con=null;
//쿼리문 전송을 위한 변수 선언
PreparedStatement pstmt=null;
//조회(SELECT)결과를 저장하기 위한 변수 선언
	ResultSet rs=null;
	
	//student 테이블 전체조회 메소드
public void selectDB(Connection con) {
	//실행하고자 하는 쿼리문을 String 변수로 지정
	String sql="SELECT * FROM STUDENT";
	
	try {
		//접속한 DB에 쿼리문을 전송할  준비
		pstmt=con.prepareStatement(sql);
		//쿼리문을 실행하고 실행결과를 rs에저장
		rs=pstmt.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getString("studentno"));
			System.out.print(rs.getString("name"));
			System.out.print(rs.getString("age"));
			System.out.print(rs.getString("address"));
			System.out.print(rs.getString("gender"));
			System.out.println(rs.getString("phone"));			
		}
	} catch (SQLException e) {
		
		
		e.printStackTrace();
	}
}
	//STUDENT 테이블에 데이터 추가
public void insertDB(Connection con) {
	String sql="INSERT INTO STUDENT VALUES(6,'학생6',11,'강원도 강릉시','남성','010-7777-7777')";

	
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.executeUpdate();
			System.out.println("DB에 저장성공");
			int result=pstmt.executeUpdate(); //0 1만나옴
			System.out.println("insert결과"+result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
}


public void insertDB2(Connection con) {
	String sql="INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
	try {
		pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, 10);//물음표의순서 처음은 1부터시작
		pstmt.setString(2, "낌현");
		pstmt.setInt(3, 23);
	    pstmt.setString(4, "청학동");
		pstmt.setString(5, "남성");
		pstmt.setString(6, "010-7347-5797");
		pstmt.executeUpdate();
		
		
		
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void insertDB3(Connection con) {
	String sql="INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
	try {
		pstmt=con.prepareStatement(sql);
		Scanner scan=new Scanner(System.in);
		System.out.println("1.학생번호|2.이름|3.나이|4.주소|5.성별|6.전화번호 차례대로쓰세요");
		for(int i=1;i<=6;i++) {
			if(i==1&&i==3) {
				int input=scan.nextInt();
				
				pstmt.setInt(i, input);
			}else {
				String inputs=scan.next();
				pstmt.setString(i, inputs);
			}
					
			
		}pstmt.executeUpdate();
		
		
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
}



	
	
	
	
}
