package javaQuestions;

public class AddTwoMatrix {
    public static void main(String args[]) {

        int arr1[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        int arr2[][] = {{1, 3, 4}, {2, 4, 3}, {1, 2, 4}};
        printMatrix(arr1);
        printMatrix(arr2);
        System.out.println("\nMatrix Sum (A + B):");
        int c[][] = addMatrices(arr1, arr2);
        printMatrix(c);
    }

    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] addMatrices(int a[][], int b[][]) {
        int rows = a.length;
        int columns = a[0].length;
        int result[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }

}
