  
package test1;

import java.io.IOException;
import java.util.Scanner;

public class MonopolyMain {

	public static void main(String[] args) throws IOException {
		DBsql sql = new DBsql();
		
		
		boolean start=true;
		Scanner scan= new Scanner(System.in);
		// 게임과 DB를 연결해주는 메서드
		
		while(start) {
			System.out.println("1.시작및초기화  2.게임시작 3.종료");
			
			int command=scan.nextInt();
			
			if(command==1) {
			
				sql.connection();				
				sql.AutoCommitOff();
				
				//게임에서 턴을 반복하는 메서드
								
				
			}
			if(command==2) {
				//DB 초기화 롤백 메서드
				sql.TurnRepeat();
				
			}
			if(command==3) {
			
				start=stop();
				
			}	
				
		}
	}
	public static boolean stop(){
		System.out.println("게임 종료");
		return false;
	}

}