package dev.feldmann.bootcamp.aula2.tt.pdf1.exercise1;

public class Main {

    public static void main(String[] args) {
        try {
            new WeakPassword().setValue("12");
        } catch (InvalidPasswordFormat invalidPasswordFormat) {
            invalidPasswordFormat.printStackTrace();
        }
    }
}
