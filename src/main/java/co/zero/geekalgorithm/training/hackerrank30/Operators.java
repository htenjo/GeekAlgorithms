package co.zero.geekalgorithm.training.hackerrank30;

import java.util.Scanner;

//Day 1
public class Operators {
    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tipValue = (meal_cost * tip_percent) / 100;
        double taxValue = (meal_cost * tax_percent) / 100;
        double totalCost = meal_cost + taxValue + tipValue;
        long totalValue = Math.round(totalCost);
        System.out.println(totalValue);
    }
    
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        solve(meal_cost, tip_percent, tax_percent);
        
        scanner.close();
    }
}
