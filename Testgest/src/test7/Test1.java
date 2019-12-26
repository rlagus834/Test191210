package test7;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "100";
		String str2= "a100";
//형변환 비슷한것      @integer int보다큰 클래스 타입

	
		try {
			System.out.println(str1+str2);
			int num1=Integer.parseInt(str1);
			System.out.println(num1);
			System.out.println(num1+num1);
			int num2=Integer.parseInt(str2);
		}catch(java.lang.NumberFormatException a) { //그냥 입셉션만 써도됨
			System.out.println("문자가 들어가있어서 숫자로 변환이 불가능합니다.");
			a.printStackTrace();
			
			
			
		}
	}

}
