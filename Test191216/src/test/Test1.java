package test;

public class Test1 {

	public static void main(String[] args) {
		// 교육원에 다니는 훈련생에 대한 클래스를 만들고 메인 클래스에서 각자 같은줄에 앉은사람들에대한 
//		객체를 각각 선언해서 필드값 출력
Iciamember ic1=new Iciamember("김현",23,"남자");
System.out.println(ic1.toString());

Iciamember ic2=new Iciamember("김현",23,"남자");	
		ic2.name="유리";
	System.out.println(ic2);		
		
	}

}
