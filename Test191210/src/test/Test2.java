package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("1번째숫자");
		boolean run = true;
		while (run) {
			num1 = scan.nextInt();
			if (num1 == 0) {
				run = false;
				System.out.println("0이입력되어 종료합니다");
			} else if (num1 % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}

		}

//정수를입력받아 홀수/짝수 출력 0입력되면 종료

	}

}
