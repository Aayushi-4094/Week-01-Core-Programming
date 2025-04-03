import java.util.*;
public class Ques4 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the temperature in celsius ");
double tempCelsius  = input.nextDouble();
double farenheitResult  =   (tempCelsius * (9/5)) + 32;
System.out.println("The "+ tempCelsius + " celsius is "+ farenheitResult  +" fahrenheit");
}
}