
import java.util.*;
public class Ques4 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the the number");
int n = input.nextInt();
float sum = n*(n+1)/2;
if(sum>0){
System.out.println("The sum of "+ n+" natural numbers is "+ sum); 
}
else{
System.out.println("The number "+ n+" is not a natural number"); 
}
}
}



