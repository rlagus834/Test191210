package test;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		// 계좌번호 고객번호 이름 보유금액
		Scanner scan = new Scanner(System.in);
		List<Bank> list = new ArrayList<Bank>();
		boolean run = true;
		int count = 0;
		while (run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.계좌생성|2.입금|3.출금|4.송금|5.잔액조회|6.고객리스트|7.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("선택>");
			int choiceInput = scan.nextInt();
			if (choiceInput == 1) {
				System.out.println("계좌번호 입력>");
				int accountInput = scan.nextInt();
				System.out.println("이름 입력>");
				String nameInput = scan.next();
				System.out.println("충전할 금액 입력>");
				int moneyInput = scan.nextInt();
				Bank bank = new Bank(accountInput, count, nameInput, moneyInput);
				list.add(bank);
				System.out.println("현재 고객님의 번호는 " + count + " 입니다.");
				count++;
			} else if (choiceInput == 2 && count >= 1) {
				System.out.println("고객님의 계좌번호와 고객번호를 입력하세요.");
				System.out.println("계좌번호입력>");
				int accountInput = scan.nextInt();
				System.out.println("고객번호입력>");
				int clientNumber = scan.nextInt();
				if (list.get(clientNumber).getAccountNumber() == accountInput) {
					System.out.println("입금할 액수를 입력하세요>");
					int plusMoney = scan.nextInt();
					list.get(clientNumber).saveMoney(plusMoney);
					System.out.println("완료되었습니다 현재 남은잔액은" + list.get(clientNumber).getMoney() + " 원 입니다.");
				} else if (list.get(clientNumber).getAccountNumber() != accountInput) {
					System.out.println("잘못입력하셨습니다.");
				}
			} else if (choiceInput == 3 && count >= 1) {
				System.out.println("고객님의 계좌번호와 고객번호를 입력하세요.");
				System.out.println("계좌번호입력>");
				int accountInput = scan.nextInt();
				System.out.println("고객번호입력>");
				int clientNumber = scan.nextInt();
				if (list.get(clientNumber).getAccountNumber() == accountInput) {
					System.out.println("출금할 액수를 입력하세요>");
					int minusMoney = scan.nextInt();
					if (list.get(clientNumber).getMoney() < minusMoney) {
						System.out.println("잔액이 부족합니다.");
					} else {
						list.get(clientNumber).outMoney(minusMoney);
						System.out.println("완료되었습니다 현재 남은잔액은" + list.get(clientNumber).getMoney() + " 원 입니다.");
					}

				} else if (list.get(clientNumber).getAccountNumber() != accountInput) {
					System.out.println("잘못 입력하셨습니다");
				}
			} else if (choiceInput == 4 && count >= 2) {
				System.out.println("고객님의 계좌번호와 고객번호를 입력하세요.");
				System.out.println("계좌번호입력>");
				int accountInput = scan.nextInt();
				System.out.println("고객번호입력>");
				int clientNumber = scan.nextInt();
				if (list.get(clientNumber).getAccountNumber() == accountInput) {
					System.out.println("송금할 금액을 입력하세요.");
					int remittance = scan.nextInt();
					if (list.get(clientNumber).getMoney() < remittance) {
						System.out.println("잔액이부족합니다.");
					} else {
						System.out.println("송금할 대상의 계좌번호를 입력하세요.");
						int OtherAccountInput = scan.nextInt();
						for (int i = 0; i < list.size(); i++) {
							if (list.get(i).getAccountNumber() == OtherAccountInput) {
								list.get(clientNumber).outMoney(remittance);
								list.get(i).saveMoney(remittance);
							}

						}
						System.out.println("완료되었습니다 현재 금액은 " + list.get(clientNumber).getMoney() + " 입니다");
					}

				} else if (list.get(clientNumber).getAccountNumber() != accountInput) {
					System.out.println("잘못 입력하셨습니다.");
				}

			} else if (choiceInput == 5 && count >= 1) {
				System.out.println("고객님의 계좌번호와 고객번호를 입력하세요.");
				System.out.println("계좌번호입력>");
				int accountInput = scan.nextInt();
				System.out.println("고객번호입력>");
				int clientNumber = scan.nextInt();
				if (list.get(clientNumber).getAccountNumber() == accountInput) {
					System.out.println("현재 남은잔액은" + list.get(clientNumber).getMoney() + " 원 입니다.");
				} else if (list.get(clientNumber).getAccountNumber() != accountInput) {
					System.out.println("잘못입력하셨습니다.");
				}

			} else if (choiceInput == 6 && count >= 1) {
				System.out.println("현재 고객의 리스트입니다.");
				for (int i = 0; i < list.size(); i++) {
					System.out.println("계좌번호:  " + list.get(i).getAccountNumber() + "  이름 : " + list.get(i).getName()
							+ "  보유금액:  " + list.get(i).getMoney() + "  고유번호:  " + list.get(i).getClientNum());
				}
			} else if (choiceInput == 7) {
				System.out.println("종료되었습니다.");
				run = false;
			} else {
				System.out.println("잘못된 접근입니다.");
			}

		}

	}

}
