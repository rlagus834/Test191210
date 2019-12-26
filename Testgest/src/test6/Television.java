package test6;
//구현클래스 (인터페이스를 구현한 클래스)
public class Television implements RemoteControl{
//필드선언
	private int volumn;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("tv를켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("tv를끕니다");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>RemoteControl.MAX_VOLUMN) {
			this.volumn=RemoteControl.MAX_VOLUMN;
		}else if(volume<RemoteControl.MIN_VOLUMN) {
			this.volumn=RemoteControl.MIN_VOLUMN;
		}else {
			this.volumn=volume;
		}
		System.out.println("현제 tv볼륨"+volume);

	}
	
	@Override
	public void setMute(boolean mute) {
		
	}

		
	
	
}
