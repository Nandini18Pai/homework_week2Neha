package homework_week2Neha;

/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class JavaProgramme1 {
int x = 10;
int y = 20;
    public void insMethod(){
    JavaProgramme1 obj = new JavaProgramme1();
        System.out.println(obj.x);
        System.out.println(obj.y);
    }

    public static void main(String [] args){
        JavaProgramme1 obj = new JavaProgramme1();
        obj.insMethod();

    }


}
