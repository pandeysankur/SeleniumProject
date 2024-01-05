package javaQuestions;

import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args) {
        String date = "12-22-2012";
        String[] dateArray = date.split("-");

        int lastElement = dateArray.length-1;

        System.out.println(dateArray[lastElement]);

        System.out.println(Arrays.toString(dateArray));
    }
}
