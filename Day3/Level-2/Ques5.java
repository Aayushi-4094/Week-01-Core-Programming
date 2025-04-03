import java.util.*;
public class Ques5 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = input.nextInt();
int[] digits = new int[10];
int count = 0;
while (number != 0) {
digits[count] = number % 10;
number /= 10;
count++;
}
for(int i=0;i <= count-1;i++){
System.out.print(digits[i]);
}
}
}