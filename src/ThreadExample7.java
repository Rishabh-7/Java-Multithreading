
public class ThreadExample7 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("thread running");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("thread finished");
        };

        Thread thread = new Thread(runnable); // main thread has started another thread
        thread.start();

        System.out.println("Completely separate statement that runs in main thread");
    }
}
