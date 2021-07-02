package com.bootcampmeli.starwars.entities;

/**
 * Star Wars Character
 */
public class StarWarsCharacter {

    private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private String homeworld;
    private String species;

    public StarWarsCharacter() {}

    public StarWarsCharacter(
        String name, 
        String height,
        String mass, 
        String hair_color, 
        String skin_color, 
        String eye_color, 
        String birth_year, 
        String gender,
        String homeworld,
        String species
    ){
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.hair_color = hair_color;
        this.skin_color = skin_color;
        this.eye_color = eye_color;
        this.birth_year = birth_year;
        this.gender = gender;
        this.homeworld = homeworld;
        this.species = species;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return this.height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return this.mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getHair_color() {
        return this.hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public String getSkin_color() {
        return this.skin_color;
    }

    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    public String getEye_color() {
        return this.eye_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public String getBirth_year() {
        return this.birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeworld() {
        return this.homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


}