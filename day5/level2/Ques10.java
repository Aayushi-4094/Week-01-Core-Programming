package day5.level2;

import java.util.Random;
import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        int[][] marks = generateRandomMarks(numStudents);
        double[][] results = calculateResults(marks);
        String[][] grades = calculateGrades(results);
        displayScorecard(marks, results, grades);
    }

    public static int[][] generateRandomMarks(int numStudents) {
        int[][] marks = new int[numStudents][3];
        Random random = new Random();
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = random.nextInt(100);
            }
        }
        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100.0;
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static String[][] calculateGrades(double[][] results) {
        String[][] grades = new String[results.length][1];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 90) {
                grades[i][0] = "A";
            } else if (percentage >= 80) {
                grades[i][0] = "B";
            } else if (percentage >= 70) {
                grades[i][0] = "C";
            } else if (percentage >= 60) {
                grades[i][0] = "D";
            } else {
                grades[i][0] = "F";
            }
        }
        return grades;
    }

    public static void displayScorecard(int[][] marks, double[][] results, String[][] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t" + results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t" + grades[i][0]);
        }
    }
}
