package com.asahi.hms.billing;

public class BronzePlan extends HealthInsurancePlan{

	public BronzePlan () {
		setCoverage(0.6);
	}
	
	public double computeMonthlyPremium(double salary) {
		return 0.05 * salary;
	}
}
