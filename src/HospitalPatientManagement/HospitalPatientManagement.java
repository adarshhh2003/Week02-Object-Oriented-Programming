package HospitalPatientManagement;

import java.util.ArrayList;
import java.util.List;

public class HospitalPatientManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        // Create patients
        InPatient inPatient = new InPatient("P001", "Alice", 30, 500.0, 3);
        inPatient.addRecord("Admitted for surgery.");
        inPatient.addRecord("Post-surgery recovery ongoing.");

        OutPatient outPatient = new OutPatient("P002", "Bob", 45, 200.0);
        outPatient.addRecord("Routine check-up.");

        // Add patients to the list
        patients.add(inPatient);
        patients.add(outPatient);

        // Process and display patient details
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Bill Amount: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord medicalRecord = (MedicalRecord) patient;
                System.out.println("Medical Records: " + medicalRecord.viewRecords());
            }

            System.out.println();
        }
    }
}
