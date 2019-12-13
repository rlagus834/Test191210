package test;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input;
		int count = 0, avg = 0;
		String[][] var = { { "diamond", "spade", "cola" }, { "king", "queen", "jack" } };
		String[][] var1 = { { "다이아몬드", "스페이드", "콜라" }, { "왕", "여왕", "잭" } };
		for (int i = 0; i < var.length; i++) {

			for (int j = 0; j < var[i].length; j++) {
				System.out.println((count + 1) + "문제:" + var[i][j] + "의뜻은무엇인가요?");
				input = scan.next();
				count++;
				if (input.equals(var1[i][j])) {
					avg++;
					System.out.println("정답입니다");
				} else {
					System.out.println("틀렸습니다 정답은" + var1[i][j] + "입니다");
				}
			}

		}
		System.out.println("총" + avg + "개" + "정답입니다");
		System.out.println("정답률은" + (avg * 100) / (var.length * var[0].length) + "%" + "입니다");

	}

}
