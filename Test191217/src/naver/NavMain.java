package naver;

import java.util.ArrayList;
import java.util.List;

public class NavMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Navermember array[]=new Navermember[3];
		
		Navermember na4=new Navermember();
		Navermember na=new Navermember("rlagus834","zxcv5797",
				"김현","19970405","남",
				"rlagus834@naver.com","01073475797");
				
		array[0]=na4;
		array[0].setId("sd");
		

		Navermember na1=new Navermember("rlagus84","zxcv5797",
				"김현","19970405","남",
				"rlagus834@naver.com","01073475797");
				
			System.out.println(na.toString());
		
			//id 필드에 저장된값 getter메소드이용하여출력하기
		na.setEmail("유리");
		System.out.println(na.getEmail());
				
		
		
		System.out.println(array[0]);
		System.out.println(array[0].getId());
		 
		
		
List<Navermember>memberList=new ArrayList<Navermember>();
		memberList.add(na);
		memberList.add(na1);
		
		
		for(int i=0;i<memberList.size();i++) {
			System.out.println(memberList.get(i).getId());
		}
		
		
	}

	
	

}
