package dev.feldmann.bootcamp.aula2.tt.pdf1.exercise1;

public class StrongPassword extends Password{


    public StrongPassword() {

        // Contem no mínimo 1 minuscula, 1 maiúscula, 1 digito com tamanho mínimo de 8
        super("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$");
    }
}
