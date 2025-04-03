import java.util.*;
public class Ques10 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the first number: ");
double first = input.nextDouble();
System.out.print("Enter the second number: ");
double second = input.nextDouble();
System.out.print("Enter the option: ");
String op = input.next();
switch(op){
case "+":
double sum  = first+second;
System.out.println(sum + " is the Sum of two number.");
break;
case "-":
double diff  = (first>second) ? (first-second):(second-first);
System.out.println(diff + " is the difference of two number.");
break;
case "%":
double remainder  = first%second;
System.out.println(remainder + " is the Remainder");
break;
case "/":
double quotient  = (second>0) ? first/second : 0;
System.out.println(quotient + " is the Quotient");
break;
default :
System.out.println(op +" is invalid");
}
}
}
  