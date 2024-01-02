package javaQuestions;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intValue = sc.nextInt();
        for (int i = 2; i <= intValue; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        sc.close();

    }
}
