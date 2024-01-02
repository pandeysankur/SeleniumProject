package javaQuestions;

public class DiamondStarPrint {
    public static void main(String[] args) {
        int A = 5;

        for (int i = 0; i < A; i++) {
            for (int j = A - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = A - 2; i >= 0; i--) {
            for (int j = A - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
