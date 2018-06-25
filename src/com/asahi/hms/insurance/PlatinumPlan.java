package com.asahi.hms.insurance;

public class PlatinumPlan extends HealthInsurancePlan implements  INInsuranceBrand{
		
	public PlatinumPlan() {
		this.coverage = 0.9;
		this.planName = "platinum";
		this.discount = 50.0;
	}

	@Override
	public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking) {
		// TODO Auto-generated method stub
		
		return 0;
	}
}
