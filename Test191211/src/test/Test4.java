package test;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
		int a, b, c, d, sum = 0;
		boolean run = true;
		while (run) {
			System.out.println("-----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------------");
			System.out.println("선택>");
			a = scan.nextInt();
			if (a == 4) {
				run = false;
				System.out.println("프로그램이종료되었습니다.");
				
			} else if (a == 1) {
				System.out.println("예금액>");
				b = scan.nextInt();
				sum += b;
				System.out.println("예금처리완료");
				System.out.println("잔액>" + sum);
			} else if (a == 2) {
				System.out.println("출금액>");
				b = scan.nextInt();
				if (sum < b) {
					System.out.println("잔액이 부족합니다.");
				} else {
					sum -= b;
					System.out.println("출금처리완료");
					System.out.println("현재 잔액은" + sum + "입니다.");
				}
			} else if (a == 3) {
				System.out.println("현재 잔액은" + sum + "입니다.");
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}

}
