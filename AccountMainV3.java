package com.citibank.main;

import com.citibank.domain.Account;

public class AccountMainV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Version 3 Main Start");
		
		//Constructor with three args
		
		Account account = new Account(101, "Gudu Kumar", 2000);
		
		System.out.println(account.getName());
		
		//Constructor with two Args
		
		Account account2 = new Account(102, "Dipesh Shukla");
		
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getName());
		System.out.println(account2.getBalance());
		
		System.out.println("Deposit 2000");
		
		boolean result = account2.deposit(2000);
		
		if (result)
			System.out.println("Transaction Success");
		else
			System.out.println("Transaction False");
		
		System.out.println("Balance After Deposit: " + account2.getBalance());
		
		System.out.println("Withdraw 1000");
		
		result = account2.withdraw(1000);
		
		if (result)
			System.out.println("Transaction Success");
		else
			System.out.println("Transaction False");
		
		System.out.println("Balance after withdrawal: " + account2.getBalance());
		
		System.out.println("Version 3 main ends");

	}

}
