package dev.feldmann.bootcamp.grupo.ExercicioEcommerce.exceptions;

public class ItemNotFoundException extends RuntimeException{
    public ItemNotFoundException() {
        super("Item not found in the database!");
    }
}
