package com.asahi.hms.insurance;

public class HMSBillingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User staff = new User();
		InsuranceBrand insuranceBrand = new BlueCrossBlueShield();
		HealthInsurancePlan insurancePlan = new PlatinumPlan();
				
		insurancePlan.setOfferedBy(insuranceBrand);
		staff.setInsurancePlan(insurancePlan);
		insurancePlan.computeMonthlyPremium(5000, 56, true);
	}

}
