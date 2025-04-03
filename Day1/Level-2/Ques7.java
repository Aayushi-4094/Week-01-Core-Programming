import java.util.*;
public class Ques7 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the firstnumber ");
int a  = input.nextInt();
System.out.println("Enter the secondNumber ");
int b  = input.nextInt();
System.out.println("Before swapping : "+ a +","+ b);
a = a+b;
b = a-b;
a = a-b;
System.out.println("After swapping : "+ a +","+ b);
}
}