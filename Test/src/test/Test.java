package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int a,b=0;
double sum=0;
Scanner scan=new Scanner(System.in);
System.out.println("숫자");
boolean run=true;

while(run) {
	a=scan.nextInt();

	
	if(a==0) {
		run=false;
		
	}else {
		b++;
		sum+=a;
	}
}System.out.println(sum/b);
	
	}

}
