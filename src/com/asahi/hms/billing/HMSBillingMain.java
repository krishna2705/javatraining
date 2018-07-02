package com.asahi.hms.billing;

public class HMSBillingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HealthInsurancePlan insurancePlan = new PlatinumPlan();
		insurancePlan.setDiscount(25.0);
		Patient patient = new Patient();
		patient.setInsurancePlan(insurancePlan);
		double[] payments = Billing.computePaymentAmount(patient, 1000.0);
		
	}

}
