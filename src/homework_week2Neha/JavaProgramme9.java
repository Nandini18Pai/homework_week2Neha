package homework_week2Neha;

import java.util.Scanner;

/**
 * a program to convert the upper case to lower case
 */
public class JavaProgramme9 {
    public void intsMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in Uppercase");
        String str = sc.nextLine();
        System.out.println(str.toLowerCase());
    }

    public static void main(String[] args) {
        JavaProgramme9 obj = new JavaProgramme9();
        obj.intsMethod();
    }

}
