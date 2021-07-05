package com.bootcampmeli.ecommerceapi.dtos;

public class UserDTO {

    private Long id;
    private String username;

    public UserDTO() {}

    public UserDTO(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public Long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }
}
