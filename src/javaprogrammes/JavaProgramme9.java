//9. Write a program to convert the upper case to lower case.
package javaprogrammes;

import java.util.Scanner;

public class JavaProgramme9 {
    public static void main(String[] args) {
        myMethod();
    }
    public static void myMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the text you would like to convert to lowercase:");
        String upper = scanner.nextLine();
        System.out.println(upper.toLowerCase());
        scanner.close();
    }
}
