package test1;

public class Computer extends Calculator{
/*
 * 리턴타입이 int인 calculation 메소드 정의
 * 매개변수는 정수 2개, 정수2개의 평균값을 리턴
 * 
 * 
 * Override:메소드재정의
 * 
 * @를 해서 뭔갈하는걸 어노테이션이라고함(Annotation)
 */
	@Override
	
	public int calculation(int input1,int input2) {
		super.calculation(input1, input2);
		return (input1+input2)/2;
		 
	}
}
