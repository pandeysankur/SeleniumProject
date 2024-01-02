package javaQuestions;

import java.util.Arrays;

public class MargeStringArray {
        public static void main(String[] args) {
            String[] array1 = {"banana", "apple", "orange", "grape"};
            String[] array2 = {"zebra", "lion", "elephant", "tiger"};

            String[] mergedArray = mergeArrays(array1, array2);


            Arrays.sort(mergedArray);

            System.out.println("Sorted Merged Array:");
            for (String element : mergedArray) {
                System.out.println(element);
            }
        }
        private static String[] mergeArrays(String[] arr1, String[] arr2) {

            String[] result = new String[arr1.length + arr2.length];

            System.arraycopy(arr1, 0, result, 0, arr1.length);


            System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
            return result;
        }
    }



