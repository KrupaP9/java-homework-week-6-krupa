/*20. Write a Java Program to print as below.
"+------------------------+"
"|                        |"
"|      CORNER STORE      |"
"|                        |"
"| 2015-03-29   04:38PM   |"
"|                        |"
"| Gallons: 10.870        |"
"| Price/gallon: $ 2.089  |"
"|                        |"
"| Fuel total: $ 22.71    |"
"|                        |"
"+------------------------+"*/
package javaprogrammes;

import java.util.Scanner;

public class JavaProgramme20 {
    public static void main(String[] args) {
        myMethod();
    }
    public static void myMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Date (YYYY-MM-DD)");
        String date = scanner.nextLine();
        System.out.println("Enter Time (hh:mm)");
        String time = scanner.nextLine();
        System.out.println("AM or PM?");
        String ampm = scanner.nextLine();
        System.out.println("Enter Gallons (3 decimal places)");
        float gallons = scanner.nextFloat();
        System.out.println("Enter Price/gallon (3 decimal places)");
        float pricePerGallon = scanner.nextFloat();
        float fuelTotal = gallons*pricePerGallon;
        float fuelTotalroundoff = (float) Math.round(fuelTotal*100)/100;
        System.out.println(" \"+----------------------------+\" ");
        System.out.println(" \"|                            |\" ");
        System.out.println(" \"|        CORNER STORE        |\" ");
        System.out.println(" \"|                            |\" ");
        System.out.println(" \"|   " +date+" "+time+ampm+"       |\" ");
        System.out.println(" \"|                            |\" ");
        System.out.println(" \"| Gallons:        "+gallons+ "      |\" ");
        System.out.println(" \"| Price/gallon:  $ "+pricePerGallon+"     |\" ");
        System.out.println(" \"|                            |\" ");
        System.out.println(" \"| Fuel total:    $ "+fuelTotalroundoff+"     |\" ");
        System.out.println(" \"|                            |\" ");
        System.out.println(" \"+----------------------------+\" ");
        scanner.close();
    }
}
