package test;

import java.util.Scanner;

public class Cal2 {

int sum(int input2,int input3) {
	int result=input2+input3;
	return result;
}
	
int subtrack(int input2,int input3) {
	int result=input2-input3;
	return result;
}
int ssum(int input2,int input3) {
	int result=input2*input3;
	return result;
}
int ssubtrack(int input2,int input3) {
	Scanner scan=new Scanner(System.in);
	input2=scan.nextInt();
	input3=scan.nextInt();
	return input2/input3;
}
	
	
	
	
}
