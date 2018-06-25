package com.asahi.hms.insurance;

public class SilverPlan extends HealthInsurancePlan implements  INInsuranceBrand{
		
	public SilverPlan() {
		this.coverage = 0.7;
		this.planName = "silver";
		this.discount = 30.0;
	}

	@Override
	public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking) {
		// TODO Auto-generated method stub
		return 0;
	}
}
