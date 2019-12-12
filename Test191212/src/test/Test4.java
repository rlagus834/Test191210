package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		//
//		27.배열사이즈를5로 지정후
//
//		배열에 들어간 수가 오름차순이 되게 하세요
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int w=0;
		int dlqfur=0;
		for (int a = 0; a < num.length; a++) {
			dlqfur = scan.nextInt();
			num[a] = dlqfur;
			
		}

		for (int b = 0; b < num.length; b++) {
			for (int c = b + 1; c < num.length; c++) {
				if (num[b] > num[c]) {
                    w=num[c];
                    num[c]=num[b];
                    num[b]=w;                    
				}
			}
		}System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		
		
		
	}
}
