/*16. Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101*/
package javaprogrammes;

import java.util.Scanner;

public class JavaProgramme16 {
    public static void main(String[] args) {
        JavaProgramme16 javaProgramme16 = new JavaProgramme16();
        javaProgramme16.myMethod();
    }
    public void myMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        String num1 = scanner.nextLine();
        int first = Integer.parseInt(num1,2);
        System.out.println("Enter second number: ");
        String num2 = scanner.nextLine();
        int second = Integer.parseInt(num2,2);
        int sum = first + second;
        System.out.print("Sum of two binary numbers = ");
        System.out.println(Integer.toBinaryString(sum));
        scanner.close();
    }
}
