package com.asahi.hms.insurance;

public abstract class HealthInsurancePlan {
    // Code for 'coverage' field goes here
    public double coverage;
    
    public String planName;
    
    public double discount;
    
	// Don't worry about the below code and also the InsuranceBrand class
	private InsuranceBrand offeredBy;
	
	public abstract double computeMonthlyPremium(double salary, int age, boolean smoking);

	public InsuranceBrand getOfferedBy() {
		return offeredBy;
	}

	public void setOfferedBy(InsuranceBrand offeredBy) {
		this.offeredBy = offeredBy;
	}
	
	public double getCoverage() {
		return coverage;
	}

	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}
	
	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}
	
	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
