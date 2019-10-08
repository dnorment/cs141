//Daniel Norment
//CS141
//Project 1 - Savings Account
//5 April 2017

public class SavingsAccount {

	private double balance;
	private double interestRate; //annual

	public SavingsAccount(double bal, double intRate){
		balance = bal;
		interestRate = intRate;
	}

	public void withdraw(double amount){
		balance -= amount;
	}

	public void deposit(double amount){
		balance += amount;
	}

	public void addInterest(){ //monthly (annual/12)
		balance += balance * interestRate / 12;
	}

	public double getBalance(){
		return balance;
	}

	public double getInterestRate(){ //annual
		return interestRate;
	}

	public static void main(String[] args){

	}
}
