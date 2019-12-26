package test;

public class Phone {
//필드 선언

	String model;

	@Override
	public String toString() {
		return "Phone [model=" + model + ", color=" + color + "]";
	}

	public Phone() {

	}

	String color;

	// 메소드선언(전화 걸기, 전화 끊기, 통화하기)
	public void hongOn() {
		System.out.println("전화를겁니다");
	}

	public void hangOff() {
		System.out.println("전화를끕니다");
	}

	public void call() {
		System.out.println("통화를합니다");
	}

}
