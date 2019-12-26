package test6;

public class Audio implements RemoteControl{
private int volume;
private int volumn;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("오디오 켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("오디오 끕니다");
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
		System.out.println("현제 audio볼륨"+this.volume);
		
	}

	
	
	
	
	
	
	
	
}
