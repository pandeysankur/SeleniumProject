package javaQuestions;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("How Many Rows");
        int rows = sc.nextInt();


        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }


            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
