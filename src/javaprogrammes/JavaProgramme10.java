/*10. Write a Java program that takes a number as input and prints its
multiplication table up to 10.*/
package javaprogrammes;

import java.util.Scanner;

public class JavaProgramme10 {
    public static void main(String[] args) {

        myMethod();
    }

    public static void myMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number for which you would like to generate a multiplication table:");
        int num = scanner.nextInt();
        System.out.println(num + " x 1 = " + num);
        System.out.println(num + " x 2 = " + num * 2);
        System.out.println(num + " x 3 = " + num * 3);
        System.out.println(num + " x 4 = " + num * 4);
        System.out.println(num + " x 5 = " + num * 5);
        System.out.println(num + " x 6 = " + num * 6);
        System.out.println(num + " x 7 = " + num * 7);
        System.out.println(num + " x 8 = " + num * 8);
        System.out.println(num + " x 9 = " + num * 9);
        System.out.println(num + " x 10 = " + num * 10);
        scanner.close();

    }
}

