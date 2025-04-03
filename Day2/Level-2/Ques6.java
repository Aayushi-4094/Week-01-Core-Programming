import java.util.*;
public class Ques6{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the age of Amar");
int amarAge = input.nextInt();
System.out.println("Enter the height of Amar");
int amarHeight = input.nextInt();
System.out.println("Enter the age of Akbar");
int akbarAge = input.nextInt();
System.out.println("Enter the height of Akbar");
int akbarHeight = input.nextInt();
System.out.println("Enter the age of Anthony");
int anthonyAge = input.nextInt();
System.out.println("Enter the height of Anthony");
int anthonyHeight = input.nextInt();
String youngest = (amarAge < akbarAge && amarAge < anthonyAge) ? "Amar" : 
                   (akbarAge < amarAge && akbarAge < anthonyAge) ? "Akbar" : "Anthony";
System.out.println(youngest + " is Youngest");

String tallest = (amarHeight > akbarHeight && amarHeight > anthonyHeight) ? "Amar" : 
                  (akbarHeight > amarHeight && akbarHeight > anthonyHeight) ? "Akbar" : "Anthony";
System.out.println(tallest + " is Tallest");

}
}