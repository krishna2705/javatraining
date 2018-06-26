package com.asahi.hms.insurance;

public class GoldPlan extends HealthInsurancePlan{
		
	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return 0.07 * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
}
