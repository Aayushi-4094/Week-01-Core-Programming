import java.util.*;
public class Ques8 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the number: ");
int num = input.nextInt();
int temp = num;
int sum = 0;
while(num != 0){
int r = num%10;
sum += r;
num /=10;
}
if(temp% sum ==0){
System.out.println(temp + " is a harshad number.");
} else {
System.out.println(temp + " is not a harshad number.");
}
}
}
  