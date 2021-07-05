package br.com.meli.ecommerce.dto;

public class ExceptionMessageDTO {

    private String message;
    private int statusCode;

    public ExceptionMessageDTO(String message) {
        this.message = message;
    }

    public ExceptionMessageDTO(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
