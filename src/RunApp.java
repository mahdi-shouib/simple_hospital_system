package com.mycompany.hospitalsystem;

import java.util.ArrayList;

public class RunApp {

	public static void main(String[] args) {
		
		ArrayList<PatientBase> patients = new ArrayList<PatientBase>();
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		ArrayList<HospitalService> services = new ArrayList<HospitalService>();
		
		Department dep_ICU = new Department("D1", "Intensive care unit");
		Department dep_SRG = new Department("D2", "Surgery unit");
		Department dep_RDO = new Department("D3", "Radiology unit");
		
		EmergencyPatient patient1 = new EmergencyPatient("G812", "Sa'ad Moustafa", 20, "Inflamed Appendix", dep_SRG, 1000);
		EmergencyPatient patient2 = new EmergencyPatient("T214", "Khalid Jehad", 31, "Broken Left Leg", dep_RDO, 1000);
		LongTermPatient patient3 = new LongTermPatient("K359", "Yasmeen Salem", 59, "High Blood Pressure", dep_ICU, 8, 500);
		
		Doctor doctor1 = new Doctor("83Y", "Ismaeel Saeed", "Surgery", "PhD", 8000, 8, 500, dep_SRG);
		Doctor doctor2 = new Doctor("56L", "Tasnim Khaleel", "Radiology", "Master", 5000, 2, 200, dep_RDO);
		
		HospitalService service1 = new HospitalService("Anesthesia", 500, patient1);
		HospitalService service2 = new HospitalService("Genaral surgery", 3000, patient1);
		HospitalService service3 = new HospitalService("X-Ray imaging test", 200, patient2);
		HospitalService service4 = new HospitalService("Broken bone surgery", 1500, patient2);
		HospitalService service5 = new HospitalService("Blood test", 100, patient3);
		HospitalService service6 = new HospitalService("Urine test", 100, patient3);
		HospitalService service7 = new HospitalService("Nursing", 1000, patient3);
		
		services.add(service1);
		services.add(service2);
		services.add(service3);
		services.add(service4);
		services.add(service5);
		services.add(service6);
		services.add(service7);
		
		patient1.getServices().add(service1);
		patient1.getServices().add(service2);
		patient2.getServices().add(service3);
		patient2.getServices().add(service4);
		patient3.getServices().add(service5);
		patient3.getServices().add(service6);
		patient3.getServices().add(service7);
		
		patients.add(patient1);
		patients.add(patient2);
		patients.add(patient3);
		
		doctors.add(doctor1);
		doctors.add(doctor2);
		
		generateBill(patient3);
		
		java.util.Collections.sort(patients);
		
		sortDoctorsBySalary(doctors);
		
		System.out.println("-----------------------------------");
		
		for(int i = 0; i < doctors.size(); i++) {
			System.out.println(i + 1 + "- " + "Department Name: " + doctors.get(i).getDepartment().getName() + "\nSalary: " + doctors.get(i).calculateSalary());
		}
		
		System.out.println("-----------------------------------");
		
		for(int i = 0; i < patients.size(); i++) {
			System.out.println(i + 1 + "- " + "Patient Name: " + patients.get(i).getName() + "\nAge: " + patients.get(i).getAge());
		}
		
		System.out.println("-----------------------------------");
		
		System.out.println(calculateTotalpatientsBill(patients));
		
	}
	
	public static void sortDoctorsBySalary(ArrayList<Doctor> docArr) {
		
		java.util.Collections.sort(docArr);
	}
	
	public static double calculateTotalpatientsBill(ArrayList<PatientBase> patArr) {
		
		double total = 0;
		
		for(int i = 0; i < patArr.size(); i++) {
			total += patArr.get(i).calculateBill();
		}
		
		return total;
	}
	
	public static void generateBill(PatientBase patient) {
		System.out.println("/////////////Bill/////////////\nId: " + patient.getPatientId() + "\nName: " + patient.getName() + "\nTotal Bill Amount: " + patient.calculateBill() + "\n//////////////////////////////");
	}
}
