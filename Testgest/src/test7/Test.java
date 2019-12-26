package test7;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * 
		 * 
		 * 
		 * 나눗셈 계산에서 분모가 0일때 발생하는
		 * 예외(Exception)확인 후 이 예외에 대한
		 * 예외처리를 할 수 있는 코드를 작성해보세요.
		 * 예외 발생시 "0으로 나눌 수 없습니다." 출력
		 * 
		 */
		try {
			for(int i=0;i<=4;i++) {
				int a=i/0;
				System.out.println(a);
			}			
		}catch(java.lang.ArithmeticException a){
			System.out.println("0으로 나눌수 없습니다");
			a.printStackTrace();
		}
		
		
		
		
		
		
	}

}
