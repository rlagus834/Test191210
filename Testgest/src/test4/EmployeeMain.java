package test4;

import java.util.Scanner;

public class EmployeeMain  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);


		
		System.out.println("이름|보너스|관리자수당|월급|1.월급 10%인상 2.20%인상 3.30%인상");
		String name=scan.next();
		int bonus=scan.nextInt();
		int sudang=scan.nextInt();
		int sal=scan.nextInt();
		int choice=scan.nextInt();
		Executive ex=new Executive(name,bonus,sudang,sal,choice);
		System.out.println(ex.toString());
		
		
		
		
	}

}
