package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int d = 0;
		for (int i= 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
					if(num[i]>num[j]) {
						d=num[j]; 
						num[j]=num[i]; 
						num[i]=d;
					}
							
				}
			
		}
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
			
		
		
		
		
		
		
		
		
		
		
			
	}	
			}
