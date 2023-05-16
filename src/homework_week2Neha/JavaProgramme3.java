package homework_week2Neha;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class JavaProgramme3 {
    int a = 10;
    static int b = 20;

    public void insMethod() {
        JavaProgramme3 obj = new JavaProgramme3();
        System.out.println(obj.a);
        System.out.println(b);
    }

    public static void staMethod() {
        JavaProgramme3 obj = new JavaProgramme3();
        System.out.println(obj.a);
        System.out.println(b);

    }

    public static void main(String [] args) {
        JavaProgramme3 obj = new JavaProgramme3();
        obj.insMethod();
        staMethod();

    }


}
