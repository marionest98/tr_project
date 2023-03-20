package com.test02;

public class Account {
	String account;
	int balance;
	double interestRate;

	Account() {}

	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	//매개변수로 받아온 값을 저장
	void setAccount(String account) {
		this.account = account;
	}
	//가지고 있는 값을 리턴
	String getAccount() {
		return account;
	}
	
	int getBalance() {
		return balance;
	}

	double calculateInterest() {
		return balance * interestRate * 0.01;
	}

	void deposit(int money) {
		balance += money;
	}

	void withdraw(int money) {
		balance -= money;
	}
}
