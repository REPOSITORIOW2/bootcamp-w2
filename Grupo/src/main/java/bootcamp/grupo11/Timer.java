package bootcamp.grupo11;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class Timer {
    private long startTime;
    private long endtime;

    public Timer() {
    }

    public void start() {
        this.startTime = Instant.now().toEpochMilli();
    }

    public void stop() {
        this.endtime = Instant.now().toEpochMilli();
    }

    public long elapsedTime(){
    return this.endtime - this.startTime;
    }

}