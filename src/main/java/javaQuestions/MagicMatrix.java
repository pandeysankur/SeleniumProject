package javaQuestions;

import java.util.ArrayList;
import java.util.List;

public class MagicMatrix {
    public static void main(String[] args) {
        int[][] magicSquare = {{1, 2, 3},
                          {4,5 , 5},
                           {6, 7, 8}};
        //first number
        List<Integer> number = new ArrayList<>();
        for (int k = 1; k <= 9; k++) {
            number.add(k);
        }
        System.out.println(number);
        //second find four element to check
        List<int[]> list = new ArrayList<>();
        if (magicSquare[0][0] + magicSquare[1][1] + magicSquare[2][2] != 15) {
            list.add(new int[]{magicSquare[0][0], magicSquare[1][1], magicSquare[2][2]});
        }
        if (magicSquare[0][2] + magicSquare[1][1] + magicSquare[2][0] != 15) {
            list.add(new int[]{magicSquare[0][2], magicSquare[1][1], magicSquare[2][0]});
        }
        if (magicSquare[0][1] + magicSquare[1][1] + magicSquare[2][1] != 15) {
            list.add(new int[]{magicSquare[0][1], magicSquare[1][1], magicSquare[2][1]});
        }
        if (magicSquare[1][0] + magicSquare[1][1] + magicSquare[1][2] != 15) {
            list.add(new int[]{magicSquare[1][0], magicSquare[1][1], magicSquare[1][2]});
        }
        //check the central value
        int centerValue = magicSquare[1][1];
        if (centerValue == 5) {
            number.remove(Integer.valueOf(centerValue));
        } else {
            magicSquare[1][1] = 5;
            number.remove(Integer.valueOf(centerValue));
        }
        List<List<Integer>> newValueList = new ArrayList<>();
        for (int[] arrayElement : list) {
            List<Integer> tempList = new ArrayList<>();
            for (int value : arrayElement) {
                tempList.add(value);
            }
            newValueList.add(tempList);
        }



        // Print the values in the newValueList
        for (List<Integer> tempList : newValueList) {
            System.out.println(tempList);
        }
        System.out.println(number);


    }
}
