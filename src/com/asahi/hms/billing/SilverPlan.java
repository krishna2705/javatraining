package com.asahi.hms.billing;

public class SilverPlan extends HealthInsurancePlan {
		
	public SilverPlan() {
		setCoverage(0.7);
		setDiscount(30.0);
	}
	
	public double getDiscount() {
		return super.getDiscount();
	}
}
