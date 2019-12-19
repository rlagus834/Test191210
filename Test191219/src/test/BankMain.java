package test;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*
		 * 은행프로그램
		 * 1.고객등록을할수있다
		 * 1.1생성자를 이용한방법
		 * 1.2 getter,setter 이용한 방법
		 * 2.예금기능을 수행할 수있다
		 * 3.출금기능을 수행할수있다
		 * 3.1잔액이0원미만이면 출금 불가능 메세지 출력한다
		 * 4.잔액 확인을 할수있다
		 * 5.고객정보
		 * -고객번호,이름,계좌번호,잔액
		 *6.고객정보는 ArrayList에저장한다 
		 */
		boolean run=true;
		int count=-1,count1=0,save=0;
		
		List<Bank> list=new ArrayList<Bank>();
		while(run) {
			System.out.println("1.관리자 접근|2.은행 이용|3.시스템종료|4.계정목록");
			int input=scan.nextInt();
			if(1==input) {
				System.out.println("1.고객정보등록|2.회원목록");				
				int input99=scan.nextInt();
				if(input99==1) {
				System.out.println("비밀번호를 입력하세요");
				int sysinput=scan.nextInt();
				if(sysinput==7347) {
					count1++;
					count++;
					System.out.println("고객정보를 등록하세요");										
					System.out.println("고객이름");
					String input2=scan.next();
					System.out.println("고객계좌번호");
					String input3=scan.next();
					System.out.println("고객잔액");
					int input4=scan.nextInt();
					Bank bk=new Bank(count,input2,input3,input4);
					list.add(bk);					
					System.out.println("고객님의 고객번호는"+count+"입니다");					
				}else {
					System.out.println("잘못된접근입니다");
				}}else if(input99==2&&count1>=1) {
					for(int i=0;i<list.size();i++) {
						System.out.println("회원이름:"+list.get(i).getName()+"   보유금액:"+
					list.get(i).getMoney()+"  계좌번호:"+list.get(i).getNnum()+"  고객번호:"+list.get(i).getCount());
					}
				}else {
					System.out.println("잘못된접근입니다");
				}
			}else if(2==input&&count1>=1) {
				System.out.println("고객번호를입력하세요");
				int input02=scan.nextInt();				
				System.out.println("계좌번호를 입력하세요");				
				String input03=scan.next();
				if(list.get(input02).getNnum().equals(input03)) {
					System.out.println("1.예금|2.출금|3.송금|4.잔액확인|5.시스템종료");
					int input04=scan.nextInt();
					if(1==input04) {
						System.out.println("얼마를 예금하시겠습니까?");
						int input05=scan.nextInt();
						list.get(input02).saveMoney(input05);
					}else if(2==input04) {
						System.out.println("얼마를 출금하시겠습니까?");
						int input06=scan.nextInt();
						 if(list.get(input02).getMoney()<input06){
							System.out.println("잔액이부족합니다.");
							}else {
								list.get(input02).outMoney(input06);
							}
					}else if(3==input04) {						
						System.out.println("송금할 고객의 고객번호와 계좌번호를 입력하세요");
						System.out.println("고객번호");
						int input08=scan.nextInt();
						System.out.println("계좌이체번호를입력하세요");
						String input09=scan.next();
						if(list.get(input08).getNnum().equals(input09)) {
						System.out.println("송금할 금액을 입력하세요");
						int input11=scan.nextInt();
						if(list.get(input02).getMoney()<input11){
							System.out.println("잔액이부족합니다.");
							}else {
									list.get(input02).outMoney(input11);	
									list.get(input08).saveMoney(input11);
								}
						
							}}
						
					
					else if(4==input04) {
						System.out.println("현재 잔액은"+list.get(input02).getMoney()+"원입니다");
					}else if(5==input04) {
						System.out.println("이용해주셔서 감사합니다.");
						run=false;
					}
					
					else {
						System.out.println("잘못된접근입니다.");
					}
					
					
				
				
			}else if(3==input) {
				System.out.println("종료하였습니다.");
				run=false;
			}else {
				System.out.println("잘못된접근입니다");
			}
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		}
		
	}

}
