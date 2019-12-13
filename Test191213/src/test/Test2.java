package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
//		 2차원 배열(표처럼 5x5같은..)
//		int[][] number =new int[2][3];
//		       행 열 
//		int[][] number1 =new int[3][3];
//		System.out.println(number.length); 전체행크기수보기
//		System.out.println(number[0].length);0번째 행의 열 크기수보기 
//		System.out.println(number[1].length);
//		System.out.println(number1.length);
//		for(int i=0;i<number.length;i++) {
//			for(int j=0;j<number[1].length;j++){
//				System.out.println(number[i][j]);
//			}
//		}
//		2차원배열에서 데이터를 주는 방법
//		int[][] number2={
//		                   {1,2,3},
//		                    {4,5,6}           };
//		for(int i=0;i<number2.length;i++) {
//			for(int j=0;j<number2[i].length;j++) {
//				System.out.print(number2[i][j]);
//			}System.out.println(" ");
//		}
//		
//		학점계산하기
//		4년간의 학기별 학점을 입력후 총평점구하기
		int[][] num=new int[4][2];
		Scanner scan=new Scanner(System.in);
		int input,sum=0;
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.println((i+1)+"년"+(j+1)+"학기 학점을 입력하세요.");
				input=scan.nextInt();
				num[i][j]=input;
				sum+=input;
			}
		}System.out.println("총평점:"+sum);
		
		
		
		
		
		
		
		
		
		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
