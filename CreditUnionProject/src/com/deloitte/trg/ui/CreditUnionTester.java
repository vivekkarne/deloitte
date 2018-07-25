package com.deloitte.trg.ui;

import org.apache.log4j.Logger;

import com.deloitte.trg.service.Account;
import com.deloitte.trg.service.AccountTypeEnum;
import com.deloitte.trg.service.CertificateOfDeposit;
import com.deloitte.trg.service.CreditUnion;
import com.deloitte.trg.service.CreditUnionException;
import com.deloitte.trg.service.MoneyMarket;

public class CreditUnionTester {
	private static Logger mL=Logger.getLogger(CreditUnionTester.class);
	public static void main(String[] args) {
	try {	CreditUnion creditUnion = new CreditUnion();
		creditUnion.setCreditUnionName("BrightStar");
		creditUnion.setAddress("some address");
		MoneyMarket mm1 = new MoneyMarket(101,"Smith",250000,"Money Market",AccountTypeEnum.Consumer);
		MoneyMarket mm2 = new MoneyMarket(102,"Jones",350000,"Money Market",AccountTypeEnum.Commercial);
		MoneyMarket mm3 = new MoneyMarket(103,"Avinash Chandra",650000,"Money Market",AccountTypeEnum.Commercial);
		CertificateOfDeposit cd1 = new CertificateOfDeposit(501,"Timberlake",5000,"Certificate of Deposit");
		CertificateOfDeposit cd2 = new CertificateOfDeposit(502,"Laxmi",10000,"Certificate of Deposit");
		Account [] bankAccounts=new Account[5];
		bankAccounts[0]=mm1; bankAccounts[1]=mm2; bankAccounts[2]=mm3;
		bankAccounts[3] =cd1;bankAccounts[4]=cd2;
		creditUnion.setAccounts(bankAccounts);
		System.out.println(creditUnion);
		}
	catch(CreditUnionException e)
	{
			mL.fatal("Caught CreditUnionException", e);
	}
	}
}
