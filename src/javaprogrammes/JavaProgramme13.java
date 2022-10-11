/*13. Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.*/
package javaprogrammes;

import java.util.Scanner;

public class JavaProgramme13 {
    public static void main(String[] args) {
        myMethod();
    }
    public static void myMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        float num1 = scanner.nextFloat();
        System.out.println("Enter the second number");
        float num2 = scanner.nextFloat();
        System.out.println("Enter the third number");
        float num3 = scanner.nextFloat();
        System.out.println("Average = "+ (num1+num2+num3)/3);
        scanner.close();
    }
}
