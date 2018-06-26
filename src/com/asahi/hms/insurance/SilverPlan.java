package com.asahi.hms.insurance;

public class SilverPlan extends HealthInsurancePlan{
		
	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return 0.06 * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);	
	    
	}
}
