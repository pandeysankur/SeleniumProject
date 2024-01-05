package javaQuestions;

import java.util.ArrayList;
import java.util.List;

public class ListToMatrix {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        int rows = Math.max(list1.size(), list2.size());
        int cols = 3;

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < list1.size(); i++) {
            matrix[i][0] = list1.get(i);
        }

        for (int i = 0; i < list2.size(); i++) {
            matrix[i][1] = list2.get(i);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
