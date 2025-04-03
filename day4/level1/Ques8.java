package day4.level1;
import java.util.*;
public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int a  = sc.nextInt();
        System.out.println("Enter the number 2");
        int b  = sc.nextInt();
        System.out.println("Enter the number 3");
        int c  = sc.nextInt();
        int[] result = findSmallestAndLargest(a,b,c);
        int smallest = result[0];
        int largest = result[1];
        System.out.println("The smallest number is " + smallest + " and the largest number is " + largest);

    }
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int smallest = number1;
        int largest = number1;
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        return new int[]{smallest, largest};
    }
}
