package test;

public class Bank {
//계좌번호 고객번호 이름 보유금액 
	private int accountNumber;
	private int clientNum;
	private String name;
	private int money;
	
	public Bank(int accountNumber,int clientNum,String name,int money) {
		this.accountNumber=accountNumber;
		this.clientNum=clientNum;
		this.name=name;
		this.money=money;		
	}

	public void saveMoney(int saveMoney) {
		money=money+saveMoney;
	}
	
	public void outMoney(int outMoney) {
		money=money-outMoney;
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getClientNum() {
		return clientNum;
	}

	public void setClientNum(int clientNum) {
		this.clientNum = clientNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	
	
	
	
	
	
}
