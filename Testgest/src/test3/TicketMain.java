package test3;

import java.util.Scanner;

public class TicketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
		Ticket ti=new Ticket();
		BookingTicket bt=new BookingTicket();
NormalTicket nt=new NormalTicket();	
int count1=0, count2=0;
int day=scan.nextInt();
nt.realMoney(count2);
nt.sinYeongCard(count2);
if(day>=30) {
	bt.i(count1,day);	
}else if(day>=10) {
	bt.ii(count1,day);	
}else if(day>=5) {
	bt.iii(count1,day);	
}



		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
