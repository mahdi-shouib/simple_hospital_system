package com.mycompany.hospitalsystem;

public class LongTermPatient extends PatientBase{
	
	private int daysAdmitted;
	private double dailyRate;
	
	public LongTermPatient() {}
	
	public LongTermPatient(String patientId, String name, int age, String medicalHistory, Department department, int daysAdmitted, double dailyRate) {
		
		super(patientId, name, age, medicalHistory, department);
		this.daysAdmitted = daysAdmitted;
		this.dailyRate = dailyRate;
	}

	public int getDaysAdmitted() {
		return daysAdmitted;
	}

	public void setDaysAdmitted(int daysAdmitted) {
		this.daysAdmitted = daysAdmitted;
	}

	public double getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}

	@Override
	public double calculateBill() {
		
		return (daysAdmitted * dailyRate + super.calculateBill()) * (1 + TAX_RATE);
	}
}
