package test9;

import java.util.Scanner;

public class naverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		DBConnection dbc = new DBConnection();
		DBsql sql = new DBsql();
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
				System.out.println("비밀번호를 입력하세요");
				int password = scan.nextInt();
				if (password == 7347) {
					sql.selectAll();
					break;
				} else {
					System.out.println("잘못입력하셨습니다");
					break;
				}
			case 6:
				System.out.println("종료");
				run = false;
			}

		}

	}

}
