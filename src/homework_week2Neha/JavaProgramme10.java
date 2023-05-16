package homework_week2Neha;

import java.util.Scanner;

/**
 * a Java program that takes a number as input and prints its multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output : 8 x 1 = 8
 */

public class JavaProgramme10 {
    public void instMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        int i = 1;
        System.out.println(a+" * " + i + " = " +(a*i)); i++;
        System.out.println(a+" * " + i + " = " +(a*i)); i++;
        System.out.println(a+" * " + i + " = " +(a*i)); i++;
        System.out.println(a+" * " + i + " = " +(a*i)); i++;
        System.out.println(a+" * " + i + " = " +(a*i)); i++;
        System.out.println(a+" * " + i + " = " +(a*i)); i++;
        System.out.println(a+" * " + i + " = " +(a*i)); i++;
        System.out.println(a+" * " + i + " = " +(a*i)); i++;
        System.out.println(a+" * " + i + " = " +(a*i)); i++;
        System.out.println(a+" * " + i + " = " +(a*i));

    }
        public static void main(String[] args){
            JavaProgramme10 obj = new JavaProgramme10();
            obj.instMethod();
        }

    }
