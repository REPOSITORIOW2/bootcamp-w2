package br.com.meli.apiecommerce.exceptions;

public class PermissionDeniedException extends RuntimeException {
    public PermissionDeniedException() {
        super("You don't have permission to use this method");
    }
}
