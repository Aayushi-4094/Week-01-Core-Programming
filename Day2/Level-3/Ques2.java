import java.util.*;
public class Ques2 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a year: ");
int year = input.nextInt();
if(year<1582){
System.out.println("Enter a valid year");
}
if(year%4 == 0 || (year%100 == 0 && year % 400 == 0)){
System.out.println(year + " Is a leap year"); 
}
else{
System.out.println(year + " Is not a leap year");
}
}
}