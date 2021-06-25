package com.melibootcamp;

public class Counter {
    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void aumentar(){
        this.counter++;
    }
    public void diminuir(){
        this.counter--;
    }

    public Counter(int counter) {
        this.counter = counter;
    }

    public Counter() {
    }

    public Counter(Counter count) {
        this.counter = count.counter;
    }

}
