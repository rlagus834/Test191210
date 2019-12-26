package test8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
//static메소드
	public static Connection makeConnection(){
		//DB 접속정보저장을 위한 Connection 변수선언
		Connection con=null;
		//접속할DB의 계정정보
		String user="HN";
		String password="1234";
		
		//접속할 DB의 주소정보            @jdbc:oracle:thin:주소 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		//ojdbc6파일을 현재소스에 적용
		try {                           
			Class.forName("oracle.jdbc.driver.OracleDriver");  // ?
			System.out.println("DB접속성공");
			con=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("DB드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB접속 실패");
			e.printStackTrace();
		}
				
		//DB접속이 정상적으로 되면 접속상태를 리턴해줌
		return con;
	}
	
	
	
}
