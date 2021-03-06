package database;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Created by ES on 21.12.2015.
 */
public class SingletonExample {
    public String staticsomevalue;

    private SingletonExample() {

    }


    private static SingletonExample instance = new SingletonExample();

    public static SingletonExample getInstance() {
        if (instance == null) {
            synchronized (SingletonExample.class) {
                if (instance == null) {
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }


    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int i = 0;
        while (true) {
            i++;
            CompletableFuture<SingletonExample> future1 = CompletableFuture.supplyAsync(SingletonExample::getInstance);
            CompletableFuture<SingletonExample> future2 = CompletableFuture.supplyAsync(SingletonExample::getInstance);
            SingletonExample singletonExample1 = future1.get();
            SingletonExample singletonExample2 = future2.get();
            if (singletonExample1 != singletonExample2) {
                break;
            }
            clear();
            System.out.print(i);
        }
    }

    public static void oldSchoolCheck() throws InterruptedException {
        ArrayList<SingletonExample> singletonExamples = new ArrayList<>();
        singletonExamples.add(null);
        singletonExamples.add(null);
        int i = 0;
        while (true)

        {
            i++;
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    SingletonExample singletonExample = SingletonExample.getInstance();
                    singletonExamples.set(0, singletonExample);
                }
            });
            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    SingletonExample singletonExample = SingletonExample.getInstance();
                }
            });

            thread1.start();
            thread2.start();

            thread1.join();
            thread1.join();

            if (singletonExamples.get(0) != singletonExamples.get(1)) {
                break;

            }
            clear();


        }
        System.out.println(i);
    }

    private static void clear() {
        instance = null;
    }
}
