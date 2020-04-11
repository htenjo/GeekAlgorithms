package co.zero.geekalgorithm.training.hackerrank30;

//Day 9
public class D09Recursion {
    // Complete the factorial function below.
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("factorial(0) = " + factorial(0));
        System.out.println("factorial(1) = " + factorial(1));
        System.out.println("factorial(2) = " + factorial(2));
        System.out.println("factorial(3) = " + factorial(3));
        System.out.println("factorial(4) = " + factorial(4));
        System.out.println("factorial(5) = " + factorial(5));
    }
}
