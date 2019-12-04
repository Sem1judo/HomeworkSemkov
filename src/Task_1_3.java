import java.util.Scanner;

public class Task_1_3 {
    private static Scanner scanner = new Scanner(System.in);


    public static int scanNumber() {
        System.out.print("Please enter your triangle height in range 1-9: ");
        return scanner.nextInt();
    }

    public static void draw() {

        int rowCount = 1;

        boolean flag = false;

        do {
            int noOfRows = scanNumber();
            if ((noOfRows <= 9) && (noOfRows >= 1)){
                for (int i = noOfRows; i > 0; i--) {
                    for (int j = 1; j <= i * 2; j++) {
                        System.out.print(" ");
                    }

                    for (int j = 1; j <= rowCount; j++) {
                        System.out.print(j + " ");
                    }

                    for (int j = rowCount - 1; j >= 1; j--) {
                        System.out.print(j + " ");
                    }

                    System.out.println();

                    rowCount++;
                    flag = true;
                }
            }else {
                System.out.println("Wrong, height have to be between 1-9\nTry enter height again ");
            }
        } while (!flag);


    }


    public static void main(String[] args) {
        draw();
    }
}
