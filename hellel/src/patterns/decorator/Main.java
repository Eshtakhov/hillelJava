package patterns.decorator;

import java.util.Scanner;

/**
 * Created by ES on 12.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Arabica();
        beverage = new Milk(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.description);
        System.out.println(beverage.cost);


    }

    public static void other() {
        Beverage revenge = new Robusta();
        System.out.println(revenge.description() + " " + revenge.cost());

        Scanner scanner = new Scanner(System.in);
        int cash = scanner.nextInt();
        //check(cash,revenge);


        check(cash, revenge);
    }

    private static void check(int cash, Beverage revenge) {
        if (cash != revenge.cost()) {
            System.out.println("khmm");
        } else {
            System.out.println("ok");
        }
    }
}
