package naver;

import java.util.*;

import javax.swing.Spring;

public class QuizMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> keys = new HashMap<String, String>();
		int count = 0;
		keys.put("chair", "의자");
		keys.put("desk", "책상");
		keys.put("water", "물");
		keys.put("pencil", "연필");
		keys.put("watch", "시계");

		Set<String> keyss = keys.keySet();
		Iterator<String> iterator = keyss.iterator();//주머니에 손을집어넣는동작
		while (iterator.hasNext()) {       //주머니에 뭐가있나없나 판별 true/false
			Scanner scan=new Scanner(System.in);
			String key = iterator.next();//집어서본걸 key라는 객체에 넣음
			System.out.println(key + "의뜻은?");
			String real = keys.get(key);
			String input =scan.next();

			if (input.equals(real)) {
				System.out.println("정답입니다");
				count++;
			} else {
				System.out.println("틀렸습니다 정답은" + real);
			}

		}
		System.out.println("총" + count + "개 정답입니다.");
		System.out.println("정답률은" + (double)((count*100)/keys.size())+"%");

	}

}
