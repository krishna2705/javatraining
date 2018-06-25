package com.asahi.hms.billing;

public class PlatinumPlan extends HealthInsurancePlan {
		
	public PlatinumPlan() {
		this.coverage = 0.9;
		this.planName = "platinum";
		this.discount = 50.0;
	}
}
