package test;

import java.util.Scanner;

public class Test {
	
	int gas;

	void setGas(int gas) {
		this.gas = gas;//2.호출받아 가스값 받고 가스 필드에 값을 대입 무조건작동
	}

	boolean isLeftGas() {
		if (gas == 0) {//4.호출받아 가스가0이면 가스값 없음 false, 0보다 많으면 있음 true를 보내줌 무조건작동
			System.out.println("gas가 없습니다");
			return false;
		} else {
			System.out.println("gas가 있습니다");
			return true;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	void run() {
		while (true) {//6.호출받아   가스가 0될때까지 반복 값에따라 작동안할수도있음
			if (gas >0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas 잔량:" + gas + ")");
				return;
			}
		}
	}
	
	
	
	
	
}
