package com.bootcamp.consultorio.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"user\"")
public class User {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String user_name;
    private String password;
    private String user_status;


    public User() {}

    public User(
            Long id, 
            String user_name, 
            String password, 
            String user_status) {
        this.id = id;
        this.user_name = user_name;
        this.password = password;
        this.user_status = user_status;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_name() {
        return this.user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_status() {
        return this.user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }
}
