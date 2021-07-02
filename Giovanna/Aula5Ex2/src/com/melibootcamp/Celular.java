package com.melibootcamp;

public class Celular implements Precedente<Celular> {
    private String number;
    private String holder;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Celular(String number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    @Override
    public int precedeA(Celular celular) {
        if (this.holder.toLowerCase().compareTo(celular.holder.toLowerCase()) > 0)
            return 1;
        if (this.holder.toLowerCase().compareTo(celular.holder.toLowerCase()) < 0)
            return -1;
        else
            return 0;
    }

    @Override
    public String ToString() {
        return this.holder + " num:"+ this.getNumber();
    }
}
