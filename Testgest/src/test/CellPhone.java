package test;
/*
 * Phone:부모클래스
 * CellPhone:자식클래스
 * 
 *public class 자식클래스 extends 부모클래스{
 *}
 *
 */

public class CellPhone extends Phone {

	String button;
	String message;

	// 생성자
	// 매개변수 button, model, color를 매개변수로하는 생성자 선언
	CellPhone() {

	}

	CellPhone(String button, String model, String color) {
		this.button = button;
		this.model = model;
		this.color = color;
	}

	@Override
	public String toString() {
		return "CellPhone [button=" + button + ", message=" + message + ", model=" + model + ", color=" + color + "]";
	}

	void sendMessage(String message) {
		System.out.println("메시지 전송:" + message);
	}

	void receiveMessage(String message) {
		System.out.println("메시지 전송:" + message);
	}

	void powerOn(String message) {
		System.out.println("메시지 전송:" + message);
	}

	void powerOff(String message) {
		System.out.println("메시지 전송:" + message);
	}

}
