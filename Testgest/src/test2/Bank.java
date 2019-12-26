package test2;

public class Bank extends hanguk{

	public double oubank(int input) {
		return input*0.015;
		
	}
	public double gukbank(int input) {
		return input*0.016;
		
	}
	public double hanabank(int input) {
		return input*0.014;
		
	}
	
	public void input(int input) {

System.out.println(input+"원");
System.out.println("한국은행금리"+hanbank(input)+"원");
System.out.println("국민은행금리"+gukbank(input)+"원");
System.out.println("하나은행금리"+hanabank(input)+"원");
System.out.println("우리은행금리"+oubank(input)+"원");

	}
	
}
