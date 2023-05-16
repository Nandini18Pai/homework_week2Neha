package homework_week2Neha;

/**
 * a program to enter any radius value of the circle and find out the  area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class JavaProgramme6 {
    double PI = 3.14;
    public void staticMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number : ");
        int num1 = sc.nextInt();
        JavaProgramme6 obj = new JavaProgramme6();
        System.out.println("Formula of Area A = " + (obj.PI * num1 * num1));
    }
    public static void main(String[] args) {
        JavaProgramme6 obj = new JavaProgramme6();
        obj.staticMethod();
    }
}
