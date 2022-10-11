/*
6. Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
 */
package javaprogrammes;
import java.util.Scanner;

public class JavaProgramme6 {
    public static void main(String[] args) {
        myMethod();
    }
    public static void myMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of the circle:");
        double r = scanner.nextDouble();
        double pi = 3.14;
        System.out.println("Area of the circle = "+ pi*r*r);
        scanner.close();
    }
}
