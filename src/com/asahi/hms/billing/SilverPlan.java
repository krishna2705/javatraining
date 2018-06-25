package com.asahi.hms.billing;

public class SilverPlan extends HealthInsurancePlan {
		
	public SilverPlan() {
		this.coverage = 0.7;
		this.planName = "silver";
		this.discount = 30.0;
	}
}
