public class VirtualThreadExample {
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
                for(int i=0; i<10; i++) {
                    System.out.println(Thread.currentThread().getName() + " Index: " + i); // virtual thread has no name
                    sleep(1000);
                }
            }
        };

        Thread vThread = Thread.ofVirtual().start(runnable);

        Thread vThreadUnstarted = Thread.ofVirtual().unstarted(runnable);
        vThreadUnstarted.start();

        try {
            vThread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
