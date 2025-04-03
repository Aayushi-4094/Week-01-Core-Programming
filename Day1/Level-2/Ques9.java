import java.util.*;
class Ques9{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
final int DISTANCE  = 5;
System.out.println("Enter the side1");
int side1 = input.nextInt();
System.out.println("Enter the side2");
int side2 = input.nextInt();
System.out.println("Enter the side3");
int side3 = input.nextInt();
int perimeter = side1 + side2 + side3;
float numberOfRounds = DISTANCE/perimeter;
System.out.println("The total number of rounds the athlete will run is "+ numberOfRounds +" to complete 5 km");
}
}


