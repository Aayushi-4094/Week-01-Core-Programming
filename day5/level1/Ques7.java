package day5.level1;

public class Ques7 {    
        public static void generateException() {
            String text = "abc";
            int num = Integer.parseInt(text);
            System.out.println(num);
        }
    
        public static void handleException() {
            String text = "abc";
            try {
                int num = Integer.parseInt(text);
                System.out.println(num);
            } catch (NumberFormatException e) {
                System.err.println("NumberFormatException caught: " + e.getMessage());
            } catch (Exception e) {
                 System.err.println("Generic Exception caught: " + e.getMessage());
            }
            System.out.println("Program continues after exception handling.");
        }
    
        public static void main(String[] args) {
            System.out.println("Generating NumberFormatException:");
            try {
                generateException();
            } catch (NumberFormatException e) {
                System.err.println("NumberFormatException caught in main: " + e.getMessage());
            }
            
            System.out.println("\nHandling NumberFormatException:");
            handleException();
        }
    }
