package com.deloitte.trg.service;

public abstract class Account {
	private String owner;
	private double balance;
	public Account() {}
	public Account(String owner, double balance) {
		super();
		this.owner = owner;
		this.balance = balance;
	}
	public abstract int getOwnId();
	public abstract void setOwnId(int ownId);

	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public abstract String getAccType();
	public abstract void setAccType(String accType);
}


