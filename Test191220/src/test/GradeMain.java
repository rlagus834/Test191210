package test;

import java.util.*;

public class GradeMain {

	public static void main(String[] args) {
		List<Grade> list = new ArrayList<Grade>();

		Scanner scan = new Scanner(System.in);
		int javaMaxScore = 0, serveltMaxScore = 0, springMaxScore = 0, count = 0,countNumber=0;
		boolean run = true;
		Grade gr = null;
		while (run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.학생등록|2.과목별 점수입력|3.점수리스트|4.과목별 최고점수|5.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("선택>");
			int choiceInput = scan.nextInt();
			if (1 == choiceInput) {
				gr = new Grade();
				count++;
				countNumber++;
				gr.setStudentNumber(countNumber);
				System.out.println("학생 정보를 입력하세요.");
				System.out.println("이름:");
				String nameInput = scan.next();
				gr.setName(nameInput);
				System.out.println("생년월일:");
				String birthInput = scan.next();
				gr.setBirth(birthInput);
				System.out.println("주소:");
				String addressInput = scan.next();
				gr.setAddress(addressInput);
				System.out.println("전화번호:");
				int phoneNumber = scan.nextInt();
				gr.setPhoneNumber(phoneNumber);
				System.out.println("학과:1.컴퓨터 2.전자 3.정보통신 4.경영");
				int major = scan.nextInt();
				if(major==1) {
					//enum쓰는법
					//major 필드에 컴퓨터공학 저장
					gr.setMajor(Major.전자공학과);
				}else if(major==2) {
					//major 필드에 컴퓨터공학 저장
					gr.setMajor(Major.정밀기계과);
				}
				list.add(gr);
			} else if (2 == choiceInput && count >= 1) {
				System.out.println("학생이름을 입력하세요");
				String nameInput = scan.next();
				count++;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(nameInput)) {
						System.out.println("java 점수:");
						int javaScore = scan.nextInt();
						list.get(i).setJavaScore(javaScore);
						System.out.println("servlet 점수:");
						int servletScore = scan.nextInt();
						list.get(i).setServletScore(servletScore);
						System.out.println("spring 점수:");
						int springScore = scan.nextInt();
						list.get(i).setSpringScore(springScore);
					}
				}

			} else if (3 == choiceInput && count >= 2) {
				System.out.println(list.toString());
			} else if (4 == choiceInput && count >= 2) {
				System.out.println("과목을 선택하세요.");
				System.out.println("1.java | 2.servelt | 3.spring");
				int gradeChoiceInput = scan.nextInt();
				if (1 == gradeChoiceInput) {
					for (int i = 0; i < list.size(); i++) {
						if (javaMaxScore < list.get(i).getJavaScore()) {
							javaMaxScore = list.get(i).getJavaScore();

						}

					}
					System.out.println(javaMaxScore);
				} else if (2 == gradeChoiceInput) {
				gr.serveltMax(list);

					
					System.out.println(serveltMaxScore);
				} else if (3 == gradeChoiceInput) {
					for (int i = 0; i < list.size(); i++) {
						if (springMaxScore < list.get(i).getSpringScore()) {
							springMaxScore = list.get(i).getSpringScore();
						}

					}
					System.out.println(springMaxScore);
				} else {
					System.out.println("잘못입력하셨습니다.");
				}
			} else if (5 == choiceInput) {
				System.out.println("종료되었습니다.");
				run = false;
			} else {
				System.out.println("잘못접근하셨습니다.");
			}

		}

	}

}
