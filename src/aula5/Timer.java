package aula5;

public class Timer {
    private long inicio;
    private long fim;

    public void start() {
        this.inicio = System.currentTimeMillis();
    }

    public void stop() {
        this.fim = System.currentTimeMillis();
    }

    public long elapsedTime() {
        return this.fim - this.inicio;
    }
}
