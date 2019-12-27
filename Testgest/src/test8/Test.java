package test8;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		int a,b,c=0;

		a=scan.nextInt();
		for(int i=1;i<=a;i++){
		b=scan.nextInt();
		    c=c+b;
		}

		System.out.println(c);
	}

}
