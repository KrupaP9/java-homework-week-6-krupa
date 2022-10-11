package javaprogrammes;

/*
3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class JavaProgramme3 {
    int num4= 100; //instance variable
    static int num5 = 70;//static variable
    public void myMethod3(){
        //Calling variables into instance method:
        System.out.println(num4);
        System.out.println(JavaProgramme3.num5);
    }

    public static void myMethod4(){
        //Calling variables into static method
        JavaProgramme3 obj = new JavaProgramme3();
        System.out.println(obj.num4);
        System.out.println(num5);
    }

    public static void main(String[] args) {
        JavaProgramme3 javaProgramme3 = new JavaProgramme3();
        javaProgramme3.myMethod3();
        myMethod4();
    }

}
