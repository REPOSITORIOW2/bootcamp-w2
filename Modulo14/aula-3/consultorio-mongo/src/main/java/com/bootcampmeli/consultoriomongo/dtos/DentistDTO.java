package com.bootcampmeli.consultoriomongo.dtos;

public class DentistDTO {
    
    private String firstName;
    private String lastName;
    private String specialty;


    public DentistDTO() {}

    public DentistDTO(
            String firstName, 
            String lastName, 
            String specialty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return this.specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
