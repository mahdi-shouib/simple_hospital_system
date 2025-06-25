package com.mycompany.hospitalsystem;

import java.util.ArrayList;

public class Department {
	
	private String departmentId;
	private String name;
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<PatientBase> patients = new ArrayList<PatientBase>();
	
	public Department() {}
	
	public Department(String departmentId, String name) {
		this.departmentId = departmentId;
		this.name = name;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}

	public ArrayList<PatientBase> getPatients() {
		return patients;
	}

	public void setPatients(ArrayList<PatientBase> patients) {
		this.patients = patients;
	}
	
	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}
	
	public void addPatient(PatientBase patient) {
		patients.add(patient);
	}

	@Override
	public String toString() {
		return "\nDepartment[\ndepartmentId: " + departmentId + "\nname: " + name + "]\n";
	}
}
