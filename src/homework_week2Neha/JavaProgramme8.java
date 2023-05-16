package homework_week2Neha;

import java.util.Scanner;

/**
 * program to calculate the area of a triangle.
 */

public class JavaProgramme8 {
    public void insMethod () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input height : ");
        float num1 = sc.nextFloat();
        System.out.print("Input base number : ");
        float num2 = sc.nextFloat();
        System.out.println("Area of a triangle = " + (0.5 * num1 * num2));
    }
    public static void main(String[] args) {
        JavaProgramme8 obj = new JavaProgramme8();
        obj.insMethod();
    }
}

