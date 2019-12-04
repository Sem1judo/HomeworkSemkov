import java.util.Scanner;

public class Task_1_3 {
    private static Scanner scanner = new Scanner(System.in);


    public static int scanNumber() {
        System.out.print("Please enter your height yours triangle: ");
        return scanner.nextInt();
    }

    public static void draw() {
        int noOfRows = scanNumber();

        int rowCount = 1;

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
        }

}


    public static void main(String[] args) {
        draw();
    }
}
