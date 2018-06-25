package com.asahi.hms.staff;

public class PlatinumPlan extends HealthInsurancePlan {
	
	public PlatinumPlan () {
		setCoverage(0.9);
	}
	
	public double computeMonthlyPremium(double salary) {
		return 0.08 * salary;
	}
}
