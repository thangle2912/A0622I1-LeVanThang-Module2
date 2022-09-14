package src.ss4_class_object_java.bai_tap;

import java.util.Scanner;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public StopWatch(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public void start(){
        this.startTime =  System.currentTimeMillis();
    }
    public  void stop(){
        this.endTime =  System.currentTimeMillis();
    }
    public long getElapsedTime(){
       return this.endTime-this.startTime;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Input :");
        int wait = scanner.nextInt();
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime()+" ms");

    }
}
