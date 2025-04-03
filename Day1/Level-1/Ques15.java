import java.util.*;
public class Ques15 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the the unit price of an item");
double unitPrice = input.nextDouble();
System.out.println("Enter the the quantity to be bough");
double qty = input.nextDouble();
double totalPrice = qty * unitPrice;
System.out.println("The total purchase price is INR "+totalPrice+" if the quantity is "+qty +" and unit price is INR "+ unitPrice);
}
}