package test;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		//

		Scanner scan = new Scanner(System.in);
		int[] num = { 500, 100, 50, 10 };
		int[] sum = new int[num.length];
		int input = 0;
			while (true) {	System.out.println("금액입력");
			input = scan.nextInt();
			for (int i = 0; i < num.length; i++) {
				sum[i] = input / num[i];
				input = input % num[i];
				System.out.println(num[i]+"동전:" + sum[i] + "개");}
			
			

		}

	}

}
