import java.util.*;
public class Ques3 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the the first number");
double a = input.nextDouble();
System.out.println("Enter the the second number");
double b = input.nextDouble();
System.out.println("Enter the the third number");
double c = input.nextDouble();
double l = a+b *c;
double m =  a * b + c;
double n =  c + a / b;
double o =  a % b + c;
System.out.println("The results of Int Operations are "+ l +" , "+ m+ " , "+ n +" and "+ o);
}
}