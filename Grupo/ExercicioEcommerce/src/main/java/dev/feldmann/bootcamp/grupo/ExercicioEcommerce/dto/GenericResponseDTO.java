package dev.feldmann.bootcamp.grupo.ExercicioEcommerce.dto;

public class GenericResponseDTO {
    private String message;
    private boolean hadSuccess;

    public GenericResponseDTO(String message, boolean hadSuccess) {
        this.message = message;
        this.hadSuccess = hadSuccess;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isHadSuccess() {
        return hadSuccess;
    }

    public void setHadSuccess(boolean hadSuccess) {
        this.hadSuccess = hadSuccess;
    }

}
