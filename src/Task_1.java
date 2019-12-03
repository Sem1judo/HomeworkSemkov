import java.util.Scanner;

public class Task_1 {
    private static int number;

    public static Scanner scanner = new Scanner(System.in);


    public static int scanNumber() {
        System.out.print("Please enter your number: ");
        return number = scanner.nextInt();
    }

    public static void toNumeralSystem() {
        scanNumber();
        String res = Integer.toBinaryString(number);
        System.out.println("Binary = " + res);

        res = Integer.toOctalString(number);
        System.out.println("Octal = " + res);

        res = Integer.toHexString(number);
        System.out.println("Hex = " + res);
    }

    public static void main(String[] args) {
        toNumeralSystem();
    }
}
