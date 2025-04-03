import java.io.*;
public class Ques10 {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a number: ");
int number = Integer.parseInt(br.readLine());
int greatestFactor = 1;
int counter = number - 1;
while (counter >= 1) {
if (number % counter == 0) {
greatestFactor = counter;
break;
}
counter--;
}
System.out.println("The greatest factor of " + number + " is " + greatestFactor);
}
}
