import java.util.Scanner; 
public class Ques4 {
public static void main(String[] args) {
int costPrice = 129;
int sellingPrice = 191;
double profit  = sellingPrice - costPrice;
double profitPrecentage = (profit/costPrice)*100;
System.out.println("The Cost Price is INR "+ costPrice + " and Selling Price is INR "+ sellingPrice +"."+"The Profit is INR "+ profit + " and the Profit Percentage is " + profitPrecentage);
}
}