import java.util.*;
public class Ques6 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the salary ");
float salary  = input.nextFloat();
System.out.println("Enter the bonus ");
float bonus  = input.nextFloat();
float income = salary + bonus;
System.out.println("The Salary is INR "+ salary +" and Bonus is INR "+ bonus +". Hence Total Income is INR "+ income);
}
}