  
package test10;

import java.util.Scanner;

public class BankSystemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StartMenu sql=new StartMenu();
		boolean run=true;
	Scanner scan=new Scanner(System.in);
		
	sql.Connection();
	while(run) {
		System.out.println("1.회원등록|2.로그인|3.종료");		
		int input=scan.nextInt();
		switch(input) {
		case 1:
			sql.join();
			break;
		case 2:
			sql.login();
			break;
		case 3:
			run=false;			
		}
		
		
		
		
	}
		
	
		
		
		
		
	}

}