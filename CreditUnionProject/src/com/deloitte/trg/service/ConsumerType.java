package com.deloitte.trg.service;


public class ConsumerType extends MoneyMarket implements Transaction {
	private double balance;
	public ConsumerType() {
	}
	public ConsumerType(double balance) {
		this.balance = balance;
	}
	public void deposit(double balance) {
		this.balance=this.balance+balance;
	}
	public void withdraw(double balance) throws CreditUnionException{
			if(balance>750) {
			throw new CreditUnionException("Cant Withdraw > 750 from consumer");
		}
			
		this.balance=this.balance-balance;
		
		if(this.balance<0)
		{
			this.balance=this.balance+balance;
			throw new CreditUnionException("Insufficient Balance");
		}
	}
	public void transfer(Account a, double amount) {
		double bal1=a.getBalance();
		double tB=bal1+amount;
		a.setBalance(tB);
		this.balance=this.balance-amount;
}
	
}
