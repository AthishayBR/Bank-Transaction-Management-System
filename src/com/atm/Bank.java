package com.atm;

public interface Bank {
	
	void deposit(int amount);
	void withdraw(int amount) throws RuntimeException;
	int checkBalance();
	
}