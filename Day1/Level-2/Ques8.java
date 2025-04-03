import java.util.*;
class Ques8{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the name");
String name = input.next();
System.out.println("Enter the from city");
String fromCity = input.next();
System.out.println("Enter the via city");
String viaCity = input.next();
System.out.println("Enter the to city");
String toCity = input.next();
System.out.println("Enter the distance to the via city");
double distanceFromToVia = input.nextDouble();
System.out.println("Enter the distance from the via city to the final city");
double distanceViaToFinalCity = input.nextDouble();
System.out.println("Enter the time to the via city");
int timeFromToVia = input.nextInt();
System.out.println("Enter the time from the via city to the final city");
int timeViaToFinalCity = input.nextInt();
double totalDistance = distanceFromToVia + distanceViaToFinalCity;
int totalTime = timeFromToVia + timeViaToFinalCity;
System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +" is " + totalDistance + " km and " +"the Total Time taken is " + totalTime + " minutes");
}
}


