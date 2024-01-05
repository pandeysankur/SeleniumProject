package javaQuestions;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicatesLinklist {
    public static void main(String[] args)
    {


        ArrayList<String> lang = new ArrayList<String>();
        lang.add("JAVA");
        lang.add("J2EE");
        lang.add("TESTING");
        lang.add("SERVLETS");
        lang.add("JAVA");
        lang.add("C++");
        lang.add("TESTING");
        HashSet<String> set = new HashSet<String>(lang);


        ArrayList<String> listWithoutDuplicateElements = new ArrayList<>(set);


        System.out.print(" After Removing Duplicate Elements :");

        System.out.println(listWithoutDuplicateElements);
    }
}
