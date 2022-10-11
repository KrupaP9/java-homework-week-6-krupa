/*14. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/
package javaprogrammes;

import java.util.Scanner;

public class JavaProgramme14 {
    public static void main(String[] args) {
        myMethod();
    }
    public static void myMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the width of the rectangle:");
        double width = scanner.nextDouble();
        System.out.println("Please enter the height of the rectangle:");
        double height = scanner.nextDouble();

        System.out.println("Area is "+width + " * " + height + " = " +width*height );
        System.out.println("Perimeter is 2 * ("+width + " + "+ height + ") = " +(2*(width+height)) );
        scanner.close();
    }
}
