package org.example;

import com.mysql.cj.log.Log;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CaseInsensitiveSorting {
    public static void main(String[] args) {
        List<String> name= Arrays.asList("Rohan","sita","Ram","AmiT");
        List<String >sortedName=name.stream().sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());
        System.out.println(sortedName);
    }
}
