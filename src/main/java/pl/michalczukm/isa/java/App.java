package pl.michalczukm.isa.java;

import java.util.List;


public class App 
{
    public static void main( String[] args ) {

        PatientService patientService = new PatientService();
        DoctorService doctorService = new DoctorService();
        List<Patient> patients = patientService.getAll();

        System.out.println("========== Patients ==========");
        for (Patient patient : patients) {
            System.out.println(String.format("%2$s - %1$s", patient.getFirstName(), patient.getLastName()));
        }

        System.out.println("========== Doctors ==========");
        for(Doctor doctor : doctorService.getAll()) {
            System.out.println(String.format("%2$s - %1$s", doctor.getFirstName(), doctor.getLastName()));
        }
    }
}
