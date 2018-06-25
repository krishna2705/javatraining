package com.asahi.hms.insurance;

public class BronzePlan extends HealthInsurancePlan implements  INInsuranceBrand {

	public BronzePlan() {
		this.coverage = 0.6;
		this.planName = "bronze";
		this.discount = 25.0;
	}
	
	public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
