import java.util.Scanner; 
public class Ques11 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number");
int a = sc.nextInt();
System.out.println("Enter the second number");
int b = sc.nextInt();
int sum = a+b;
int diff = (a > b) ? a-b : b-a;
int product = a*b;
int div = a/b;
System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + sum + " ," + diff + " ," + product + " and " + div );
}
}