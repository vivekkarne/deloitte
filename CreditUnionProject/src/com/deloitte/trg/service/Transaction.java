package com.deloitte.trg.service;

public interface Transaction {
	void deposit(double balance);
	void withdraw(double balance);
	void transfer(Account a, double amount);
}
