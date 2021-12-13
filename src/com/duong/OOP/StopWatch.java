package com.duong.OOP;

import java.util.Calendar;

public class StopWatch {
    long startTime;
    long endTime;
    public StopWatch(){

    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public double  getElapsedTime() {
        return endTime - startTime;
    }
}
