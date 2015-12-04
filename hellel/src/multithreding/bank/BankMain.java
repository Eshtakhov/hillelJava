package multithreding.bank;

/**
 * Created by ES on 30.11.2015.
 */
public class BankMain {
    public static void main(String[] args) throws InterruptedException {
        Bank bank=new Bank();
        Bankir bankir1= new Bankir(bank);
        Bankir bankir2= new Bankir(bank);

        bankir1.start();
        bankir2.start();

        Thread.sleep(10);

        bankir1.interrupt();
        bankir2.interrupt();
        bankir1.join();
        bankir2.join();
        System.out.println(bankir1);
        System.out.println(bankir2);
        System.out.println(bank);
    }
}
