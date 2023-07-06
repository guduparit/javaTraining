package com.citibank.main;

import com.citibank.domain.Account;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Starts");
		
		// Object of account class
		
		Account account = new Account();
		
		//Set Account properties 
		
		account.setAccountNumber(101);
		account.setName("Gudu Kumar");
		account.setBalance(1000);
		
		//Get Account properties
		
		System.out.println("Account Number is: " + account.getAccountNumber());
		System.out.println("Account Name is: " + account.getName());
		System.out.println("Balance in the account is: " + account.getBalance());
		
		System.out.println("Main ends");
		
		

	}

}
