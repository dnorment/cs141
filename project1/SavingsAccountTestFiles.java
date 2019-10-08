//Daniel Norment
//CS141
//Project 1 - Savings Account
//5 April 2017

import java.io.*;
import java.util.Scanner;

public class SavingsAccountTestFiles {

	public static void main(String[] args) throws IOException{
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter the savings account's annual interest rate: ");
		double rate = scnr.nextDouble();
		SavingsAccount account = new SavingsAccount(500, rate);

		Scanner deposits = new Scanner(new File("Deposits.txt"));
		while (deposits.hasNextDouble()){
			account.deposit(deposits.nextDouble());
		}
		deposits.close();

		Scanner withdrawals = new Scanner(new File("Withdrawals.txt"));
		while (withdrawals.hasNextDouble()){
			account.withdraw(withdrawals.nextDouble());
		}
		withdrawals.close();

		double interestEarned = account.getBalance() * account.getInterestRate() / 12;
		System.out.printf("Interest earned: $%.2f%n", interestEarned);
		account.addInterest();
		System.out.printf("Ending balance: $%.2f%n", account.getBalance());
	}

}
