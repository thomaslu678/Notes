package com.hillcrest.collections.sort;

public class StopWatch {

    private long elapsedTime;
    private long startTime;
    private boolean isRunning;

    public void stop(){
        if(isRunning){
            return;
        }
        else{
            long endTime = System.currentTimeMillis();
            isRunning = false;
            elapsedTime = elapsedTime + endTime - startTime;
        }
    }

    public long getElapsedTime(){
        if(!isRunning){
            return elapsedTime;
        }
        else{
            var currentTime = System.currentTimeMillis();
            return elapsedTime + currentTime - startTime;
        }
    }

    public void reset(){
        isRunning = false;
        elapsedTime = 0;
    }

}
