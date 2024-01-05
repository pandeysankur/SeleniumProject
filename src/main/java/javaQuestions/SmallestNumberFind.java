package javaQuestions;

public class SmallestNumberFind {
    public static void main(String[] args) {
        int[] intValues = { -12, -2, -4, -11, -1, -3, 0 };
        int minNumber = 0;
        for (int i = 0; i < intValues.length; i++) {
            if (intValues[i] < minNumber) {
                minNumber = intValues[i];
            }
        }
        System.out.println("Smallest Number:"+minNumber);
    }
}
