package test;

import java.util.Scanner;

public class Testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test ts=new Test();
Scanner scan=new Scanner(System.in);
int input=scan.nextInt();
ts.setGas(input);
		boolean gasState=ts.isLeftGas();
		System.out.println(ts.gas);
		if(gasState) {
			System.out.println("출발");
			ts.run();
		}
		
		
	}

}
