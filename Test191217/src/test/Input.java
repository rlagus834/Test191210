package test;

import java.util.Scanner;

public class Input {
	Test ts=new Test();
	
	
	void input(){
	Scanner scan=new Scanner(System.in);
	int input=scan.nextInt();
	ts.setGas(input);//1.gas값 대입
			boolean gasState=ts.isLeftGas();//3.호출해서 호출값에따라 true값또는 false값이생긴후  gasstate에대입
			System.out.println(ts.gas);//그냥 출력
			if(gasState) {//4.gasstate값이 true면 작동 아니면 작동안함 
				System.out.println("출발");
				ts.run();//.5호출
}
			}
}