import java.util.*;
public class Ques2 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the the first number");
int a = input.nextInt();
System.out.println("Enter the the second number");
int b = input.nextInt();
System.out.println("Enter the the third number");
int c = input.nextInt();
int l = a+b *c;
int m =  a * b + c;
int n =  c + a / b;
int o =  a % b + c;
System.out.println("The results of Int Operations are "+ l +" , "+ m+ " , "+ n +" and "+ o);
}
}