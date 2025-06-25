package com.mycompany.hospitalsystem;

public class Doctor implements Comparable<Doctor> {
	
	private String doctorId;
	private String name;
	private String specialty;
	private String degree;
	private double baseSalary;
	private double overtimeHours;
	private double overtimeRate;
	private Department department;
	
	public Doctor() {}
	
	public Doctor(String doctorId, String name, String specialty, String degree, double baseSalary, double overtimeHours, double overtimeRate, Department department) {
		
		this.doctorId = doctorId;
		this.name = name;
		this.specialty = specialty;
		this.degree = degree;
		this.baseSalary = baseSalary;
		this.overtimeHours = overtimeHours;
		this.overtimeRate = overtimeRate;
		this.department = department;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	public double getOvertimeRate() {
		return overtimeRate;
	}

	public void setOvertimeRate(double overtimeRate) {
		this.overtimeRate = overtimeRate;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public double calculateSalary() {
		
		double bonus = 0;
		
		switch(this.degree) {
		case "Bachelor": bonus = 0.1 * this.baseSalary; break;
		case "Master": bonus = 0.2 * this.baseSalary; break;
		case "PhD": bonus = 0.3 * this.baseSalary; break;
		}
		
		return this.baseSalary + bonus;
	}
	
	public double calculateOvertimePay() {
		
		return this.overtimeHours * this.overtimeRate;
	}

	@Override
	public String toString() {
		return "\nDoctor [\ndoctorId: " + doctorId + "\nname: " + name + "\nspecialty: " + specialty + "\ndegree: " + degree + "\nbaseSalary: " + baseSalary + "\novertimeHours: " + overtimeHours + "\novertimeRate: " + overtimeRate + "\ndepartment: " + department + "]\n";
	}

	@Override
	public int compareTo(Doctor d) {
		return Double.compare(this.calculateSalary(), d.calculateSalary());
	}
}
