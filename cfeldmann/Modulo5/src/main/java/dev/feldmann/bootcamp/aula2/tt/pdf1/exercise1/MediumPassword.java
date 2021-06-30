package dev.feldmann.bootcamp.aula2.tt.pdf1.exercise1;

public class MediumPassword extends Password{


    public MediumPassword() {

        // Contem no mínimo 1 minuscula, 1 maiúscula, com tamanho mínimo de 5
        super("^(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{5,}$");
    }
}
