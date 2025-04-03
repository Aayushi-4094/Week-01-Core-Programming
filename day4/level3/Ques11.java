
package day4.level3;
import java.util.*;

public class Ques11 {
    public static void main(String[] args) {
        double[][] employeeData = getEmployeeData();
        double[][] bonusData = calculateBonus(employeeData);
        displayResults(employeeData, bonusData);
    }

    public static double[][] getEmployeeData() {
        double[][] employeeData = new double[10][2];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            employeeData[i][0] = random.nextInt(90000) + 10000; 
            employeeData[i][1] = random.nextInt(10) + 1;
        }
        return employeeData;
    }

    public static double[][] calculateBonus(double[][] employeeData) {
        double[][] bonusData = new double[10][2];
        for (int i = 0; i < 10; i++) {
            if (employeeData[i][1] > 5) {
                bonusData[i][0] = employeeData[i][0] * 0.05; 
            } else {
                bonusData[i][0] = employeeData[i][0] * 0.02; 
            }
            bonusData[i][1] = employeeData[i][0] + bonusData[i][0];
        }
        return bonusData;
    }

    public static void displayResults(double[][] employeeData, double[][] bonusData) {
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        double totalBonus = 0.0;
        System.out.println("Employee\tOld Salary\tBonus\tNew Salary");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "\t" + employeeData[i][0] + "\t" + bonusData[i][0] + "\t" + bonusData[i][1]);
            totalOldSalary += employeeData[i][0];
            totalNewSalary += bonusData[i][1];
            totalBonus += bonusData[i][0];
        }
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus: " + totalBonus);
}
}
