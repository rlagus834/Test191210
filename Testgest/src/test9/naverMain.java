package test9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class naverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		List<Naver> list=new ArrayList<Naver>();
		Scanner scan = new Scanner(System.in);
		DBConnection dbc = new DBConnection();
		DBsql sql = new DBsql();
		try {
		while (run) {
			System.out.println("1.접속연결|2.회원가입|3.정보변경|4.회원탈퇴|5.관리자기능|6.종료");
			int input = scan.nextInt();
			switch (input) {
			case 1:
				sql.Connetion();
				break;
			case 2:
				sql.joinMembership();
				break;
			case 3:
				System.out.println("1.비밀번호변경|2.이름변경|3.생일변경|4.이메일변경|5.전화번호변경|6.성별변경");
				
				int inputChoice = scan.nextInt();
			
				if (1 == inputChoice) {
					sql.membershipInformationPassword();
					break;
				} else if (2 == inputChoice) {
					sql.membershipInformationName();
					break;
				} else if (3 == inputChoice) {
					sql.membershipInformationBirth();
					break;
				} else if (4 == inputChoice) {
					sql.membershipInformationEmail();
					break;
				} else if (5 == inputChoice) {
					sql.membershipInformationPhone();
					break;
				} else if (6 == inputChoice) {
					sql.membershipInformationGender();
					break;
				}else {
					System.out.println("잘못입력하셨습니다");
					break;
				}
			case 4:
				sql.deleteMembership();
				break;
			case 5:
				list=sql.selectAll2();
				System.out.println("아이디입력");
				String input1=scan.next();
				System.out.println("비밀번호입력");
				String input2=scan.next();
//				if(list.get(0).getId().equals(input1)&&list.get(0).getPassword().equals(input2)) {		
					for(int i=0;i<list.size();i++) {
						System.out.println(list.get(i));
					}
			
//		}else {
//			System.out.println("잘못입력하셨습니다");
//		}
				break;
			case 6:
				System.out.println("종료");
				run = false;
			}

		}}catch(java.util.InputMismatchException e) {
			System.out.println("잘못 입력하셨습니다");
		}catch(java.lang.NullPointerException f) {
			System.out.println("접속연결 먼저하십시오");
		}

	}

}
