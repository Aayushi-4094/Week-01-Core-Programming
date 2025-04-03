import java.util.*;
public class Ques7 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the month");
int month = input.nextInt();
System.out.println("Enter the date");
int date = input.nextInt();
boolean isSpring = false;
if (month == 3 && date >= 20 && date <= 31) {
 isSpring = true;
 } 
else if (month == 4 && date >= 1 && date <= 30) {
isSpring = true;
} 
else if (month == 5 && date >= 1 && date <= 31) {
isSpring = true;
} else if (month == 6 && date >= 1 && date <= 20) {
isSpring = true;
}
if (isSpring) {
System.out.println("Its a Spring Season");
} else {
System.out.println("Not a Spring Season");
}
}
}


