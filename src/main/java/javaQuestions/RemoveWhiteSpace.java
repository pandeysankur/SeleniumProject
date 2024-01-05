package javaQuestions;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String originalString = "   This is a string with white spaces.   ";

        String stringWithoutSpaces = originalString.replaceAll("\\s", "");
        String trimmedString = originalString.trim();

        System.out.println("Original string: " + originalString);
        System.out.println("String without spaces: " + stringWithoutSpaces);
        System.out.println("String without spaces with trim method: " + trimmedString);

    }
}
