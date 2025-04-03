package day4.level2;
import java.util.*;
public class Ques10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();
        double[] weight = new double[numPersons];
        double[] heightInCm = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] status = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter the weight (in kg) of person " + (i + 1) + ": ");
            weight[i] = input.nextDouble();
            System.out.print("Enter the height (in cm) of person " + (i + 1) + ": ");
            heightInCm[i] = input.nextDouble();
            double heightInMeters = heightInCm[i] / 100;
            bmi[i] = weight[i] / (heightInMeters * heightInMeters);
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] > 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] > 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else if (bmi[i] >= 40.0) {
                status[i] = "Obese";
            }
        }

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + heightInCm[i] + " cm");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Status: " + status[i]);
            System.out.println();
        }
    }

    public static double[] calculateBMI(double[] weight, double[] heightInCm) {
        double[] bmi = new double[weight.length];
        for (int i = 0; i < weight.length; i++) {
            double heightInMeters = heightInCm[i] / 100;
            bmi[i] = weight[i] / (heightInMeters * heightInMeters);
        }
        return bmi;
    }

    public static String[] determineBMISatus(double[] bmi) {
        String[] status = new String[bmi.length];
        for (int i = 0; i < bmi.length; i++) {
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] > 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] > 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else if (bmi[i] >= 40.0) {
                status[i] = "Obese";
            }
        }
        return status;
    }
}

