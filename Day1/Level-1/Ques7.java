import java.util.*; 
public class Ques7 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
final double PI = 3.14;
System.out.println("Enter the radius (in kilometer)");
double r  = 6378;
double vol = (4/3)*Math.pow(r,2)*PI;
double volInMiles = vol * Math.pow(1.6,3);
System.out.println("The volume of earth in cubic kilometers is "+vol+" and cubic miles is "+ volInMiles);
}
}