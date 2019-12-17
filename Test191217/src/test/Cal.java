package test;

import java.util.Scanner;

public class Cal {

	int add(int input1, int input2) {
		int result = input1 + input2;
		return result;
	}

	double avg(int result) {
		double avg = result / 2;
		System.out.println(avg);
		return avg;
	}

	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자");
		int input1 = scan.nextInt();
		System.out.println("두번째 숫자");
		int input2 = scan.nextInt();
		int result = add(input1, input2);
		avg(result);
	} 

}
