package com.deloitte.trg.service;

public class CertificateOfDeposit extends Account implements Transaction {
	private double balance;
	private int ownId;
	private String accType;
	public CertificateOfDeposit() {
	}
	public CertificateOfDeposit(int ownId,String name,double balance,String accType)
	{
		super(name,balance);
		this.accType=accType;
		this.ownId=ownId;
		this.balance=balance;
	}
	public void deposit(double balance) {
		this.balance=this.balance+balance;
	}
	public void withdraw(double balance) throws CreditUnionException {
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
