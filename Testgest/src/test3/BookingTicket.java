package test3;

public class BookingTicket extends Ticket{
	
	double i;
	
	int count1;

	

	
	
	public void i(int count1,int day) {
		this.count1=count1;
	 i=ticket*0.5;
	 System.out.println("금액"+(int)i+"번호"+count1+"날짜"+day);
	}
	
	public void ii(int count1,int day) {
		this.count1=count1;
		 i=ticket*0.8;
		 System.out.println("금액"+(int)i+"번호"+count1+"날짜"+day);
		}
	public void iii(int count1,int day) {
		this.count1=count1;
		 i=ticket*0.9;
		 System.out.println("금액"+(int)i+"번호"+count1+"날짜"+day);
		 
		}


	
}
