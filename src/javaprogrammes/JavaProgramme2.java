package javaprogrammes;

/*
2. Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.
 */
public class JavaProgramme2 {
    static int num3= 21;
    static String name1= "Krupa";
    public static void myMethod2(){
        System.out.println(num3);
        System.out.println(name1);
    }
    public static void main(String[] args) {
        myMethod2();
    }
}
