package com.asahi.hms.billing;

public class HMSBillingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HealthInsurancePlan insurancePlan = new PlatinumPlan();
		Patient patient = new Patient();
		patient.setInsurancePlan(insurancePlan);
		double[] payments = Billing.computePaymentAmount(patient, 1000.0);
		//System.out.printf("Payments ====================>> ", payments);
	}

}
