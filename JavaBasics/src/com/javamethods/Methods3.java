package com.javamethods;
import java.util.Scanner;
public class Methods3 {
	
	double balance = 20000.00;
	
	void CheckBalance() {
		System.out.println("Current Balance:"+balance);
	}
	
	void Deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount to Deposit:");
		int dep = sc.nextInt();
		balance = balance+dep;
		System.out.println("Your Total amount after Deposit:" + balance);
	}
	
	void Withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount to WithDraw:");
		int wit = sc.nextInt();
		balance = balance-wit;
		System.out.println("Your Total amount after WithDraw:" + balance);

}

	public static void main(String[] args) {
		Methods3 bank = new Methods3();
		System.out.println("Welcome to Axis Bank");
		bank.CheckBalance();
		bank.Deposit();
		bank.Withdraw();
		

	}

}
