package day4.level1;
import java.util.Scanner;
public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the divisor");
        int d = sc.nextInt();
        int[] result = findRemainderAndQuotient(n, d);
        System.out.println("The reaminder is "+ result[0]+ " and the qoutient is " + result[1]); 
    }
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int remainder = number% divisor;
        int quotient = number / divisor;
        return new int[]{remainder, quotient};
    }
}
