package com.bootcamp.tm.exercicio1;

import java.util.concurrent.TimeUnit;

public class Time {

    private long startedAt, stoppedAt;

    public void start() {
        startedAt = System.currentTimeMillis();
    }

    public void stop() {
        stoppedAt = System.currentTimeMillis();
    }

    public long getElapsedTimeInMilliseconds() {
        return stoppedAt - startedAt;
    }

    public long getElapsedTimeInSeconds() {
        return TimeUnit.MILLISECONDS.toSeconds(stoppedAt - startedAt);
    }

}
