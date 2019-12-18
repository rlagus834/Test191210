package naver;

import java.util.*; //다 선택 스캐너든 뭐든

public class Seta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set객체선언(주머니= 넣긴넣는데 뭐가 출력될진모름)@순서가없다
		Set<String> set =new HashSet<String>();
		//Set객체에 데이터 저장
		set.add("가가가");
		set.add("나나나");
		set.add("다다다");
//		set 크기확인 (중복된걸 포함 안시킴 그래서 4개인데도 3개라나옴)
		set.add("다다다");
		System.out.println(set.size());
		
//		set에 저장된 데이터 출력하기(반복자) @현재상태(여기까지 줄의 상태만 보고 반복)		
		Iterator<String> iterator = set.iterator();//주머니 뒤지는..
		while(iterator.hasNext()) {//담겨있으면 표출해줌
			System.out.println(iterator.next());
		}
		
		
		//set에담긴데이터삭제 @순서가 없으니 데이터를 써야함
		set.remove("다다다");
		iterator = set.iterator();//주머니 뒤지는..
		while(iterator.hasNext()) {//담겨있으면 표출해줌
			System.out.println(iterator.next());
		}
		
		
	}

}
