package com.asahi.hms.insurance;

public class HMSBillingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User("u100", "staff", "one", "staff@test.com", "Test street", 56, true);
		
		Staff staff = new Staff();
		staff.setSalary(10000.0);
		//InsuranceBrand insuranceBrand = new BlueCrossBlueShield();
		HealthInsurancePlan insurancePlan = new PlatinumPlan();
				
		//insurancePlan.setOfferedBy(insuranceBrand);
		//staff
	}

}
