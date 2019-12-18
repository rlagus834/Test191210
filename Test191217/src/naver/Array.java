package naver;

import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *collection Framework ()
 *list
 *순서(인덱스)를 유지하고 저장할 수 있음
 *중복저장 가능
 *
 *set
 *저장데이터의 순서가 없음.
 *중복저장이 불가능
 *
 *map
 *key(인덱스대신 각각의객체를 구별할수있음),value의 쌍으로 저장.
 *key값은 중복 불가능
 *
 *
 *
 *
 *
 *
 *
 */
	//list 객체 선언	@List가 상위개념이라 가능 ArrayList써도됨 근데 List가 일반적 
		List<String> list =new ArrayList<String>();
		/*
		 * <> :Generic 일일히 타입바꾸기번거로워서 이걸쓰면 간편하게 타입변경가능
		 * 타입변환을 하지 않고도 데이터를 사용할 수 있게 해줌
		 */
		List list1=new ArrayList();
		//ArrayList 객체에 데이터 저장
		//Object
		list1.add("아아앙");			
		System.out.println(list1.get(0));
		//list 객체에 데이터 저장
		list.add("가가가가");
		list.add("나나나나");
		list.add("다다다다");
		list.add("마마마마");
		//해당자리에 데이터추가 @해당자리에 들어가서 기존 데이터와 뒤에있는데이터가앞으로 밀려감
		list.add(1, "라라라라");
		list.add(1, "마마마마");
		
		//이런식으로 추가하면 마지막자리에 추가됨
		list.add("사사사");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		//list 데이터 삭제 @해당자리 데이터 지우고 앞으로 당겨져온다
		list.remove(1);
		//맨마지막 중복데이터 부터 삭제
		list.remove("마마마마");
		//싹다지움
		list.clear();
		//list의크기출력
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(i+1+"번째데이터:"+list.get(i));
		}
		
		
		
		
		//ArrayList를 선언하여 member 객체들을 저장하고 각 객체의 id필드값을 출력하시오.
		
	}

}
