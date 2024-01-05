package javaQuestions;

import java.util.HashMap;

public class DuplicatesElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 9, 3, 10};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();


        System.out.println("Duplicate Elements :");
        for (int num : array) {
            if (frequencyMap.containsKey(num)) {
                System.out.println(num);
            } else {
                frequencyMap.put(num, 1);
            }
        }
    }
}
