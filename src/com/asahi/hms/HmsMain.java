package com.asahi.hms;

public class HmsMain {

	public static void main(String[] args) {
	
		//Set a Doctor info with associate User and Staff class extends
		Doctor  dr = new Doctor();
		dr.setId(100);
		dr.setStaffId(1000);
		dr.setDoctorId(10000);
		dr.setFirstName("krishna");
		dr.setLastName("Moorthy");
		dr.setGender("male");
		dr.setEmail("krishna@asahitechnologies.com");
		dr.setYearsOfExperience(10);
		dr.setDescription("Master of surgeon");
		dr.setSalary(50000);
		dr.setSpecialization("Heart Surgeon");
		
		
		//Set a Nurse info with associate User and Staff class extends
		Nurse  nse = new Nurse();
		nse.setId(101);
		nse.setStaffId(1001);
		nse.setNurseId(10001);
		nse.setFirstName("Nurse");
		nse.setLastName("one");
		nse.setGender("female");
		nse.setEmail("nurse@xxxx.com");
		nse.setYearsOfExperience(10);
		nse.setDescription("Support patient at any time");
		nse.setSalary(10000);
		
		
		//Set a Patient info with associate User class extends
		Patient  patientObj = new Patient();
		patientObj.setId(102);
		patientObj.setPatientId(1002);
		patientObj.setInsured(true);
		patientObj.setFirstName("Patient");
		patientObj.setLastName("one");
		patientObj.setGender("male");
		patientObj.setEmail("patient@xxxx.com");
		
		
		//Get a Doctor Object with associate User and Staff class extends
		System.out.println("Get doctor id ===" + dr.getId());
		System.out.println("Get doctor getStaffId ===" + dr.getStaffId());
		System.out.println("Get doctor getDoctorId ===" + dr.getDoctorId());
		System.out.println("Get doctor getFirstName ===" + dr.getFirstName());
		System.out.println("Get doctor getLastName ===" + dr.getLastName());
		System.out.println("Get doctor getGender ===" + dr.getGender());
		System.out.println("Get doctor getEmail ===" + dr.getEmail());
		System.out.println("Get doctor getYearsOfExperience ===" + dr.getYearsOfExperience());
		System.out.println("Get doctor getDescription ===" + dr.getDescription());
		System.out.println("Get doctor getSalary ===" + dr.getSalary());
		System.out.println("Get doctor getSpecialization ===" + dr.getSpecialization());
		
		
		//Get a nurse Object with associate User and Staff class extends
		System.out.println("\r\n\n Get nurse id ===" + nse.getId());
		System.out.println("Get nurse getStaffId ===" + nse.getStaffId());
		System.out.println("Get nurse getNurseId ===" + nse.getNurseId());
		System.out.println("Get nurse getFirstName ===" + nse.getFirstName());
		System.out.println("Get nurse getLastName ===" + nse.getLastName());
		System.out.println("Get nurse getGender ===" + nse.getGender());
		System.out.println("Get nurse getEmail ===" + nse.getEmail());
		System.out.println("Get nurse getYearsOfExperience ===" + nse.getYearsOfExperience());
		System.out.println("Get nurse getDescription ===" + nse.getDescription());
		System.out.println("Get nurse getSalary ===" + nse.getSalary());
		
		
		//Get a patient Object with associate User
		System.out.println("\r\n\n Get patient id ===" + patientObj.getId());
		System.out.println("Get patient getPatientId ===" + patientObj.getPatientId());
		System.out.println("Get patient isInsured ===" + patientObj.isInsured());
		System.out.println("Get patient getFirstName ===" + patientObj.getFirstName());
		System.out.println("Get patient getLastName ===" + patientObj.getLastName());
		System.out.println("Get patient getGender ===" + patientObj.getGender());
		System.out.println("Get patient getEmail ===" + patientObj.getEmail());
				
	}
	
}
