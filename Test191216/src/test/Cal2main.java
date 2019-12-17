package test;

import java.util.Scanner;

public class Cal2main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cal2 ca=new Cal2();
int input2=0,input3=0;
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("입력");
			int input1=scan.nextInt();
			if(input1==1) {
				input2=scan.nextInt();
				input3=scan.nextInt();
				System.out.println(ca.sum(input2, input3));
			}else if(input1==2) {
				input2=scan.nextInt();
				input3=scan.nextInt();
				System.out.println(ca.subtrack(input2, input3));
			}else if(input1==3) {
				input2=scan.nextInt();
				input3=scan.nextInt();
				System.out.println(ca.ssum(input2, input3));
			}else if(input1==4) {				
				System.out.println(ca.ssubtrack(input2, input3));
			}else if(input1==5) {
				System.out.println("종료");
				break;
			}




			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
