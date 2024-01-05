package javaQuestions;

import java.util.*;

public class XTypePatternPrint {
    public static void main(String[] args) {

        List<List<Integer>> mat = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            List<Integer> inner = new ArrayList<>();
            for (int j = 1; j <= 5; j++) {
                inner.add(j);
            }
            mat.add(inner);
        }
        //print2D(arr);
        System.out.println(mat);
    }


    public static void print2D(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

}
