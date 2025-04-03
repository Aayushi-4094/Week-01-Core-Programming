package day4.level1;

import java.lang.*;
import java.util.Scanner;
public class Ques12 {
    final static double PI = 3.14;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the angle in degrees");
        double angle = sc.nextDouble();
        double radians = angle * PI/180;
        System.out.println("Angle in degrees is " + angle + " and in radians " + radians);
        double[] result = calculateTrigonometricFunctions(radians);
        System.out.println("The sin is " + result[0] + " in cos " + result[1] + " and tan is " + result[2]);

    }
    public static double[] calculateTrigonometricFunctions(double radians){
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);
        return new double[]{sinValue, cosValue, tanValue};
    }
    
}
