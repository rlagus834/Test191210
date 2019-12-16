package test;

import java.util.Scanner;

public class Cal1main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Cal1 c1=new Cal1();
		int input2=0,input3=0;
while(true) {
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	System.out.println("1.덧셈|2.뺄셈|3.곱셈|4.나눗셈|5.종료");
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	
	int input1=scan.nextInt();
	if(1==input1) {
	c1.sum(input2,input2);

	}else if(2==input1) {
		c1.subtract(input2,input3);	
	}else if(3==input1) {
		c1.multiply(input2,input3);
	}else if(4==input1) {
		c1.divide(input2,input3);
	}else if(5==input1) {
		System.out.println("종료");
		break;
	}else {
		System.out.println("잘못된접근입니다.");
	}
	
	
	
	
	
	
	
	
}
		
		
		
	}

}
