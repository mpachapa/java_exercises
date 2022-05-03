package Conditionals;

import java.util.Scanner;

public class Conditionals {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a temperature above 212:");
        int input = scan.nextInt();
        if (input >= 212) {
            System.out.println("It's BOILING");
        } else
            System.out.println("It might be hot");

        //Two number comparison
        System.out.println("\nPlease enter two numbers seperated by enter:");
        int num1 = scan.nextInt();
        System.out.println("Please enter the second number:");
        int num2 = scan.nextInt();
        if (num1 == num2) {
            System.out.println("It's the same number!");
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else
            System.out.println(num2 + " is greater than " + num1);

        //Test score comparison
        System.out.println("\nPlease enter a grade (0 to 100)");
        int grade = scan.nextInt();
        if (grade >= 90) {
            System.out.println("It is an A: " + grade);
        } else if (grade >= 80) {
            System.out.println("It is a B: " + grade);
        } else if (grade >= 70) {
            System.out.println("It is a C: " + grade);
        } else if (grade >= 60) {
            System.out.println("It is a D: " + grade);
        } else
            System.out.println("It is a F: " + grade);
        System.out.println("\n");
        String throwaway = scan.nextLine();
        //Same words or not
        System.out.println("Please enter two words,");
        System.out.println("Please enter the first word:");
        String word1 = scan.nextLine();
        System.out.println("Please enter the second word:");
        String word2 = scan.nextLine();
        if(word1.equals(word2)){
            System.out.println(word1 + " " + word2 +" They're the same word!");
        } else if (word1.equalsIgnoreCase(word2)){
            System.out.println(word1 + " " + word2 +" They're the same word! But different cases.");
        } else
            System.out.println(word1 + " " + word2 +" They're not the same word!");
        }
    }

