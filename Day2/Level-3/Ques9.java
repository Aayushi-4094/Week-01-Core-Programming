import java.util.*;
public class Ques9 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the number: ");
int num = input.nextInt();
int temp = num;
int sum = 0;
for(int i = 1;i<=num;i++){
if(num%i ==0){
sum += i;
}
}
if(sum>temp){
System.out.println(temp + " is a abundant number.");
} else {
System.out.println(temp + " is not a abundant number.");
}
}
}
  