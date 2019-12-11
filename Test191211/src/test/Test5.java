package test;

public class Test5 {

	public static void main(String[] args) {

////		배열(array):같은타입의 데이터를 하나의 변수에 저장하는구조
////		배열선언 쓰는법
////		타입[] 배열이름 or 타입 배열이름[]
////		예
//		int[] number;
//		int[] number1;
////		배열을 선언하면서 값을주기
//		int[] number2 = {1, 2, 3};
////		number2 배열의 첫번째칸에 저장된값 출력
//		System.out.println(number2[0]);
//		System.out.println(number2[1]);
//		System.out.println(number2[2]);
//		System.out.println(number2[3]);
////		index()=n번째 위치?
////				@0번부터시작
//		
//	String[] name= {
//			"ㅁㅁㅁ","ㄴㄴㄴㄴ","ㅁㅁㅁㅁ","ㄴㄴ"
//	};System.out.println(name[0]);
//		
//for문을 이용해서 name 배열에 저장된값을 모두 출력해보세요		
//	int a;	
//		String[] name= {
//				"ㅁㅁㅁ","ㄴㄴㄴㄴ","ㅁㅁㅁㅁ","ㄴㄴ"
//		};	
////for(a=0;a<=3;a++) {
////	System.out.println(name[a]);
////}
//
////		변수배열의 수 조회
//for(a=0;a<name.length;a++) {
//	System.out.println(name[a]);
//}
//		double sum = 0, count = 0;
//		int[] num = { 1, 2, 3, 4 };//index(위치):3,length(크기):4 
		//@한번선언하면 자리크기를 늘리는건 불가
//
//		for (int i = 0; i < num.length; i++)
//			sum += num[i];
//		{
//			System.out.println(sum);
//		}
//		System.out.println(sum / num.length);
	//배열선언하면서 크기만 지정하기	
		int[] num= new int[3];   
//		System.out.println(num.length);
//        System.out.println(num[0]);  index(위치):2
//        System.out.println(num[1]);
//        System.out.println(num[2]);
        
        num[0]=5;
        num[1]=7;
        num[2]=100;
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        
        
        
        
        
        
        
	}

}
