package com.bootcampmeli.consultoriomongo.entities;

import org.springframework.data.mongodb.core.mapping.Field;

public class Dentist {
    
    @Field(name = "first_name")
    private String firstName;
    @Field(name = "last_name")
    private String lastName;
    private String specialty;


    public Dentist() {}

    public Dentist(
            String first_name, 
            String lastName, 
            String specialty) {
        this.firstName = first_name;
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
