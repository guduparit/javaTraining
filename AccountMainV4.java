package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Account;

public class AccountMainV4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Accept Account and name from user
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Account Number");
		
		int accNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Account Name");
		String accName = scanner.nextLine();
		
		//Setting Account and Name
		Account account = new Account(accNumber, accName);
		
		//Display Account and name
		
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Name: " + account.getName());
		System.out.println("Balance: " + account.getBalance());
		
		//Accept User Option 
		
		System.out.println("Enter Your Choic");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Balance Inquiry");
		System.out.println("4. Exit");
		
		int choice = scanner.nextInt();
	 while(choice != 4) {
		switch (choice) {
		case 1: 
			System.out.println("Enter the amount to withdraw");
			double amtWithraw = scanner.nextDouble();
			if(account.withdraw(amtWithraw))
				System.out.println("Transaction Success");
			else
				System.out.println("Transaction failed");
			break;
		case 2: 
			System.out.println("Enter the amount to Deposit");
			double amtDeposit = scanner.nextDouble();
			if(account.deposit(amtDeposit))
				System.out.println("Transaction Success");
			else
				System.out.println("Transaction failed");
			break;
		case 3: 
			System.out.println("Current Balance is: " + account.getBalance());
			break;
		
		default: 
			System.out.println("Invalid Choice");
			
		}
		
		System.out.println("Enter Your Choic");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Balance Inquiry");
		System.out.println("4. Exit");
		choice = scanner.nextInt();
	 }
		System.out.println("You Exited the application");
		}
		

	}

