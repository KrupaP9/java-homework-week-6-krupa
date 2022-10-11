/*7. Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/
package javaprogrammes;
import java.util.Scanner;
public class JavaProgramme7 {
    public static void main(String[] args) {
        myMethod();
    }
    public static void myMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in degrees Fahrenheit:");
        double f = scanner.nextDouble();
        System.out.println("Temperature = "+ ((f-32) * 5/9) + "°C");
        scanner.close();
    }
}
