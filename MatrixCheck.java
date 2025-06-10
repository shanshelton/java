import java.util.Scanner;
public class MatrixCheck {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = s.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = s.nextInt();
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = s.nextInt();
        System.out.println("Input Matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.println();
        }
        if (rows != cols) {
            System.out.println("The given matrix is not symmetric");
        } else {
            boolean symmetric = true;
            outer:
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        symmetric = false;
                        break outer; // exits both loops
                    }    }    }
            if (symmetric)
                System.out.println("The given matrix is Symmetric");
            else
                System.out.println("The given matrix is not Symmetric");
        }
        s.close();
    }   }
