package main.java.memory;

public class SeparateObjects {
    public static void main(String[] args) {
        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();

        Thread thread1 = new Thread(myRunnable1, "thread1");
        Thread thread2 = new Thread(myRunnable2, "thread2");

        thread1.start();
        thread2.start();
    }
}
