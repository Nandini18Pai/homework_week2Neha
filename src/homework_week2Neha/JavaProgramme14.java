package homework_week2Neha;

/**
 * a Java program to print the area and perimeter of a rectangle.
 * Test Data: Width = 5.6 Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;
 public class JavaProgramme14 {
   public void instMethod(){

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter width value:  ");
        Double width = sc.nextDouble();
        System.out.print(" Enter height value:  ");
        Double height = sc.nextDouble();
        double area = (width * height) ;
        double perimeter = 2 *( width + height);
       // System.out.println("Area is " + width +" * "+ height + "=" + area);
      //  System.out.println( "Perimeter is 2 * " + "("+ width + "+" + height + ")" + " = " + perimeter);
        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f \n", height, width, perimeter);
    }

    public static void main(String[] args) {
        JavaProgramme14 obj = new JavaProgramme14();
        obj.instMethod();

    }
}
