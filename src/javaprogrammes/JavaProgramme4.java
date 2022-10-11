/*4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.*/
package javaprogrammes;

public class JavaProgramme4 {
    static String name1 = "Kiara";
    int age1 = 25;
    String name2 = "Kieran";
    static int age2 = 35;
    public void myMethod1(){
        System.out.println(JavaProgramme4.name1);
        System.out.println(age1);
        System.out.println(name2);
        System.out.println(JavaProgramme4.age2);
    }
    public static void myMethod2(){
        System.out.println(name1);
        JavaProgramme4 obj = new JavaProgramme4();
        System.out.println(obj.age1);
        JavaProgramme4 obj2 = new JavaProgramme4();
        System.out.println(obj2.name2);
        System.out.println(age2);
    }

    public static void main(String[] args) {
        JavaProgramme4 obj3 = new JavaProgramme4();
        obj3.myMethod1();
        myMethod2();
    }
}
