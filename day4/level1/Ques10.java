package day4.level1;
import java.util.*;
public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  of chocolates");
        int numberOfchocolates = sc.nextInt();
        System.out.println("Enter the number of children");
        int numberOfChildren = sc.nextInt();
        int[] result = findRemainderAndQuotient(numberOfchocolates, numberOfChildren);
        System.out.println("The remaining chocolates is "+ result[0]+ " and the equally distributed chocolates is " + result[1]); 
    }
    public static int[] findRemainderAndQuotient(int numberOfchocolates, int numberOfChildren){
        int remainder = numberOfchocolates% numberOfChildren;
        int quotient = numberOfchocolates / numberOfChildren;
        return new int[]{remainder, quotient};
    }
}
