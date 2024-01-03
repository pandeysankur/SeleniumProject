package javaQuestions;

import java.util.ArrayList;
import java.util.List;

public class MagicSquare {
    public static void main(String[] args) {
        int[][] MagicSquare = {{5, 3, 4},
                {1, 5, 8},
                {6, 4, 2}};

        int SumListOne = MagicSquare[0][0] + MagicSquare[0][1] + MagicSquare[0][2];
        int SumListTwo = MagicSquare[1][0] + MagicSquare[1][1] + MagicSquare[1][2];
        int SumListThree = MagicSquare[2][0] + MagicSquare[2][1] + MagicSquare[2][2];
        int SumListFour = MagicSquare[0][0] + MagicSquare[1][0] + MagicSquare[2][0];
        int SumListFive = MagicSquare[0][1] + MagicSquare[1][1] + MagicSquare[2][1];
        int SumListSix = MagicSquare[0][2] + MagicSquare[1][2] + MagicSquare[2][2];
        int SumListSeven = MagicSquare[0][0] + MagicSquare[1][1] + MagicSquare[2][2];
        int SumListEight = MagicSquare[0][2] + MagicSquare[1][1] + MagicSquare[2][0];




        List<int []> list=new ArrayList<>();


        if (SumListOne != 15) {
            System.out.println("SumListOne");
        }
        if (SumListTwo != 15) {
            System.out.println("SumListTwo");
        }
        if (SumListThree != 15) {
            System.out.println("SumListThree");
        }
        if (SumListFour != 15) {
            System.out.println("SumListFour");
        }
        if (SumListFive != 15) {
            System.out.println("SumListFive");
        }
        if (SumListSix != 15) {
            System.out.println("SumListSix");
        }
        if (SumListSeven != 15) {
            System.out.println("SumListSeven");
        }
        if (SumListEight != 15) {
            System.out.println("SumListEight");
        }

        List<Integer> number = new ArrayList<>();
        for (int k = 1; k <= 9; k++) {
            number.add(k);
        }
        System.out.println(number);
        List<Integer> repetativeList = new ArrayList<>();


        for (int i = 0; i < MagicSquare.length; i++) {
            for (int j = 0; j < MagicSquare.length; j++) {
                if (number.contains(Integer.valueOf(MagicSquare[i][j]))) {
                    number.remove(Integer.valueOf(MagicSquare[i][j]));
                } else {
                    repetativeList.add(Integer.valueOf(MagicSquare[i][j]));
                }
            }
        }
    }
}






