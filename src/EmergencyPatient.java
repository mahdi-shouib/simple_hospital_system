package com.mycompany.hospitalsystem;

public class EmergencyPatient extends PatientBase {
	
	private double emergencyFee;
	
	public EmergencyPatient() {}

	public EmergencyPatient(String patientId, String name, int age, String medicalHistory, Department department, double emergencyFee) {
		
		super(patientId, name, age, medicalHistory, department);
		this.emergencyFee = emergencyFee;
	}

	public double getEmergencyFee() {
		return emergencyFee;
	}

	public void setEmergencyFee(double emergencyFee) {
		this.emergencyFee = emergencyFee;
	}

	@Override
	public double calculateBill() {
		
		return emergencyFee + super.calculateBill() * (1 + TAX_RATE);
	}
}