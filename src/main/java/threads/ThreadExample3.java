package main.java.threads;

import java.sql.SQLOutput;

public class ThreadExample3 {
    public static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("MyRunnable is running");
            System.out.println("MyRunning has finished running");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
