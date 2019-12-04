import java.util.Random;
import java.util.Scanner;

public class Task_1_5 {

    int[][] element;
    int rows;
    int cols;
    Random rand = new Random();
   static Scanner scanner = new Scanner(System.in);




    Task_1_5(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        element = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                element[i][j] = rand.nextInt(10);
            }
        }
    }

    public int getValue(int row, int col) {
        return this.element[row][col];
    }

    public void setValue(int row, int col, int value) {
        this.element[row][col] = value;
    }

    public int getNoRows() {
        return this.rows;
    }

    public int getNoCols() {
        return this.cols;
    }

    private void changeRowsCols() {
        int tmp;
        tmp = this.getNoRows();
        this.rows = this.getNoCols();
        this.cols = tmp;
    }

    public void DisplayMatrix() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print((this.element[i][j]) + " ");
            }
            System.out.print("\n");
        }
    }

    private void rotate90() {
        int[][] rotMat = new int[this.cols][this.rows];

        for (int rw = 0; rw < this.rows; rw++)
            for (int cl = 0; cl < this.cols; cl++) {
                rotMat[this.cols - 1 - cl][rw] = this.element[rw][cl];
            }

        this.element = rotMat;
        changeRowsCols();

    }

    private void numberOfChange(Task_1_5 m, int cols) {
        for (int i = 0; i < cols; i++) {
            m.rotate90();
            System.out.println(" ");
            m.DisplayMatrix();
        }
    }

    public static void init() {
        int row, col;
        System.out.println("Enter columns");
        row = scanner.nextInt();
        System.out.println("Enter rows");
        col = scanner.nextInt();
        Task_1_5 m = new Task_1_5(row, col);
        m.DisplayMatrix();
        m.numberOfChange(m, col);


    }


    public static void main(String[] args) {
        init();
    }
}

