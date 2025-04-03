package day5.level3;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();
        double[][] personData = new double[numPersons][2];

        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter the weight (in kg) of person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();
            System.out.print("Enter the height (in cm) of person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble();
        }

        String[][] bmiAndStatus = calculateBMIAndStatus(personData);
        displayResults(personData, bmiAndStatus);
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

    public static String[][] calculateBMIAndStatus(double[][] personData) {
        int numPersons = personData.length;
        double[] weight = new double[numPersons];
        double[] heightInCm = new double[numPersons];

        for (int i = 0; i < numPersons; i++) {
            weight[i] = personData[i][0];
            heightInCm[i] = personData[i][1];
        }

        double[] bmi = calculateBMI(weight, heightInCm);
        String[] status = determineBMISatus(bmi);

        String[][] bmiAndStatus = new String[numPersons][2];
        for (int i = 0; i < numPersons; i++) {
            bmiAndStatus[i][0] = String.valueOf(bmi[i]);
            bmiAndStatus[i][1] = status[i];
        }

        return bmiAndStatus;
    }

    public static void displayResults(double[][] personData, String[][] bmiAndStatus) {
        System.out.println("Person\tHeight (cm)\tWeight (kg)\tBMI\tStatus");
        for (int i = 0; i < personData.length; i++) {
            System.out.println((i + 1) + "\t" + personData[i][1] + "\t" + personData[i][0] + "\t" + bmiAndStatus[i][0] + "\t" + bmiAndStatus[i][1]);
        }
    }
}
