package javaQuestions;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int intValue = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= intValue; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of the number: " + fact);
        sc.close();
    }
}
