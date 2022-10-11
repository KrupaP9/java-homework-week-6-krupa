package javaprogrammes;

/*
1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
 */
public class JavaProgramme1 {
    int num1 = 10;
    int num2 = 25;

    public void myMethod() {
        System.out.println(num1);
        System.out.println(num2);
    }

    public static void main(String[] args) {
        JavaProgramme1 obj = new JavaProgramme1();
        obj.myMethod();
    }
}
