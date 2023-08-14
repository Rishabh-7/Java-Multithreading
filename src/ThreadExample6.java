public class ThreadExample6 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "running");
        };

        Thread thread = new Thread(runnable, "thread1");
        thread.start();
        Thread thread2 = new Thread(runnable, "thread2");
        thread2.start();
    }
}
