import java.util.Scanner;

public class Task_1 {
    private static int number;
    private static char octalchars[]={'0','1','2','3','4','5','6','7'};
    private static char hexchars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private static Scanner scanner = new Scanner(System.in);


    public static void init() {
        scanNumber();
        System.out.print("Decimal of "+number+ " is: (");
        toBinary(number);
        System.out.println(") in Binary");
        System.out.println("Decimal of "+number+" is: ("+toOctal()+ ") in Octal");
        System.out.println("Decimal of "+number+" is: ("+toHex()+ ") in Hex");

    }
    public static int scanNumber() {
        System.out.print("Please enter your number: ");
        return number = scanner.nextInt();
    }

    private static void toBinary(int number) {
        int temp;
        if (number <= 1) {
            System.out.print(number);
            return;
        }
        temp = number % 2;
        toBinary(number >> 1);
        System.out.print(temp);
    }
    public static String toOctal(){
        String res = "";
        int temp;
        int n = number;

        while(n>0)
        {
            temp=n%8;
            res=octalchars[temp]+res;
            n=n/8;
        }
        return res;
    }

    public static String toHex(){
        String res = "";
        int temp;
        int n = number;
        while(n>0)
        {
            temp=n%16;
            res=hexchars[temp]+res;
            n=n/16;
        }
        return res;
    }


    public static void main(String[] args) {
        init();
    }
}
