package day5.level2;
import java.util.Random;
import java.util.Scanner;
public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = randomAge(10);
        for (int i = 0; i < ages.length; i++) {
            System.out.println("The age of student " + (i + 1) + " is " + ages[i]);
        }
        String[][] result = ageAndBooleanArray(ages);
        displayTable(result);
    }
    public static int[] randomAge(int n) {
        Random random = new Random();
        int[] age = new int[n];
        for (int i = 0; i < n; i++) {
            age[i] = 10 + random.nextInt(90); 
        }
        return age;
    }
    public static String[][] ageAndBooleanArray(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Invalid age";
            } else {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = ages[i] >= 18 ? "true" : "false";
            }
        }
        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Age\tCan Vote");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
