package com.asahi.hms.billing;

public class SilverPlan extends HealthInsurancePlan {
		
	public SilverPlan () {
		setCoverage(0.7);
	}
	
	public double computeMonthlyPremium(double salary) {
		return 0.06 * salary;
	}
}
