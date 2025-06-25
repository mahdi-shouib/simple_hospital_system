public class HospitalService {
	
	private String serviceName;
	private double serviceCost;
	private PatientBase patient;
	
	public HospitalService() {}
	
	public HospitalService(String serviceName, double serviceCost, PatientBase patient) {
		
		this.serviceName = serviceName;
		this.serviceCost = serviceCost;
		this.patient = patient;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public double getServiceCost() {
		return serviceCost;
	}

	public void setServiceCost(double serviceCost) {
		this.serviceCost = serviceCost;
	}

	public PatientBase getPatient() {
		return patient;
	}

	public void setPatient(PatientBase patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "\nHospitalService[\nserviceName: " + serviceName + "\nserviceCost: " + serviceCost + "\npatient: " + patient.getPatientId() + "]\n";
	}
}
