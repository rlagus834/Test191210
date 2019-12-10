package test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c, sum = 0, sum2 = 0;
		System.out.println("숫자입력");
		b = scan.nextInt();
		for (a = 1; a <= b; a++) {
			if (a % 2 != 0&&a % 3 != 0) {
				
					
					sum+=a;
					
				
			}

		}System.out.println(sum);

	}

}
