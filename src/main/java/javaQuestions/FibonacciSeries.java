package javaQuestions;
public class FibonacciSeries {
    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void main(String[] args) {
        int terms = 10;
        System.out.println("Fibonacci Series:");
        generateFibonacci(terms);
    }
}
