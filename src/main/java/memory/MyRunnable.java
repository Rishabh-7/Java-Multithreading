package main.java.memory;

public class MyRunnable implements Runnable {
    private int count;

    public MyRunnable() {
        this.count = 0;
    }

    @Override
    public synchronized void run() {
        for(int i=0; i<100000; i++) {
            count++;
        }

        System.out.println(Thread.currentThread().getName() + " count value: " + count);
    }
}
