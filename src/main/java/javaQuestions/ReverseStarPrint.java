package javaQuestions;

public class ReverseStarPrint {
    public static void main(String[] args) {
        int A = 5;

        for (int l = 0; l < A; l++) {

            for (int m = 0; m < l; m++) {
                System.out.print(" ");
            }

            for (int n = 0; n < A - l; n++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
