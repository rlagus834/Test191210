package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] num = new int[3];
//		Scanner scan = new Scanner(System.in);
//		int a, b = 0, c,sum=0;
//		boolean run = true;
//		System.out.println("------------------------------------------------");
//		System.out.println("0:0번데이터,1:1번데이터,2:2번데이터,3:합계,4:평균,5:종료");
//		System.out.println("------------------------------------------------");
//		while (run) {
//			a = scan.nextInt();
//			 if (2 == a) {
//				b = scan.nextInt();
//				num[a]=b;
//				sum+=b;
//			} else if (1 == a) {
//				b = scan.nextInt();
//				num[a]=b;
//				sum+=b;
//			} else if (0 == a) {
//				b = scan.nextInt();
//				num[a]=b;
//				sum+=b;
//			}else if(3==a){
//				System.out.println(sum);
//			}else if(4==a){
//				System.out.println(sum/num.length);
//			}else if(5==a) {
//				System.out.println("종료합니다");
//				run=false;
//			}else {
//				System.out.println("잘못입력합니다");
//			}
//
//
//		}
//for문써서해보기
		int sum=0,a;
Scanner scan=new Scanner(System.in);
int[] num=new int[3];
for(int i=0;i<=2;i++) {
	a=scan.nextInt();
 num[i]=a;
sum+=a;
	
}System.out.println(sum);
System.out.println(sum/num.length);
		
		
		
		
	}

}
