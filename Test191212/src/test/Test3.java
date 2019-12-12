package test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int max = -2000000000;

		for (int i = 0; i < num.length; i++) {
			System.out.println("배열에들어갈 수 5개를 입력하세요");
			int a = scan.nextInt();
			num[i] = a;
			if (max < a) {
				max = a;
			}
		}
		System.out.println("가장큰값:"+max);

	}

}
