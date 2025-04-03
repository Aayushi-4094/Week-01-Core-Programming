import java.util.Scanner; 
public class Ques10 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter the number of chocolates");
int numberOfChocolates = input.nextInt();
System.out.println("enter the number of children");
int numberOfChildren = input.nextInt();
int chocolatesEachStudentGets = numberOfChocolates/numberOfChildren;
int remainingChocolates = numberOfChocolates%numberOfChildren;
System.out.println("The number of chocolates each child gets is "+chocolatesEachStudentGets+" and the number of remaining chocolates are "+ remainingChocolates);
}
}

