public class HospitalRunner {
    public static void main(String[] patient) {
        
        boolean patientRecordCreated = HospitalPatient.createPatientRecord(
            "Dhanya", 
            "dhanya@21gmail.com", 
            "8722868286", 
            20, 
            "Female", 
            "Ckm", 
            "Dr.Kiran", 
            "120", 
            "20-06-2024"
        );
        
        System.out.println("Patient Record Created: " + patientRecordCreated);
        if (patientRecordCreated) {
            HospitalPatient.getPatientDetails();
        }
    }
}
