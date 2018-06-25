package com.asahi.hms.insurance;

public class BlueCrossBlueShield implements  INInsuranceBrand {
	private long id;
	private String name;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
