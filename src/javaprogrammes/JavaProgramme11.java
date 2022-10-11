/*11. Write a Java program to display the following pattern.
Sample Pattern :
J a v v a
J a a v v a a
J J aaaaa V V aaaaa
J J a a V a a*/
package javaprogrammes;

public class JavaProgramme11 {
    public static void main(String[] args) {
        JavaProgramme11 javaProgramme11 = new JavaProgramme11();
        javaProgramme11.myMethod();
    }
    public void myMethod(){
        System.out.println("J  a v  v a");
        System.out.println("J a a v v a a");
        System.out.println("J J aaaaa V V aaaaa");
        System.out.println("J J a   a V a  a");
    }
}
