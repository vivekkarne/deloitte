package com.deloitte.trg.service;
public class MoneyMarket extends Account {
	MoneyMarket a;
	private int ownId;
	private String accType;
	public MoneyMarket() {
	}
	public MoneyMarket(int ownId,String name,double balance,String accType,AccountTypeEnum e) {
	super(name,balance);
	this.ownId=ownId;
	this.accType=accType;
	switch(e) {
	case Consumer:
		a=new ConsumerType(balance);
		break;
	case Commercial:
		a=new CommercialType(balance);
		break;
	}
	
	}
	public int getOwnId() {
		return ownId;
	}
	public void setOwnId(int ownId) {
		this.ownId = ownId;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	
}
	
