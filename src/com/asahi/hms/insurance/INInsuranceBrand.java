package com.asahi.hms.insurance;

public interface INInsuranceBrand {
   public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking);
}
