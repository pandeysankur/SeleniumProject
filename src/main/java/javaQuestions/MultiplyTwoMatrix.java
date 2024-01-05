package javaQuestions;

public class MultiplyTwoMatrix {
    public static void main(String[] args) {
        int arr1[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        int arr2[][] = {{1, 3, 4}, {2, 4, 3}, {1, 2, 4}};

        int size[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                size[i][j] = arr1[i][j] * arr2[i][j];
                System.out.print(size[i][j] + " ");
            }
            System.out.println();
        }
    }
}
