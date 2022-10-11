//15. Write a Java program to swap two variables.
package javaprogrammes;

import java.util.Scanner;

public class JavaProgramme15 {
    public static void main(String[] args) {
        myMethod();
    }
    public static void myMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        double x = scanner.nextDouble();
        System.out.println("Please enter second number");
        double y = scanner.nextDouble();
        double temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x = "+ x  + " and y = " + y);
        scanner.close();
    }
}
