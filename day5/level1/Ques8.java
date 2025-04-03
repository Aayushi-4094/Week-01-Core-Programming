package day5.level1;
import java.util.Scanner;

public class Ques8 {
    public static void generateException(String[] names) {
        System.out.println(names[names.length]);  
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Generic exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int numNames = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[numNames];
        for (int i = 0; i < numNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        scanner.close();
        
        System.out.println("Calling generateException method:");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
             System.err.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        System.out.println("\nCalling handleException method:");
        handleException(names);
    }
}

