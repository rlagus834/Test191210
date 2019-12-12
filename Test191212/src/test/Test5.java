package test;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// 향상된 for문 (advanced for)(foreach문)
//int[] num= {3,4,1,2,5};
// for(int a:num) {
//	 System.out.println(a);
// }
//값이5개있는String배열을 선언하고 FOREACH를 이용하여
//배열에담긴 모든데이터출력
//String[] num=new String[5];
//num[0]="가";
//num[1]="나";
//num[2]="다";
//num[3]="라";
//num[4]="마";
//for(String a:num) {
//	System.out.println(a);
//}
Scanner scan=new Scanner(System.in);		
int num[]= {
		1,2,3,4,5,6,7,8,9,10
};
int count=0;
System.out.println("숫자입력");
int b=scan.nextInt();
for(int a:num) {
	count++;
	if(a==b) {
		System.out.println("숫자"+b+"자리는"+count+"번째자리에있습니다");		
	}	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
