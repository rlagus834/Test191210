package test7;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int dab=0;
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
if(a>b&&a>c) {
	if(b>c) {
		dab=b;
	}else {
		dab=c;
	}
}else if(b>a&&b>c) {
	if(a>c) {
		dab=a;
	}else {
		dab=c;
	}
}else if(c>a&&c>b){
	if(a>b) {
		dab=a;
	}else {
		dab=b;
	}
			
}else if(a==b&&a==c&&c==b){
	
}System.out.println(dab);
	

	

		
		
		
		
	}

}
