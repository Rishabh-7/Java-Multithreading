public class ThreadExample9 {
    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    sleep(1000);
                    System.out.println("thread running");
                }
            }
        };

        Thread thread = new Thread(runnable);

        thread.setDaemon(true);

        thread.start();
        sleep(5100);
    }
}
