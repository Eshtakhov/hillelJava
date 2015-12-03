package multithreding.bank;

import java.util.Random;

/**
 * Created by ES on 30.11.2015.
 */
public class Bankir extends Thread {
    private Bank bankp;
    private Random random=new Random();
    private long transactionCoount;

    public Bankir(Bank bankp) {
        this.bankp = bankp;
    }

    @Override
    public String toString() {
        return "Bankir{" +
                "transactionCoount=" + transactionCoount +
                '}';
    }

    @Override
    public void run(){
        while (!Thread.currentThread().isInterrupted()){
            int randomAmount=random.nextInt(1000);
            boolean randomDirection=random.nextBoolean();
            bankp.transaction(randomAmount, randomDirection);
            transactionCoount++;
        }
    }

    /**
     * Created by ES on 30.11.2015.
     */
    public static class MultithreadingMain {
        public static void main(String[] args) {
            Thread otherThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("other otherThread begin");
                    try {
                        sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("other otherThread end");
                }
            });


            // otherThread.setDaemon(true);
            otherThread.start();
            try {
                sleep(1500);
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
}
