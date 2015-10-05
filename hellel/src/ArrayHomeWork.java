import java.util.Random;
import java.util.Scanner;

public class ArrayHomeWork {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Selecting one of the function");
            System.out.println("1. Deposit");
            System.out.println("2. Telegraph");
            System.out.println("3. Happy ticket");
            System.out.println("4. Guess the number");
            System.out.println("5. Escape");
            Scanner enter = new Scanner(System.in);
            int n = enter.nextInt();
            switch (n) {
                case 1:
                    deposit();
                    break;
                case 2:
                    telegraph();
                    break;
                case 3:
                    tickets();
                    break;
                case 4:
                    guessnumder();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Input Error ");
                    break;
            }
        }
    }



    private static void guessnumder() {
        Random random = new Random();
        int number = random.nextInt(500);
        Scanner enter = new Scanner(System.in);
        boolean flag =true;
        do {
            System.out.println("enter your number");
            int trynumber = enter.nextInt();
            if (trynumber == number) {
                System.out.println("You guessed");
                flag=false;
            } else if (trynumber < number) {
                System.out.println("Your number is less than the number of tasks");
            } else if (trynumber > number) {
                System.out.println("Your number is greater than the number of tasks");
            }
        }while(flag);
    }

    private static void tickets() {
        int counter = 0;
        for (int i = 100000; i < 1000000; i++) {
            if ((i / 100000 % 10 + i / 10000 % 10 + i / 1000 % 10) == (i / 100 % 10 + i / 10 % 10 + i % 10)) {
                counter++;
            }
        }
        System.out.printf("You will need %d souvenirs\n", counter);

    }

    private static void telegraph() {
        System.out.println("Enter text of receipt");
        Scanner enter = new Scanner(System.in);
        String receipt = enter.nextLine();
        System.out.println("Enter cost one word");
        double cost = enter.nextDouble();
        String[] textofreceipt = receipt.split(" ");
        System.out.println("the value of the receipt is " + textofreceipt.length * cost);

    }

    private static void deposit() {
        System.out.println("Enter the amount of the deposit");
        Scanner enter = new Scanner(System.in);
        double sum = enter.nextDouble();
        System.out.println("Enter the number of months");
        int month = enter.nextInt();
        int counter = 0;
        double amount = sum;
        for(counter=0;counter<month;counter++) {
            amount = amount * (0.03 / 12) + amount;
        }
        System.out.printf("Amount will be %.2f after %d month\n", amount, month);
        amount = 0;
        month = 0;
        while (amount < sum){
            amount = sum * 0.03 / 12 + amount;
            month++;
        }
        System.out.printf("After %.1f  year deposit exceeded amount\n ", month / 12.0);
    }
}


