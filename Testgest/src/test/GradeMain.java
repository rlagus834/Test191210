package test;

import java.util.*;

public class GradeMain {

	public static void main(String[] args) {
	
	
	
	Grade gr=new Grade();
	Scanner scan=new Scanner(System.in);
	int count=0;
	boolean run=true;
	
	while(run) {
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("1.학생등록|2.과목별 점수입력|3.점수리스트|4.과목별 최고점수|5.종료");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("선택>");
		int choiceInput=scan.nextInt();
		if(1==choiceInput) {
			gr.createInput();
			count++;
		}else if(2==choiceInput&&count>=1) {			
			gr.gradeInput();
			count++;
		}else if(3==choiceInput&&count>=2) {			
					gr.grade();								
		}else if(4==choiceInput&&count>=2) {			
			gr.max();
			}	
		else if(5==choiceInput) {
			System.out.println("종료되었습니다.");
			run=false;
		}else {
			System.out.println("잘못접근하셨습니다.");
		}
		
		
		
		
		
		
		
		
		
		
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
