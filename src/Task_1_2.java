import java.util.Scanner;

public class Task_1_2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void init() {
        int till = scanNumber();
        {
            for (int i = 2; i < till; i++)
                if (isAbsolute(i)) {
                    System.out.println(i + " is a perfect number in range of 1-"+till);
                }
        }
    }

    public static int scanNumber() {
        System.out.print("Please enter your number: ");
        return scanner.nextInt();
    }

    static boolean isAbsolute(int n) {
        int sum = 1;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i != n)
                    sum = sum + i + n / i;
                else
                    sum = sum + i;
            }
        }
        if (sum == n && n != 1)
            return true;

        return false;
    }

    public static void main(String[] args) {
        init();
    }
}

