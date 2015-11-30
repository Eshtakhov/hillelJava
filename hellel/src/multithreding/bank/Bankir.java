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

}
