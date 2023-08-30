package org.example;

import java.util.Arrays;

public class Exam {
    public static void main(String a[]) {
        int[] myArr = {2, 4, 2, 4, 7, 6, 3};
        System.out.println("My array elements: ");
        for (int num : myArr) {
            System.out.print(num + " ");
        }
        int[] newArr = new int[]{Arrays.binarySearch(myArr, 0, myArr.length - 1, 7)};
        System.out.println("My new array elements: ");

        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}