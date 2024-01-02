package javaQuestions;

import java.util.Scanner;

public class CompareTwoString {
    public static void main(String[] args) {
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String ");
        s1 = sc.nextLine();
        System.out.println("Enter the Second String ");
        s2 = sc.nextLine();
        if (s1.compareTo(s2) > 0) {
            System.out.println("first String is greater than second");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("first String is smaller than second");
        } else {
            System.out.println("Both String are equal");
        }


    }


}
