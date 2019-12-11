package test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// up&down 범위는 1~100
Scanner scan=new Scanner(System.in);
int a,b,c=0;

b=(int)(Math.random()*100)*1;
boolean run=true;
System.out.println("1~100숫자를적으세요");
while(run) {
	
	a=scan.nextInt();
	c++;
	if(a==b) {
		run=false;
		System.out.println("맞췄습니다 답은"+a);
		
	}else if(a>b){
		System.out.println(a+"보다작습니다");
	}else {
		System.out.println(a+"보다큽니다");
	}
		
}System.out.println("시도횟수는"+c);








	}

}
