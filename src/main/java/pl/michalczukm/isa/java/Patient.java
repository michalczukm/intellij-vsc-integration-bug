package pl.michalczukm.isa.java;

public class Patient {
    private final String firstName;
    private final String lastName;
    private final int age;

    Patient(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    String getLastName() {
        return lastName;
    }
}
