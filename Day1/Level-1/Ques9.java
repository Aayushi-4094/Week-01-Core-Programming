import java.util.Scanner; 
public class Ques9 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the fees");
int fee = sc.nextInt();
System.out.println("Enter the discount percent");
double discountPercent = sc.nextDouble();
double discountedAmount = (fee *discountPercent)/100;
double discountedPrice = fee - discountedAmount;
System.out.println("The discount amount is INR " + discountedAmount + " and final discounted fee is INR "+ discountedPrice);
}
}