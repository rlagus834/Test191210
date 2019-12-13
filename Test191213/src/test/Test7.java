package test;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] num=null;
		int[] save=null ;
		int input2,max=0,avg=0,save1=0,count=0;
		while(true) {
			System.out.println("--------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("--------------------------------------");
			System.out.println("선택>");
			int input1=scan.nextInt();		
			if(1==input1) {
				System.out.println("학생수>");
				input2=scan.nextInt();
				num=new int[input2];
				save=new int[input2];
				count++;
			}else if(2==input1 && count>1) {				
				for(int i=0;i<num.length;i++) {
					System.out.println(i+1+"번째학생점수:");
					input2=scan.nextInt();					
					save[i]=input2;
					avg+=input2;
					if(max<input2) {
						max=input2;
					}
				}				
			}else if(3==input1 &&count>1){
				for(int i=0;i<num.length;i++) {
					System.out.println(i+1+"번째학생점수:"+save[i]);										
				}				
			}else if(4==input1 &&count>1) {
				System.out.println("최고점수:"+max);
				System.out.println("평균:"+((double)avg/num.length));
				for(int j=0;j<num.length;j++) {					
					for(int k=j+1;k<num.length;k++) {												
						if(save[j]<save[k]) {														
							save1=save[j];
							save[j]=save[k];
							save[k]=save1;							
						}
					} 
					System.out.println(save[j]);
				}
			}else if(5==input1) {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("잘못된접근입니다.");
			}
			
			
			
			
			
			
			
		}

	}

}
