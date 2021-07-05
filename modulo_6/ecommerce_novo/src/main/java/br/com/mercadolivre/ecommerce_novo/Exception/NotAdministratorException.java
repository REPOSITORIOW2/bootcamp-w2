package br.com.mercadolivre.ecommerce_novo.Exception;

public class NotAdministratorException extends RuntimeException{

    public NotAdministratorException() {
        super("Somente adminstradores podem realizar esta açao");
    }
}
