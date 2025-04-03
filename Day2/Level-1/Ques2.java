import java.util.*;
public class Ques2{
public static void main(String[] args){
Scanner sc  = new Scanner(System.in);
System.out.println("Enter the first number");
int a = sc.nextInt();
System.out.println("Enter the second number");
int b = sc.nextInt();
System.out.println("Enter the third number");
int c = sc.nextInt();
if(a<b && a<c){
System.out.println("First number "+ a+" is the smallest");
}
else{
System.out.println("First number "+ a+" is not the smallest");
}
}
}