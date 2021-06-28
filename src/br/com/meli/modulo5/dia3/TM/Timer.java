package br.com.meli.modulo5.dia3.TM;

public class Timer {

    public long start;
    public long end;

    public long getStart() {
        return start;
    }

    public void setStart() {
        this.start = System.currentTimeMillis();
    }

    public long getEnd() {
        return end;
    }

    public void setEnd() {
        this.end = System.currentTimeMillis();
    }

    public double getElapsedTime(){

        long et = this.end - this.start;

        return (double) et / 1_000;

    }

    public void reset(){
        this.start = 0;
        this.end = 0;
    }

}
