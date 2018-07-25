package com.deloitte.trg.service;

public class CreditUnion {
private String creditUnionName;
private String address;
private Account[] a1=new Account[100];
public CreditUnion() {
}
public CreditUnion(String creditUnionName, String address) {
	super();
	this.creditUnionName = creditUnionName;
	this.address = address;
}
public String getCreditUnionName() {
	return creditUnionName;
}
public void setCreditUnionName(String creditUnionName) {
	this.creditUnionName = creditUnionName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public void setAccounts(Account[] a) {
	for(int i=0;i<a.length;i++) {
		if(a[i] instanceof MoneyMarket)
		{
			a1[i]=new MoneyMarket();
		}
		else if(a[i] instanceof CertificateOfDeposit)
		{
			a1[i]=new CertificateOfDeposit();
		}
	}
}
}
