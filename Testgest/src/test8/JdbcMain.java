package test8;
import java.util.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JdbcMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list=new ArrayList<Student>();
		/*
		 * 1.DBConnection 클래스의 makeConnection 메소드 호출하여
		 * DB접속정보(con)를 가져옴
		 * 2.con 객체를 가지고 DBsql 클래스의 메소드 호출하여 원하는 쿼리문 실행
		 */
//Connection con =null;
//con=DBConnection.makeConnection();

DBsql sql=new DBsql();

/*
 * 1번 선택하면 전체조회,2번선택하면데이터 저장		
 */

Scanner scan=new Scanner(System.in);
Student sd=new Student();
System.out.println("0.DB접속1.전체조회,2.추가,3.삭제,4.입력시 데이터추가,5.입력추가,6.전체조회(arrayList),7.여자조건검색,8.주소인천,9.번호변경");
boolean run=true;
while(run) {
	int input=scan.nextInt();
	switch(input) {
	case 0:
		sql.dbConnection();
		break;
	case 1:
		sql.selectDB();
		break;
	case 2:
		sql.insertDB();
		break;
	case 3:
sql.delete();
break;
	case 5:
		sql.insertDB4(sd);
		break;
	case 6:
		//전체조회 메소드를 호출하여 호출결과를 가져옴	
	   list=sql.selectDB1();
	 
		break;
	case 7:
		sql.girl();
		break;
	case 8:
		sql.incheon();
		break;
	case 9:
		sql.updatePhone();
		break;
		
	}
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
		
		 
	

}

		
		//DB에서 조회한 전체 학생목록을 여기 위치에서 출력
		
		
		
	}

}



