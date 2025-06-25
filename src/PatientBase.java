package com.mycompany.hospitalsystem;

import java.util.ArrayList;

public class PatientBase implements Billable, Comparable<PatientBase> {
	
	private String patientId;
	private String name;
	private int age;
	private String medicalHistory;
	private Department department;
	private ArrayList<HospitalService> services = new ArrayList<HospitalService>();
	
	public PatientBase() {}
	
	public PatientBase(String patientId, String name, int age, String medicalHistory, Department department) {
		
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.medicalHistory = medicalHistory;
		this.department = department;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public ArrayList<HospitalService> getServices() {
		return services;
	}

	public void setServices(ArrayList<HospitalService> services) {
		this.services = services;
	}

	@Override
	public String toString() {
		return "\nPatientBase[\npatientId: " + patientId + "\nname: " + name + "\nage: " + age + "\nmedicalHistory: " + medicalHistory + "\ndepartment: " + department + "\nhospitalService: " + services + "\n]\n";
	}

	@Override
	public double calculateBill() {
		
		double totalServiceCosts = 0;
		
		for(int i = 0; i < getServices().size(); i++) {
			totalServiceCosts += getServices().get(i).getServiceCost();
		}
		
		return totalServiceCosts;
	}

	@Override
	public int compareTo(PatientBase p) {
		return Double.compare(this.calculateBill(), p.calculateBill());
	}
}
