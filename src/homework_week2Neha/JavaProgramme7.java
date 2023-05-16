package homework_week2Neha;

import java.util.Scanner;

/** Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class JavaProgramme7 {
float D;
    public void instMethod () {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input temperature : ");
         D = sc.nextFloat();
        System.out.println("Temperature in a Degree Celsius = " + ((D - 32) * 5/9));
    }

public static void main(String [] args) {
    JavaProgramme7 obj = new JavaProgramme7();
    obj.instMethod();


}



}
