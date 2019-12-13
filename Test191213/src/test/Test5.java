package test;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
//		 형변환
//		특정타입의 변수가 다른타입의 변수로 변환되는것
//1.자동형변환(promotion)
//크기가 작은 타입이 큰 타입으로 변환
//
//2.강제형변환(casting)
//		크기가 큰타입을 작은 타입으로 변환
//		
//byte byteValue=10;
//int intValue=10;
//double doubleValue=10;
//		byte타입의 변수를 int 타입의 변수에저장
//		intValue=byteValue;
//		 int가 더커서 대입이 안되므로 강제변환을시켜야함 
//		byteValue=(byte) intValue;
//		정수에 실수를 대입하려다보니 안되므로 강제변환해야함 
//		intValue=(int)doubleValue;		

		Scanner scan = new Scanner(System.in);
		int[] num = { 500, 100, 50, 10 };
		boolean run = true;
		int sum, sum1, sum2, sum3, sum4;

		while (run) {
			System.out.println("금액입력");
			int input = scan.nextInt();
			sum1 = input / num[0];
			sum = input % num[0];
			sum2 = sum / num[1];
			sum = sum % num[1];
			sum3 = sum / num[2];
			sum = sum % num[2];
			sum4 = sum / num[3];

			System.out.println("500원동전:" + sum1 + "개");
			System.out.println("100원동전:" + sum2 + "개");
			System.out.println("50원동전:" + sum3 + "개");
			System.out.println("10원동전:" + sum4 + "개");
			
		}

	}
}
