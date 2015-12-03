package multithreding.bank.producerConsummer;

import java.io.PrintWriter;

/**
 * Created by ES on 03.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();

        Producer producer = new Producer(bucket);
        Consumen consumen = new Consumen(bucket);


        producer.start();
        consumen.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        producer.interrupt();
        consumen.interrupt();

        try {
            producer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            consumen.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(bucket);
    }
}
