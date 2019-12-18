package naver;

import java.util.*;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		String max1 = null;
		List<String> lists = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("단어를 몇개 비교할건가요?:");
		int input1 = scan.nextInt();
		for (int i = 0; i <= input1; i++) {
			System.out.println("단어를입력하세요");
			String input = scan.next();
			lists.add(input);
		}
		for (int i = 0; i <= input1; i++) {
			if (max < lists.get(i).length()) {
				max = lists.get(i).length();
				max1 = lists.get(i);
			}
		}
		System.out.println(lists);
		System.out.println("가장긴단어는:" + max1);

	}

}
