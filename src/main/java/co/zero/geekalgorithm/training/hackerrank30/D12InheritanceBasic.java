package co.zero.geekalgorithm.training.hackerrank30;

import java.util.Scanner;
import java.util.*;

//D12 - Inheritance practice
public class D12InheritanceBasic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();
        
        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;
    
    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    
    // Print person data
    public void printPerson(){
        System.out.println("Name: " + lastName + ", " + firstName+ 	"\nID: " + idNumber);
    }
}

class Student extends Person{
    private int[] testScores;
    
    private enum Scale {
        O(90, 101), E(80, 90), A(70, 80), P(55,70), D(40,55), T(0, 40);
        int min, max;
        
        Scale(int min, int max){
            this.min = min;
            this.max = max;
        }
        
        static Optional<Scale> getScale(double average) {
            for(Scale scale : Scale.values()) {
                if (scale.min <= average && average < scale.max) {
                    return Optional.of(scale);
                }
            }
            
            return Optional.empty();
        }
    }
    
    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        this.testScores = scores;
    }
    
    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public String calculate() {
        double average = Arrays.stream(this.testScores).average().orElse(0);
        return Scale.getScale(average).map(s -> s.toString()).orElse("");
    }
}
