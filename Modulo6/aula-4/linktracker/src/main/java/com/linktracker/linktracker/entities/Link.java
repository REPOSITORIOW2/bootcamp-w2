package com.linktracker.linktracker.entities;

public class Link {

    private Long id;
    private String password;
    private Long redirectCounter;
    private String url;

    public Link(String password, String url) {
        this.password = password;
        this.url = url; 
        this.id = -1L;
        this.redirectCounter = 0L;
    }

    public String getUrl() {
        return this.url;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRedirectCounter() {
        return this.redirectCounter;
    }

    public void setRedirectCounter(Long redirectCounter) {
        this.redirectCounter = redirectCounter;
    }

    public String getPassword() {
        return this.password;
    }
}

/// sejam welcomidos