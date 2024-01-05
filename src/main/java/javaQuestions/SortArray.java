package javaQuestions;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -1, -2, 4};

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
        /////////////////////////////////////////
        String[] stringArray = {"a", "s", "o", "g"};

        Arrays.sort(stringArray);

        System.out.println("Sorted String Array:");
        for (String element : stringArray) {
            System.out.println(element);
        }
    }

}

