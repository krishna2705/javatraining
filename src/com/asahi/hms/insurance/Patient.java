package com.asahi.hms.insurance;

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
