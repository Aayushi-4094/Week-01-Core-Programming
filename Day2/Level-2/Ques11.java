import java.io.*;
public class Ques11 {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a number: ");
int number = Integer.parseInt(br.readLine());
if (number > 0 && number < 100) {
for(int counter = number;counter < 100;counter++){
if (counter % number == 0) {
System.out.println(counter);
}
}
} else {
System.out.println("Invalid input. Please enter a positive integer less than 100.");
}
}
}
