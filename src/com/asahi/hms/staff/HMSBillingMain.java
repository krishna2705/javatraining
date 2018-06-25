package com.asahi.hms.staff;

public class HMSBillingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HealthInsurancePlan plan = new PlatinumPlan();
		double payment = plan.computeMonthlyPremium(1000.0);
		System.out.println(payment);
	}

}
