package javaQuestions;

import java.util.Scanner;

public class OddNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (odd(number)) {
            System.out.println(number + " is an odd number.");
        } else {
            System.out.println(number + " is not an odd number.");
        }

        scanner.close();
    }

    private static boolean odd(int number) {
        return number % 2 != 0;
    }

}

