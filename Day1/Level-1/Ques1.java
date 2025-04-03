package Day1.Level-1;
import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println("Harry's age in 2024 is " + age);
    }
}