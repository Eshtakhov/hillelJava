package homework4;

import java.util.Scanner;

public class Encryption {

    public static void main(String[] args) {
        System.out.println("Enter a key for encryption");
        Scanner enter = new Scanner(System.in);
        String key = enter.nextLine();
        System.out.println("Enter string for encryption");
        String string = enter.nextLine();
        Scrambler encryption = new Scrambler(key);
        String messageencoding = encryption.crypt(string);
        System.out.println(messageencoding);
        System.out.println("If you want to decrypt the message press 1");
        System.out.println("If you want to encrypt an other message message press 2");
        System.out.println("If you want to exit press 3");
        int n = enter.nextInt();
        switch (n) {
            case 1: {
                messageencoding = encryption.crypt(string);
                System.out.println(messageencoding);
            }
            case 2: {
                System.out.println("Enter string for encryption");
                String otherstring = enter.nextLine();
                otherstring = encryption.crypt(otherstring);
                System.out.println(otherstring);
            }
            case 3: {
                return;
            }
            default:
                System.out.println("Wrong press button");

        }


    }


}
