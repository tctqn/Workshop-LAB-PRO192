package workshop1;
import java.util.Scanner;
public class Part1 {
    public static void main(String[] args) {
        int matrix[][];
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = inp.nextInt();
        System.out.print("Enter number of columns: ");
        int col = inp.nextInt();
        matrix = new int [row][col];
        System.out.print("Enter the matrix:  \n");
        for(int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                System.out.print("m[" + i + "][" + j + "] = "  );
                matrix[i][j] = inp.nextInt();
            }
        }
        System.out.print("Matrix inputted \n");
        int sum =0;
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                System.out.format("%3d", matrix[i][j]);
                sum+=matrix[i][j];
            }
            System.out.println("");
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average: " + (float)sum/(col*row));
    }
}
