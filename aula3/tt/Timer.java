package poo.aula3.tt;

import java.util.Date;

public class Timer {

    long start = 0;
    long stop;

    void stop() {
        this.stop = System.currentTimeMillis();
    }

    void start() {
        this.start = System.currentTimeMillis();
        this.stop = start;
    }

    long elapsedTime() {
        return (this.stop - this.start);
    }
}
