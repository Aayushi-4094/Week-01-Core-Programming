import java.util.*;
public class Ques3{
public static void main(String[] args){
Scanner sc  = new Scanner(System.in);
System.out.println("Enter the first number");
int a = sc.nextInt();
System.out.println("Enter the second number");
int b = sc.nextInt();
System.out.println("Enter the third number");
int c = sc.nextInt();
if(a>b && a>c){
System.out.println("First number "+ a+" is the largest");
}
else if(a<b && b>c){
System.out.println("Second number "+ b +" is the largest");
}
else if(a<c && b<c){
System.out.println("Third number "+ c +" is the largest");
}
}
}