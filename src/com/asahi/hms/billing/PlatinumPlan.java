package com.asahi.hms.billing;

public class PlatinumPlan extends HealthInsurancePlan {
		
	public PlatinumPlan() {
		setCoverage(0.9);
		setDiscount(50.0);
	}
	
	public double getDiscount() {
		return super.getDiscount();
	}
}
