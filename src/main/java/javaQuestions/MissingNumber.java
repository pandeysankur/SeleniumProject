package javaQuestions;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        String stringValue = number + "";

        String reverse = "";
        for (int i = 0; i < stringValue.length(); i++) {
            int mod = number % 10;
            number = number / 10;
            reverse = reverse + mod;
        }
        System.out.println(reverse);
        sc.close();
    }
}
