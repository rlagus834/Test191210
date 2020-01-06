package 개인;

import java.util.*;

public class BuleMarbleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBsql sql = new DBsql();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		sql.connection();
		sql.AutoCommitOff();
		while (run) {
			System.out.println("1.게임시작,2.종료");
			int input = scan.nextInt();
			switch (input) {
			case 1:
				
				System.out.println("게임할사람a 입력");
				String playInputA = scan.next();
				System.out.println("게임할사람b 입력");
				String playInputB = scan.next();
				sql.join(playInputA, playInputB);
				while(run) {
				System.out.println("이긴사람이 먼저시작");
				System.out.println(playInputA + "님 1.가위 2.바위 3.보");
				int inputA = scan.nextInt();
				System.out.println(playInputB + "님 1.가위 2.바위 3.보");
				int inputB = scan.nextInt();
				if (inputA == inputB) {
					System.out.println("비겼습니다.");
				} else if (inputA == 1 && inputB == 3) {
					System.out.println(playInputA + "가 이겼습니다.");
					sql.start(playInputA,playInputB);
					run = false;
				} else if (inputA == 2 && inputB == 3) {
					System.out.println(playInputB + "가 이겼습니다.");
					sql.start(playInputB,playInputA);
					run = false;
				} else if (inputA == 1 && inputB == 2) {
					System.out.println(playInputB + "가 이겼습니다.");
					sql.start(playInputB,playInputA);
					run = false;
				} else if (inputA == 3 && inputB == 2) {
					System.out.println(playInputA + "가 이겼습니다.");
					sql.start(playInputA,playInputB);
					run = false;
				} else if (inputA == 2 && inputB == 1) {
					System.out.println(playInputA + "가 이겼습니다.");
					sql.start(playInputA,playInputB);
					run = false;
				} else if (inputA == 3 && inputB == 1) {
					System.out.println(playInputB + "가 이겼습니다.");
					sql.start(playInputB,playInputA);
					run = false;
				}
				}
				break;
			case 2:
				run = false;
				break;

			}
		}
	}

}
