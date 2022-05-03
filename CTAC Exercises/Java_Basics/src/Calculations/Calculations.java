package Calculations;

import java.util.Scanner;

class Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1;
        double num2;
        System.out.println("Please enter the first number: ");
        num1 = scan.nextDouble();
        System.out.println("Please enter the second number: ");
        num2 = scan.nextDouble();
        System.out.println("Addition: " + addition(num1, num2));
        System.out.println("Subtraction 1: " + subtract(num1, num2));
        System.out.println("Subtraction 2: " + subtract(num2, num1));
        System.out.println("Multiplicatoin: " + multiply(num1, num2));
        System.out.println("Division 1: " + division(num1, num2));
        System.out.println("Division 2: " + division(num2, num1));
        System.out.println("Modulus 1: " + modus(num1, num2));
        System.out.println("Modulus 2: " + modus(num2, num1));
    }

    public static int addition(double a, double b) {
        return (int) a + (int) b;
    }

    public static int subtract(double c, double d) {
        return (int) c - (int) d;
    }

    public static double multiply(double e, double f) {
        return e * f;
    }

    public static double division(double g, double h) {
        return g / h;
    }

    public static double modus(double i, double j) {
        return i % j;
    }
}