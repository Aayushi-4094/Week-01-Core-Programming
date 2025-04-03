import java.util.Scanner; 
public class Ques8 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the distance in kilometers");
int kilo = input.nextInt();
double toMiles = kilo * 1.6;
System.out.println("The total miles is " + toMiles+ " mile for the given " + kilo +" km");
}
}