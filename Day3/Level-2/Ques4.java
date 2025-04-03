import java.util.*;
public class Ques4 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = input.nextInt();
int[] digits = new int[10];
int maxDigit = 10;
int index = 0;
while (number != 0) {
if (index == maxDigit) {
maxDigit += 10;
int[] temp = new int[maxDigit];
System.arraycopy(digits, 0, temp, 0, index);
digits = temp;
}
digits[index] = number % 10;
number /= 10;
index++;
}
int largest = 0;
int secondLargest = 0;
for (int i = 0; i < index; i++) {
if (digits[i] > largest) {
secondLargest = largest;
largest = digits[i];
} else if (digits[i] > secondLargest && digits[i] != largest) {
secondLargest = digits[i];
}
}
System.out.println("Largest digit: " + largest);
System.out.println("Second largest digit: " + secondLargest);
}
}