package javaQuestions;

public class LargestNumber {
    public static int findLargest(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 43, 56, 78, 23, 67};
        int largest = findLargest(numbers);
        System.out.println("Largest Element: " + largest);
    }
}

