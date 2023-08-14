public class ThreadExample2 {
    public static class MyThread extends Thread {
        public void run() {
            System.out.println("MyThread is running");
            System.out.println("MyThread has finished running");
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
