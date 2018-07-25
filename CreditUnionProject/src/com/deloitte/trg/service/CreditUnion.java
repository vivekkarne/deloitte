package com.deloitte.trg.service;
import java.util.Arrays;
public class CreditUnion {
private String creditUnionName;
private String address;
private Account[] a1;
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
	a1=new Account[a.length];
	for(int i=0;i<a.length;i++) {
		if(a[i] instanceof MoneyMarket)
		{
			a1[i]=a[i];
		}
		else if(a[i] instanceof CertificateOfDeposit)
		{
			a1[i]=a[i];
		}
	}
}
	@Override
	public String toString() {
	return "CreditUnion [creditUnionName=" + creditUnionName + ", address=" + address + ", a1=" + Arrays.toString(a1)+ "]";

}
}
