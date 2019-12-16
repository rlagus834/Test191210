package test;

public class Calculator {
//메소드 선언        메소드란?기능을 담당하는 블록
	//예제 ) 덧셈 뺄셈 나눗셈 곱셈메소드 각각선언
	//리턴 메소드  조건값에충촉하는 값이 리턴되어 호출된다
	int sum(int num1,int num2) {
		
		int result=num1+num2;
		System.out.println("Calculator클래스"+result);
		return result;
//		 
		
	}
	//보이드 메소드 리턴되지않고 값이 호출안됨
	void sum1(int num1,int num2,int num3) {
		int result =num1+num2+num3;
		System.out.println("Calculator클래스"+result);
	}
	

}
