/*17. Write a Java program to convert a decimal number to binary number.
Input Data:
Input a Decimal Number : 5
Expected Output
Binary number is: 101*/
package javaprogrammes;

import java.util.Scanner;

public class JavaProgramme17 {
    public static void main(String[] args) {
        myMethod();
    }
    public static void myMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num1 = scanner.nextInt();
        System.out.println("Binary number is: "+Integer.toBinaryString(num1));
        scanner.close();
    }
}
