import java.util.Scanner; 
public class Ques10 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the height in centimeters");
int centi = input.nextInt();
double inches= centi/2.54;
double feet = inches/12;
System.out.println("Your Height in cm is " + centi + " while in feet is "+ feet+ " and inches is" + inches);
}
}