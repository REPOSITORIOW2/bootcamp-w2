package Exercise1;

public class Time {
    private long startMilli;
    private long endMilli;

    public void start() {
        this.startMilli = System.currentTimeMillis();
    }

    public void stop() {
        this.endMilli = System.currentTimeMillis();
    }

    public long elapsedTime() {
        return endMilli - startMilli;
    }
}
