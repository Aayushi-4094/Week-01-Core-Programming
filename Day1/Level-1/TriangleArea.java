import java.util.*;
public class Ques12 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
final double MILES_TO_YARD = 1760;
final double YARD_TO_FEET = 3;  
System.out.println("Enter the distance in feet");
double distanceInFeet = input.nextInt();
double distanceInYard = distanceInFeet / YARD_TO_FEET;
double distanceInMiles = distanceInYard / MILES_TO_YARD;
System.out.println("Your Height in feet is "+ distanceInFeet + " while in yards is "+ distanceInYard +" and in miles is "+ distanceInMiles);
}
}