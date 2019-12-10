package test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
int x=0,y=0;
System.out.println("4x+5y를 만족하는 숫자60의 모든해");
System.out.println("");
for(x=0;x<=15;x++){for(y=0;y<=12;y++) {

		if((4*x)+(5*y)==60){
			System.out.println("x값"+x);			
			System.out.println("y값"+y);
			System.out.println("");
		}
	
}

}


	}

}
