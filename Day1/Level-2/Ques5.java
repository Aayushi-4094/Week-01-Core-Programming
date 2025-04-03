import java.util.*;
public class Ques5 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the temperature in Fahrenheit ");
double tempFahrenheit  = input.nextDouble();
double celsiusResult =  (tempFahrenheit - 32) * 5/9;
System.out.println("The "+ tempFahrenheit + " fahrenheit is "+celsiusResult +" celsius");
}
}