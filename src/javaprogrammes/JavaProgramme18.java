/*18. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.*/
package javaprogrammes;

import java.util.Scanner;

public class JavaProgramme18 {
    public static void main(String[] args) {
        JavaProgramme18 javaProgramme18 = new JavaProgramme18();
        javaProgramme18.myMethod();
    }
    public void myMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        float num1 = scanner.nextFloat();
        System.out.println("Please enter the second number:");
        float num2 = scanner.nextFloat();
        System.out.println(num1+" + "+num2+" = "+ (num1+num2));
        System.out.println(num1+" - "+num2+" = "+ (num1-num2));
        System.out.println(num1+" x "+num2+" = "+ (num1*num2));
        System.out.println(num1+" / "+num2+" = "+ (num1/num2));
        System.out.println(num1+" mod "+num2+" = "+ (num1%num2));
        scanner.close();
    }
}
