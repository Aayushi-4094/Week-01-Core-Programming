package day4.level2;

import java.util.Scanner;

public class Ques5 {
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet / 3.0;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length in yards: ");
        double yards = scanner.nextDouble();

        double feet = convertYardsToFeet(yards);
        double yardsFromFeet = convertFeetToYards(feet);
        double metersFromYards = convertYardsToMeters(yards);
        double inchesFromMeters = convertMetersToInches(metersFromYards);
        double centimetersFromInches = convertInchesToCentimeters(inchesFromMeters);

        System.out.println(yards + " yards is equal to " + feet + " feet");
        System.out.println(feet + " feet is equal to " + yardsFromFeet + " yards");
        System.out.println(yards + " yards is equal to " + metersFromYards + " meters");
        System.out.println(metersFromYards + " meters is equal to " + inchesFromMeters + " inches");
        System.out.println(inchesFromMeters + " inches is equal to " + centimetersFromInches + " centimeters");
    }

    public static double convertYardsToMeters(double yards) {
        return yards * 0.9144;
    }
}
