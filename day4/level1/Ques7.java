package day4.level1;
import java.util.*;
public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nmber :");
        int number = sc.nextInt();
        if(number<=0){
            System.out.println("ENter the valid number");
        }
        int result = sumOfNaturalNumbers(number);
        System.out.println("The sum of "+ number +" is " + result);
    }
    public static int sumOfNaturalNumbers(int number){
        int sum  = 0;
        for(int i = 0;i<number;i++){
            sum += i;
        }
        return sum;
    }
}
