package test7;

public interface MobilePhone extends Phone{

	
	
default void setMessage(boolean setMessage) {
	if(setMessage) {
		System.out.println("문자를 보냅니다");
	}else {
		System.out.println("문자를 받습니다");
	}
}
	
	
	
	
}
