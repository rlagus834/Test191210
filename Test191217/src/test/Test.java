package test;

import java.util.Scanner;

public class Test {
	int gas;
	void setGas(int input) {
		this.gas = input;//3.호출받아 가스값 받고 가스 필드에 값을 대입 무조건작동
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
	void input() {
		
		Scanner scan=new Scanner(System.in);
		int input=scan.nextInt();
		setGas(input);//2.gas값 대입
				boolean gasState=isLeftGas();//4.호출해서 호출값에따라 true값또는 false값이생긴후  gasstate에대입
				System.out.println(gas);//그냥 출력
				if(gasState) {//5.gasstate값이 true면 작동 아니면 작동안함 
					System.out.println("출발");
					run();//.6호출		
	}
				}	
	void run() {
		while (true) {//7.호출받아   가스가 0될때까지 반복 값에따라 작동안할수도있음
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
