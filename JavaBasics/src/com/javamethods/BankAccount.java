package com.javamethods;

public class BankAccount {
	
	static void displayAccount(){
		System.out.println("Acc No:"+234567890);
		System.out.println("Holder Name:"+"Mohammed Marshuk");
		System.out.println("Account Type:" + "Savings");
		System.out.println("Account Balance:"+25000);
		
}

	public static void main(String[] args) {
		displayAccount();
		BankAccount ba = new BankAccount();
		System.out.println(ba.bank());
		
		
	}
	
	
	int bank() {
		int a = 10;
		int b = 20;
		int sum = a+b;
		return sum;
	}

}


