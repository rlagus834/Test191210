package test10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

public static Connection makeConnection(){
	Connection con=null;
	String user="HN191231";
	String password="1234";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection(url, user, password);
		System.out.println("접속완료");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}