package no.hiof.mathibr.model;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int numberOfEGOTs;
    private String fulltNavn = firstName + lastName;


    @Override
    public String toString() {
        return this.firstName + this.lastName;
    }

    //Constructor
    public Person(String firstName, String lastName, LocalDate dateOfBirth, int numberOfEGOTs) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.numberOfEGOTs = numberOfEGOTs;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Getter-Setter
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getNumberOfEGOTs() {
        return numberOfEGOTs;
    }

    public void setNumberOfEGOTs(int numberOfEGOTs) {
        this.numberOfEGOTs = numberOfEGOTs;
    }
}