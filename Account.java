package com.citibank.domain;

public class Account {
	
	// Variables

	private int accountNumber;
	private String name;
	private double balance;
	
	//Constructors

	public Account() {
		System.out.println("Account class constructor called");
	}
	
	public Account(int accountNumber, String name, double balance) {
		System.out.println("Account Class First overloaded construcor");
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public Account(int accountNumber, String name) {
		System.out.println("Account Class Second Overloaded Constructor");
		this.accountNumber = accountNumber;
		this.name = name;
	}

	//Getters and Setters
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance = balance - amount;
			return true;
		}
		
		return false;
	}
	
	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		}
		return false;
	}

}
