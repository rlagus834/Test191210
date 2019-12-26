package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
	
	/*
	 * 자바에서의 상속
	 * : 부모클래스의 필드, 메소드를 상속 받는것
	 * :부모클래스, 자식클래스가 존재함.
	 * 상송의 장점
	 * :코드 중복을 줄일 수있음
	 * :유지보수 편리
	 * :객체의 다형성 구현이 가능
	 * 유의사항
	 * :private으로 선언한 필드, 메소드는 상속불가능
	 * :부모 클래스와 자식 클래스의 소속 패키지가다르면
	 * default 접근제한자로 선언된 필드, 메소드는 접근이 불가능함.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 	
	 */
		
int a=scan.nextInt();
int count=a;		
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {	
				
				if(j==count) {
					for(int q=1;q<=j;q++) {
						System.out.print("*");
						
					}					
						count--;
					}else if(j<count) {
						System.out.print(" ");
						
					}
					
				}System.out.println("");				
			}	
			
			
		}
		
		
		
		
		
		
		
	}


