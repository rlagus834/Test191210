package test;

import java.util.*;

public class Bank {
//	고객번호,이름,계좌번호,잔액
	
	
	
	
	private int count;
	private String name;
	private String nnum;
	private int money;
	
	
	
	
	public int getCount() {
		return count;
	}




	public void setCount(int count) {
		this.count = count;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getNnum() {
		return nnum;
	}




	public void setNnum(String nnum) {
		this.nnum = nnum;
	}




	public int getMoney() {
		return money;
	}




	public void setMoney(int money) {
		this.money = money;
	}


public void saveMoney(int saveMoney) {
	money=money+saveMoney;	
}
	
public void outMoney(int outMoney) {
	money=money-outMoney;	
}
	

	public Bank(int count, String name,String nnum,int money) {
		this.count=count;
		this.name=name;
		this.nnum=nnum;
		this.money=money;
		
		
	}
	
}
