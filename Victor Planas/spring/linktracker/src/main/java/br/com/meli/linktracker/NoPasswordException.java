package br.com.meli.linktracker;

public class NoPasswordException extends RuntimeException{
    public NoPasswordException(String message) {
        super(message);
    }
}
