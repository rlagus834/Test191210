package test6;

public interface RemoteControl {
/*인터페이스
 * 1.인터페이스는 main코드와 객체간의 접점역할을함.
 * 
 * 2.객체의 다형성을 구현하는데 용이함
 * 
 * 3.인터페이스의 구성 요소
 * 
 *  3.1상수 필드만 선언이 가능함
 *  일반적인 필드로 선언해도 컴파일 과정에서
 *  static final이 자동으로 붙은
 *  
 *  3.2추상메소드를 가짐.
 *  
 *  3.3디폴트 메소드 가짐.@디폴트=접근제한자 다른곳에 재정의(set)하여 쓸수는있다만 디폴트보다 높은 접근제한자(public)를 써야함 
 *  기본으로 실행내용까지 가지고있는 메소드
 *  
 *  3.4정적(static) 메소드가짐.
 *  인터페이스를 객체화하지않고도 직접 호출가능
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
	
//필드선언 (상수되버림)
	int MAX_VOLUMN = 10;
int MIN_VOLUMN = 0;
//메소드 선언 
void turnOn();
void turnOff();
void setVolume(int volume);
//default 메소드선언
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거합니다");
		}else {
			System.out.println("음소거해제합니다");			
		}
			
	}
//static 메소드 선언
	static void changeBattery(){
		System.out.println("건전지를 교환해주세요");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
