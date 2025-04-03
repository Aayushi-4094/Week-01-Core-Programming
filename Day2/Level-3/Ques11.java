import java.util.*;
public class Ques11 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the month: ");
int m = input.nextInt();
System.out.print("Enter the day: ");
int d = input.nextInt();
System.out.print("Enter the year: ");
int y = input.nextInt();
int yo = y - (14-m)/12;
int x = yo+(yo/4) - (yo/100) + (yo/400);
int mo = m+12-((14-m)/12)-2;
int doo = (d+x+(31*mo)/12)%7;
switch(doo){
case 0:
System.out.println("Sunday");
break;
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
case 4:
System.out.println("Thursday");
break;
case 5:
System.out.println("Friday");
break;
case 6:
System.out.println("Saturday");
break;
}
}
}