import java.io.*;
public class Ques13 {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a number: ");
int number = Integer.parseInt(br.readLine());
if (number > 0 && number < 100) {
int counter = number;
while (counter < 100) {
if (counter % number == 0) {
System.out.println(counter);
}
counter++;
}
} else {
System.out.println("Invalid input. Please enter a positive integer less than 100.");
}
}
}
