package test;

import java.util.Scanner;

public class CellPhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CellPhone ce = new CellPhone();
		CellPhone ce1 = new CellPhone("a", "b", "C");
		Scanner scan = new Scanner(System.in);
// CellPhone 클래스 객체 선언해서
//-부모클래스 필드값 출력
//-부모클래스 메소드 호출
//-자식클래스 필드값 출력
//-자식클래스 메소드 호풀
		System.out.println(ce.toString());
		System.out.println(ce1.toString());
		String message = scan.next();
		ce.powerOff(message);
		ce.powerOn(message);
		ce.receiveMessage(message);
		ce.sendMessage(message);
		ce.hangOff();
	}

}
