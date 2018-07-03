package com.asahi.hms.billing;

public class GoldPlan extends HealthInsurancePlan{
		
	public GoldPlan () {
		setCoverage(0.8);
	}
	
	public double computeMonthlyPremium(double salary) {
		return 0.07 * salary;
	}
}
