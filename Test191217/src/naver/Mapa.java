package naver;

import java.util.*;

public class Mapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//map객체
		Map<Integer,String>map=new HashMap<Integer,String>();
		//map 객체에 데이터 저장하기     @타입과같게 입력해줘야함 @순서가없다 그래서 표출할땐 반복자 써야함
		map.put(5, "가가가");		
		map.put(2, "나나나");
		map.put(3, "다다다");
		
		System.out.println(map.size());
		//키입력하면 해당 키의 데이터 나옴
		System.out.println(map.get(2));
		
		//map 객체의 모든 데이터 출력하기
		//key값을 set형태로 만들어서 set에서 사용하는반복자적용
		Set<Integer> keyValues=map.keySet();
		
		Iterator<Integer> iterator = keyValues.iterator();
		while(iterator.hasNext()) {
			int key=iterator.next();
			String value=map.get(key);
			System.out.println(key+":"+value);
			
		}
		
		
		
		
		
		
		
		
	}

}
