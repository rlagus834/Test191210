package test7;

public interface Phone {
boolean keyPad=true;
boolean keyPad1=false;	
	
	default void setCall(boolean call) {
	if(call) {
		System.out.println("전화를 겁니다");
	}else {
		System.out.println("전화를 받습니다");
	}
}
	
	
	
	
}
