package javaQuestions;

public class FactorialNumber {
    public static void main(String[] args) {
        int number = 5;
        long factorial = findFactorial(number);
        System.out.println("Factorial of " + number + " = " + factorial);
    }

    // Recursive method to find factorial
    public static long findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }
}
