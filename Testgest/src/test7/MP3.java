package test7;

public interface MP3 {

	default  void music(boolean music) {
		if(music) {
			System.out.println("음악을 재생합니다.");
		}else {
			System.out.println("음악을 정지합니다.");
		}
	}
	
	
	
	
}
