package com.linktracker.linktracker.dtos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class CreateLinkDTO {

    @NotNull
    @Pattern(regexp = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]")
    private String url;
    private String password;

    public CreateLinkDTO() {}

    public CreateLinkDTO(String url, String password) {
        this.url = url;
        this.password = password;
    }

    public String getUrl() {
        return this.url;
    }

    public String getPassword() {
        return this.password;
    }

}
