package javaQuestions;

public class ContainsVowels {
    public static void main(String[] args) {
        System.out.println(containsVowels("ankur"));
        System.out.println(containsVowels("nkr"));
    }
    public static boolean containsVowels(String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
