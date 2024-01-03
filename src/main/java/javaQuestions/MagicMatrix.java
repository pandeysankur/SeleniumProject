package javaQuestions;

import java.util.ArrayList;
import java.util.List;

public class MagicMatrix {
    public static void main(String[] args) {
        int[][] magicSquare = {{4, 8, 2},
                {4, 5, 7},
                {6, 1, 6}};
        System.out.println("Anand");
        System.out.println("priya");

        List<Integer> number = new ArrayList<>();
        for (int k = 1; k <= 9; k++) {
            number.add(k);
        }

        List<Integer> repetitiveList = new ArrayList<>();
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                if (number.contains(Integer.valueOf(magicSquare[i][j]))) {
                    number.remove(Integer.valueOf(magicSquare[i][j]));
                } else {
                    repetitiveList.add(Integer.valueOf(magicSquare[i][j]));
                }
            }
        }
        System.out.println("Repetitive Value: "+repetitiveList);


        List<int[]> list = new ArrayList<>();
        if (magicSquare[0][0] + magicSquare[0][1] + magicSquare[0][2] != 15) {
            list.add(new int[]{magicSquare[0][0], magicSquare[0][1], magicSquare[0][2]});
        }
        if (magicSquare[1][0] + magicSquare[1][1] + magicSquare[1][2] != 15) {
            list.add(new int[]{magicSquare[1][0], magicSquare[1][1], magicSquare[1][2]});
        }
        if (magicSquare[2][0] + magicSquare[2][1] + magicSquare[2][2] != 15) {
            list.add(new int[]{magicSquare[2][0], magicSquare[2][1], magicSquare[2][2]});
        }
        if (magicSquare[0][0] + magicSquare[1][0] + magicSquare[2][0] != 15) {
            list.add(new int[]{magicSquare[0][0], magicSquare[1][0], magicSquare[2][0]});
        }
        if (magicSquare[0][1] + magicSquare[1][1] + magicSquare[2][1] != 15) {
            list.add(new int[]{magicSquare[0][1], magicSquare[1][1], magicSquare[2][1]});
        }
        if (magicSquare[0][2] + magicSquare[1][2] + magicSquare[2][2] != 15) {
            list.add(new int[]{magicSquare[0][2], magicSquare[1][2], magicSquare[2][2]});
        }
        if (magicSquare[0][0] + magicSquare[1][1] + magicSquare[2][2] != 15) {
            list.add(new int[]{magicSquare[0][0], magicSquare[1][1], magicSquare[2][2]});
        }
        if (magicSquare[0][2] + magicSquare[1][1] + magicSquare[2][0] != 15) {
            list.add(new int[]{magicSquare[0][2], magicSquare[1][1], magicSquare[2][0]});
        }

        //
        int cost = 0;
        for (int[] arrayElement : list) {

            int firstValue = arrayElement[0];
            int secondValue = arrayElement[1];
            int thirdValue = arrayElement[2];
            int missingValue = 0;
            if (repetitiveList.contains(Integer.valueOf(firstValue))) {
                missingValue = 15 - (firstValue + secondValue + thirdValue);
                int missingNumber = firstValue + missingValue;
                if(missingValue <0){
                    continue;
                }
                if (!repetitiveList.contains(missingNumber)) {
                    repetitiveList.add(Integer.valueOf(missingNumber));
                }
                repetitiveList.remove(Integer.valueOf(firstValue));
                cost = cost + missingValue;
                continue;
            }
            if (repetitiveList.contains(Integer.valueOf(secondValue))) {
                missingValue = 15 - (firstValue + secondValue + thirdValue);
                int missingNumber = secondValue + missingValue;
                if(missingValue <0){
                    continue;
                }
                if (!repetitiveList.contains(missingNumber)) {
                    repetitiveList.add(Integer.valueOf(missingNumber));
                }
                repetitiveList.remove(Integer.valueOf(secondValue));
                cost = cost + missingValue;
                continue;
            }
            if (repetitiveList.contains(Integer.valueOf(thirdValue))) {
                missingValue = 15 - (firstValue + secondValue + thirdValue);
                int missingNumber = thirdValue + missingValue;
                if(missingValue <0){
                    continue;
                }
                if (!repetitiveList.contains(missingNumber)) {
                    repetitiveList.add(Integer.valueOf(missingNumber));
                }
                repetitiveList.remove(Integer.valueOf(thirdValue));
                cost = cost + missingValue;
            }
        }
        System.out.println("Cost:: "+cost);

    }
}

