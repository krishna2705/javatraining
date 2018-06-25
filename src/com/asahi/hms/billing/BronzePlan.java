package com.asahi.hms.billing;

public class BronzePlan extends HealthInsurancePlan{

	public BronzePlan() {
		this.coverage = 0.6;
		this.planName = "bronze";
		this.discount = 25.0;
	}
	
}
