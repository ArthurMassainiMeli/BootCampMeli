package br.com.meli.consultoriomongoapi.domain;

public class Patient extends Person {
    private int age;

    public Patient(String firstName, String lastName, int age) {
        super(firstName, lastName);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
