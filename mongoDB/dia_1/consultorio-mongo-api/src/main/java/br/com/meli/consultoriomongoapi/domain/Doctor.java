package br.com.meli.consultoriomongoapi.domain;

public class Doctor extends Person {
    private String specialty;

    public Doctor(String firstName, String lastName, String specialty) {
        super(firstName, lastName);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}


