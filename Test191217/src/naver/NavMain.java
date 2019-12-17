package naver;

public class NavMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Navermember na=new Navermember("rlagus834","zxcv5797",
				"김현","19970405","남",
				"rlagus834@naver.com","01073475797");
				
			System.out.println(na.toString());
		
			//id 필드에 저장된값 getter메소드이용하여출력하기
			System.out.println(na.getId());
				
		
		
		
		
		
	}

}
