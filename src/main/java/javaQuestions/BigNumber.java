package javaQuestions;

import java.util.Arrays;
import java.util.List;

public class BigNumber {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(5, 3, 15, 234, 114, 1540);
        int maxValue = Integer.MIN_VALUE;
        for (Integer integer : arrayList) {
            if (integer > maxValue) {
                maxValue = integer;
            }
        }
    }
}
