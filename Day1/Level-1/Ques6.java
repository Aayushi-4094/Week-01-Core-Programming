import java.util.Scanner; 
public class Ques6 {
public static void main(String[] args) {
int fee = 125000;
int discount = 10;
double discountedAmount = (fee *discount)/100;
double discountedPrice = fee - discountedAmount;
System.out.println("The discount amount is INR " + discountedAmount + " and final discounted fee is INR "+ discountedPrice);
}
}