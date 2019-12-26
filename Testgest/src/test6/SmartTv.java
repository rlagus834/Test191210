package test6;

public class SmartTv implements RemoteControl, InternetSearch{
	
	private int volumn;
	private String volume;

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
		System.out.println("현제 tv볼륨"+this.volume);
	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url);
	}
	
	
	

}
