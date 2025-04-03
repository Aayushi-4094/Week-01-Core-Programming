import java.util.*;
public class Ques1 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the the first number");
int a = input.nextInt();
System.out.println("Enter the the second number");
int b = input.nextInt();
int remainder = a%b;
int quotient = a/b;
System.out.println("The Quotient is "+ quotient+" and Reminder is "+ remainder +" of two number "+ a +" and "+b);
}
}