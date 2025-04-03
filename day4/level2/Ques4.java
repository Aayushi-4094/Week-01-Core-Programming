package day4.level2;

import java.util.*;
public class Ques4 {
    static final double KM_2_MILES = 0.621371;
    static final double MILES_2_KM = 1.60934;
    static final double METERS_2_FEET = 3.28084;
    static final double FEET_2_METERS = 0.3048;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance ");
        double distance = sc.nextDouble();
        double kmToMi = convertKmToMiles(distance);
        System.out.println("Distance in miles is : " +kmToMi);
        double miToKm = convertMilesToKm(distance);
        System.out.println("Distance in kilometers is : " +miToKm);
        double mToFt = convertMetersToFeet(distance);
        System.out.println("Distance in feet is : " +mToFt);
        double ftToM = convertFeetToMiles(distance);
        System.out.println("Distance in meters is : " + ftToM);
    }
    public static double convertKmToMiles(double distance){
        return distance * KM_2_MILES;
    }
    public static double convertMilesToKm(double distance){
        return distance * MILES_2_KM;
    }
    public static double convertMetersToFeet(double distance){
        return distance * METERS_2_FEET;
    }
    public static double convertFeetToMiles(double distance){
        return distance * FEET_2_METERS; 
    }
}
