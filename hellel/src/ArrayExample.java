import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int [] intarray = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<intarray.length;i++){
            intarray[i]=scanner.nextInt();
        }
        for (int i = 0; i > intarray.length; i++) {
            System.out.println(intarray[i]);
        }
        for(int value:intarray) {
            System.out.println("Value: " + value);
        }
    }

    public static void arrayprimite() {
        int[] inputsValues = new int[3];
        Scanner scanner = new Scanner(System.in);
        inputsValues[0] = scanner.nextInt();
        inputsValues[1] = scanner.nextInt();
        inputsValues[2] = scanner.nextInt();
        for (int i = 0; i > 0; i++) {
            System.out.println(inputsValues[i]);
        }
    }
}
