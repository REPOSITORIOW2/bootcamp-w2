package com.bootcampmeli.ecommerceapi.dtos;

public class ExceptionDTO {
    
    private String message;

    public ExceptionDTO(String messsage) {
        this.message = messsage;
    }

    public String getMessage() {
        return message;
    }
}
