package com.asahi.hms.insurance;

public class GoldPlan extends HealthInsurancePlan implements  INInsuranceBrand{
		
	public GoldPlan() {
		this.coverage = 0.8;
		this.planName = "gold";
		this.discount = 40.0;
	}

	@Override
	public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking) {
		// TODO Auto-generated method stub
		return 0;
	}
}
