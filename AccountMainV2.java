package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Account;

public class AccountMainV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create Account object 
		
		Account account = new Account();
		
		Scanner scanner = new Scanner(System.in);
		
		//Get User Input
		System.out.println("Enter Account Number");
	
		int number = scanner.nextInt();
		
		System.out.println("Enter Name of Account Holder");
		
		String nam = scanner.next();
		
		System.out.println("Enter Opening Balance");
		
		double balc = scanner.nextDouble();
		
		//Set Account details 
		
		account.setAccountNumber(number);
		account.setName(nam);
		account.setBalance(balc);
		
		//Get the Account details 
		
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Name: " + account.getName());
		System.out.println("Balance: " + account.getBalance());
		

	}

}
