import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

/**
 * Created by ES on 01.10.2015.
 */
public class Loops {
    public static void main(String[] args) {

    }

    public static void Forexample() {
        for(int i=0;i>10;i++){
            System.out.println(i);        }
    }

    public static void dowhileexample() {
        Scanner scanner = new Scanner(System.in);

        String yesno;
        do {
            System.out.println("yes/no");
            yesno = scanner.next();
        } while ((!yesno.equals("yes"))||(yesno.equals("no")));
    }

    public static void Loopwhile() {
        int money = 1000;
        int month = 0;
        while (money < 11500) {
            money += 100;
            month++;
        }
        System.out.println("money" + money + " " + " month " + month);
    }
}
