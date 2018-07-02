package com.asahi.hms.billing;

public class Billing {
	   
    public static double[] computePaymentAmount(Patient patient, double amount) {
        double[] payments = new double[2];
        
        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();

        // your logic
        double coverage = patientInsurancePlan.getCoverage();
        
        double discount = patientInsurancePlan.getDiscount();
        
        double insuranceCompanyWouldPay = (amount * coverage);
        payments[0] = insuranceCompanyWouldPay;
        payments[1] = (amount - insuranceCompanyWouldPay) - discount;
        //System.out.println("Insurance company would Pay >> " + insuranceCompanyWouldPay);
        
        //System.out.println("Remaining Amount Pay by patient >> " + ((amount - insuranceCompanyWouldPay) - discount));
       
        return payments;
    }

}