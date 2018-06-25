package com.asahi.hms.billing;

public class GoldPlan extends HealthInsurancePlan{
		
	public GoldPlan() {
		this.coverage = 0.8;
		this.planName = "gold";
		this.discount = 40.0;
	}
}
