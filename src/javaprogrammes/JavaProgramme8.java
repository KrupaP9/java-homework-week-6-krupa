//8. Write a program to calculate the area of a triangle.
package javaprogrammes;

import java.util.Scanner;

public class JavaProgramme8 {
    public static void main(String[] args) {
        JavaProgramme8 javaProgramme8 = new JavaProgramme8();
        javaProgramme8.myMethod();
    }

    public void myMethod() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter base of triangle:");
            double b = scanner.nextDouble();
            System.out.println("Enter height of triangle:");
            double h = scanner.nextDouble();
            System.out.println("Area of the triangle = " + (b * h * 1/2) );
            scanner.close();
        }
    }
