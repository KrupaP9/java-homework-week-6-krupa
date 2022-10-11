/*19. Write a Java program to convert a given string into lowercase.
Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output: the quick brown fox jumps over the lazy dog.*/
package javaprogrammes;

import java.util.Scanner;

public class JavaProgramme19 {
    public static void main(String[] args) {
        JavaProgramme19 javaProgramme19 = new JavaProgramme19();
        javaProgramme19.myMethod();
    }

    public void myMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the text you would like to convert to lowercase:");
        String uppercase = scanner.nextLine();
        System.out.println(uppercase.toLowerCase());
        scanner.close();
    }
}

