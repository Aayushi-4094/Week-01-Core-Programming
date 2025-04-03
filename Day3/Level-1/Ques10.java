import java.util.*;
public class Ques10 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the number");
int m = input.nextInt();
String[] result = new String[m];
for (int i = 0; i < m; i++) {
if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
result[i] = "FizzBuzz";
} else if ((i + 1) % 3 == 0) {
result[i] = "Fizz";
} else if ((i + 1) % 5 == 0) {
result[i] = "Buzz";
} else {
result[i] = String.valueOf(i + 1); 
}
}
for (int i = 0; i < m; i++) {
System.out.println("Position " + (i + 1) + " = " + result[i]);
}
}
}