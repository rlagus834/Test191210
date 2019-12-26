package test6;

public class RemoteControlMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Television tv=new Television();
tv.turnOn();
		tv.turnOff();
		tv.setVolume(5);
		tv.setMute(true);
	//Audio클래스를 RemoteControl의 구현클래스로 정의하여
		//메소드등을 정의하고
		//main클래스에서 다형성을적용하여
		//TV,Audio 객체를 만들어 메소드를 호출해보세요.
		Audio au=new Audio();
		au.turnOn();
		au.turnOff();
		au.setVolume(50);
		au.setMute(true);
		RemoteControl rc=new Television();
		rc.turnOn();
		rc.setVolume(50);
		rc.setMute(true);
		rc=new Audio();
		rc.turnOn();
		rc.setVolume(50);
		rc.setMute(true);
		RemoteControl.changeBattery();
		System.out.println(rc.MIN_VOLUMN);
	rc.setMute(true);
	rc.setVolume(50);
	
	InternetSearch is=new SmartTv();
	is.search("Sdsdsd");
	
	
	}

}
