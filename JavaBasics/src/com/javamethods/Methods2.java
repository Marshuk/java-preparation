package com.javamethods;

public class Methods2 {
	
	void PlanDetails() {
		System.out.println("Current Recharge Plan");
		System.out.println("Plan Name : unlimited 299" );
		System.out.println("Validity : 28 days");
		System.out.println("Data : 1.5 GB/day");
		System.out.println("Calls: Unlimited");

	}
	
	void Recharge(double amount) {
		if(amount>=299) {
			System.out.println("Recharge Successful");
			System.out.println("Recharge amount:"+amount);

			
		}
		else {
			System.out.println("Recharge Failed");
		}
	}

	public static void main(String[] args) {
		Methods2 plan = new Methods2();
		plan.PlanDetails();
		plan.Recharge(350);

	}

}
