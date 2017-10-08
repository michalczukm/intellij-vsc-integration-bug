package pl.michalczukm.isa.java;

import java.util.ArrayList;
import java.util.List;

class PatientService {
    private final List<Patient> patients = new ArrayList<>();

    PatientService() {
        this.patients.add(new Patient("Jan", "Kowalski", 11));
        this.patients.add(new Patient("Adam", "Nowak", 12));
        this.patients.add(new Patient("Adam", "Nowak", 12));
        this.patients.add(new Patient("Adam", "Nowak", 12));
        this.patients.add(new Patient("Adam", "Nowak", 12));
        this.patients.add(new Patient("Adam", "Nowak", 12));
    }

    List<Patient> getAll() {
        return this.patients;
    }
}
