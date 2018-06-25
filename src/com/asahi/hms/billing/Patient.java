package com.asahi.hms.billing;

public class Patient extends User{

	private HealthInsurancePlan insurancePlan;
	
	public Patient(){
		
	}
	
	public HealthInsurancePlan getInsurancePlan() {
		return insurancePlan;
	}

	public void setInsurancePlan(HealthInsurancePlan plan) {
		this.insurancePlan = plan;
	}
	
}
