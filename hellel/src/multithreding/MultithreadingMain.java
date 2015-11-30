package multithreding;

/**
 * Created by ES on 30.11.2015.
 */
public  class MultithreadingMain {
    public static void main(String[] args) {
        Thread otherThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("other otherThread begin");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("other otherThread end");
            }
        });


        // otherThread.setDaemon(true);
        otherThread.start();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            otherThread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        otherThread.interrupt();
        System.out.println("main otherThread end");
    }
}
