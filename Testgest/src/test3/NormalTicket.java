package test3;

public class NormalTicket extends Ticket{

	 
	
	double sinYeongCard;
int count2;
	
	


public void sinYeongCard(int count2) {

	sinYeongCard=ticket*1.05;
	this.count2=count2;
	System.out.println("금액"+(int)sinYeongCard+"티켓번호"+count2);
	}	
	
public void realMoney(int count2) {
	this.count2=count2;
	System.out.println("금액"+ticket+"티켓번호"+count2);
	}


	
	
	
	
}
