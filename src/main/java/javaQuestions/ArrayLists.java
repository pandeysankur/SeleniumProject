package javaQuestions;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayLists {
    public static void main(String[] args) {
        /*ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("C++");
        list.add("Python");
        ListIterator<String> lit=list.listIterator(list.size());
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }*/
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        boolean hasBanana = fruits.stream().anyMatch(fruit -> fruit.equals("Banana"));
        System.out.println(hasBanana ? "The list contains Banana" : "The list does not contain Banana");
    }

}
