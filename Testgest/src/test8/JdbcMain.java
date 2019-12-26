package test8;

import java.sql.Connection;
import java.util.Scanner;

public class JdbcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1.DBConnection 클래스의 makeConnection 메소드 호출하여
		 * DB접속정보(con)를 가져옴
		 * 2.con 객체를 가지고 DBsql 클래스의 메소드 호출하여 원하는 쿼리문 실행
		 */
Connection con =null;
con=DBConnection.makeConnection();

DBsql sql=new DBsql();
/*
 * 1번 선택하면 전체조회,2번선택하면데이터 저장		
 */

Scanner scan=new Scanner(System.in);
System.out.println("1.전체조회,2.데이터추가,3.데이터추가(?사용),4.입력시 데이터추가");
while(true) {
	int input=scan.nextInt();
	switch(input) {
	case 1:
		sql.selectDB(con);
		break;
	case 2:
		sql.insertDB(con);
		break;
	case 3:
		sql.insertDB2(con);
		break;
	case 4:
		sql.insertDB3(con);
		break;
		
	}


	sql.selectDB(con);	
}

		
		
		
		
		
		
	}

}



