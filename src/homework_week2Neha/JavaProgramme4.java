package homework_week2Neha;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class JavaProgramme4 {
int a=20;
int b= 40;
static String name = "Alpha";
static String num = "Tango";

public void insMethod(){
    JavaProgramme4 obj = new JavaProgramme4();
    System.out.println(obj.a);
    System.out.println(obj.b);
    System.out.println(name);
    System.out.println(num);
}
public static void staMethod(){
    JavaProgramme4 obj = new JavaProgramme4();
    System.out.println(obj.a);
    System.out.println(obj.b);
    System.out.println(name);
    System.out.println(num);
}
public static void main(String [] args) {
    JavaProgramme4 obj = new JavaProgramme4();
    obj.insMethod();
    staMethod();
}

}
