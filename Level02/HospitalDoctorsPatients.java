import java.util.ArrayList;
import java.util.List;

// Class representing a Patient
class Patient {
    private String name;
    private List<Doctor> consultedDoctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    public void consultDoctor(Doctor doctor) {
        if (!consultedDoctors.contains(doctor)) {
            consultedDoctors.add(doctor);
            doctor.addPatient(this);
        }
    }

    @Override
    public String toString() {
        return name;
    }

    public String viewDoctors() {
        return name + " consulted Doctors: " + consultedDoctors;
    }
}

// Class representing a Doctor
class Doctor {
    private String name;
    private List<Patient> patients = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    public void consult(Patient patient) {
        addPatient(patient);
        System.out.println(name + " is consulting " + patient);
    }

    @Override
    public String toString() {
        return name;
    }

    public String viewPatients() {
        return name + " Patients: " + patients;
    }
}

// Class representing a Hospital
class Hospital {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public Hospital(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    @Override
    public String toString() {
        return name + " Doctors: " + doctors + ", Patients: " + patients;
    }
}

// Main class
public class HospitalDoctorsPatients {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor drSmith = new Doctor("Dr. Smith");
        Doctor drJones = new Doctor("Dr. Jones");

        Patient alice = new Patient("Alice");
        Patient bob = new Patient("Bob");

        hospital.addDoctor(drSmith);
        hospital.addDoctor(drJones);
        hospital.addPatient(alice);
        hospital.addPatient(bob);

        drSmith.consult(alice);
        drJones.consult(bob);
        alice.consultDoctor(drJones);

        System.out.println(hospital);
        System.out.println(drSmith.viewPatients());
        System.out.println(drJones.viewPatients());
        System.out.println(alice.viewDoctors());
        System.out.println(bob.viewDoctors());
    }
}
