import java.util.*;
public class Ques7 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the number");
int number = input.nextInt();
if(number<0){
System.err.println("The number is not natural number");
System.exit(0);
}
int[] oddArr = new int[(number/2)+1];
int[] evenArr = new int[(number/2)+1];
int evenIndex = 0;
int oddIndex = 0;
int[] arr = new int[number];
for (int i = 1; i <= number; i++) {
if (i % 2 == 0) {
evenArr[evenIndex] = i;
evenIndex++;
} else {
oddArr[oddIndex] = i;
oddIndex++;
}
}
System.out.print("Even numbers: ");
for (int i = 0; i < evenIndex; i++) {
System.out.print(evenArr[i] + " ");
}
System.out.println();
System.out.print("Odd numbers: ");
for (int i = 0; i < oddIndex; i++) {
System.out.print(oddArr[i] + " ");
}
System.out.println();
}
}
