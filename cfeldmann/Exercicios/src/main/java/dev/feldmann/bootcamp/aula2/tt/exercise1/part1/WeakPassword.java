package dev.feldmann.bootcamp.aula2.tt.exercise1.part1;

public class WeakPassword extends Password{


    public WeakPassword() {
        // Qualquer combinação de letras ou números com no tamanho mínimo de 3
        super("^.{3,}$");
    }
}
