package test7;

import java.util.*;

public class Memo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayList를 선언해서 Exception을 발생시켜보세요
List<String> list=new ArrayList<String>();

		
		//예외처리
/*tryCatch(
 * 
 * 
 * 		
 */
//		쓰는법	
//		try {
//			
//		}catch(에러내용 별칭) {
//			
//		}
		try {list.add("sdsd");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println("예외가 발생했습니다.");
			e.printStackTrace();//에러내용이 뭔지 출력
		}finally {//에러가 있든없든 무조건나온다 말그대로 @써도되고 안써도됨 
			System.out.println("무조건나와요");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
