package edu.ib;

public class ThreadDemo1 implements Runnable {
    @Override
    public void run() {

        System.out.println("Starting task 1 in a new thread ....");
        double s=0;
        for (int i=0; i<30000; i++)  s= Math.sin(i);
        System.out.println("Task 1 completed...");

    }
}
