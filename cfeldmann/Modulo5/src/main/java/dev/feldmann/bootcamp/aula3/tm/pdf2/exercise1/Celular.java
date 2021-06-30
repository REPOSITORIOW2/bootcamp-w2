package dev.feldmann.bootcamp.aula3.tm.pdf2.exercise1;

public class Celular implements Precedente<Celular>{
    private String number;
    private String holder;

    public Celular(String number, String holder) {
        this.number = number;
        this.holder = holder;
    }


    @Override
    public int precedeA(Celular celular) {
        return this.number.compareToIgnoreCase(celular.number);
    }
}
