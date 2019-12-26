package test7;

public class Memo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String메소드  String은 변수타입이기전에 클래스이다 
		String str="자바는 재밌따";
//String도 클래스라 그안에있는 메소드들이 있는데 그(메소드ㅜ)기능들을알아보자		
	//String 변수 글자수 리턴
System.out.println(str.length());		
		//일부 문자 교체 메소드
String newStr=str.replace("자바", "java");
//타입 집어넣을변수 저장되있는변수 .replace("기존글자","바꿀글자")		
System.out.println(newStr);
System.out.println(str);		
	
//글자 잘라내기 메소드	
		String str2=str.substring(0, 1);  //오라클 SUBSTR함수 같이  몇번째자리에서 시작할껀지 어디까지 읽어낼지 정하는것
		System.out.println(str2);
		String str3=str.substring(2); // 정한자리이후만 출력하는것
		System.out.println(str3);
		//대소문자 변경 메소드
		String str4="abcdEFGHijklMN";
		String str4Lower=str4.toLowerCase();//소문자로만 바꾸기 
				System.out.println(str4Lower);
				String str4Upper=str4.toUpperCase();//대문자로만 바꾸기
				System.out.println(str4Upper);
		//공백제거 메소드
				String str5="     자바";
				String str6="java    ";
				String str7="   이클립스       ";
				String str8=str5.trim()+str6.trim()+str7.trim();//공백제거 @문자에서의 +는 연결
				String str9=str5+str6+str7;
				System.out.println(str8);
				System.out.println(str9);
				
				
				
				
	}

}
