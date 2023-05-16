package homework_week2Neha;

/**
 * a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class JavaProgramme5 {
    public void addition(int a, int b) {
        int ans = a + b;
        System.out.println("Addition of two number " + a + " and " + b + " = " + ans);
        // JavaProgramme5 obj = new JavaProgramme5();
    }
public void subtraction(int a, int b){
        int ans = a-b;
    System.out.println("Subtraction of two number " + a + " and " + b + " = " + ans);
    }
    public static void division(int a, int b) {
        int ans = a/b;
        System.out.println("Division of two number " + a + " and " + b + " = " + ans);
    }
    public static void multiplication(int a, int b) {
        int ans = a*b;
        System.out.println("multiplication of two number " + a + " and " + b + " = " + ans);
    }
    public static void main(String[] args) {
        JavaProgramme5 obj = new JavaProgramme5();
        obj.addition(50,20);
        obj.subtraction(50,20);
        division(50,20);
        multiplication(50,20);
    }

}


