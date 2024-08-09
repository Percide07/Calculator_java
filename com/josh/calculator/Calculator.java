package com.josh.calculator;

import java.util.*;

public class Calculator {

    static double val1, val2;
    static char op;
    static double result;
    static Scanner scanner = new Scanner(System.in);

    public static void operation() {
        System.out.println("Enter the first value: ");
        val1 = scanner.nextDouble();
        System.out.println("Enter the second value: ");
        val2 = scanner.nextDouble();
        System.out.println("Enter the operator (+, -, *, /): ");
        op = scanner.next().charAt(0);

        switch (op) {
            case '-':
                result = val1 - val2;
                System.out.println("The result is: " + result);
                break;
            case '+':
                result = val1 + val2;
                System.out.println("The result is: " + result);
                break;
            case '*':
                result = val1 * val2;
                System.out.println("The result is: " + result);
                break;
            case '/':
                result = val1 / val2;
                if (val2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("The result is: " + result);
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please enter one of +, -, *, /.");
        }

    }

    public static void main(String[] args) {
        operation();
    }
}



