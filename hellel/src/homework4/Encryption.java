package homework4;

import java.util.Scanner;

public class Encryption {

    public static void main(String[] args) {
        System.out.println("Enter a key for encryption");
        Scanner enter = new Scanner(System.in);
        String key = enter.nextLine();
        System.out.println("Enter string for encryption");
        String string = enter.nextLine();
        Scarmbler encryption = new Scarmbler(key);
        String messageEncoding = encryption.crypt(string);
        System.out.println(messageEncoding);
        System.out.println("If you want to decrypt the message press 1");
        System.out.println("If you want to encrypt an other message message press 2");
        System.out.println("If you want to exit press 3");
        int n = enter.nextInt();
        switch (n) {
            case 1: {
                messageEncoding = encryption.crypt(string);
                System.out.println(messageEncoding);
            }
            case 2: {
                System.out.println("Enter string for encryption");
                String otherString = enter.nextLine();
                otherString = encryption.crypt(otherString);
                System.out.println(otherString);
            }
            case 3: {
                return;
            }
            default:
                System.out.println("Wrong press button");

        }


    }


}
