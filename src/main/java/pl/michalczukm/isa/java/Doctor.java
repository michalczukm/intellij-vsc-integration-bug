package pl.michalczukm.isa.java;

public class Doctor {
    private final String firstName;
    private final String lastName;
    private final String middleName;

    Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = "None";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() { return lastName; }

    public String getMiddleName() { return middleName; }
}
