/*5. Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)*/
package javaprogrammes;

import java.util.Scanner;

public class JavaProgramme5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
        System.out.println("Please enter the operator. Type + or - or * or /");
        char choice = scanner.next().charAt(0);

        if (choice == '+') {
            addition(num1, num2);
        }
        if (choice == '-') {
            subtraction(num1, num2);
        }
        if (choice == '*') {
            JavaProgramme5 multiply = new JavaProgramme5();
            multiply.multiplication(num1, num2);
        }
        if (choice == '/') {
            JavaProgramme5 divide = new JavaProgramme5();
            divide.division(num1, num2);
        }
        scanner.close();
    }

    public static void addition(double num1, double num2) {
        System.out.println("Result = " + (num1 + num2));
    }

    public static void subtraction(double num1, double num2) {
        System.out.println("Result = " + (num1 - num2));
    }

    public void multiplication(double num1, double num2) {
        System.out.println("Result = " +(num1 * num2));
    }

    public void division(double num1, double num2) {
        System.out.println("Result = " +(num1 / num2));
    }
}
