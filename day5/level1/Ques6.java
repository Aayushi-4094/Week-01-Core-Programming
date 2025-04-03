package day5.level1;
import java.util.Scanner;
public class Ques6{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        try {
            generateException(input);
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid input: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }

        try {
            handleIllegalArgument(input);
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid substring request: " + e.getMessage());
        }
    }
    static void generateException(String str) throws IllegalArgumentException {
        if (str.length() < 5) {
            throw new IllegalArgumentException("String is too short to extract substring.");
        }
        String invalidSub = str.substring(5, 2);  
    }
    static void handleIllegalArgument(String str) throws IllegalArgumentException {
        try {
            String subString = str.substring(str.length() + 1, str.length() - 1);
        } catch (StringIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Invalid substring indices provided.");
        }
    }
}
