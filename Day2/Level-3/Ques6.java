import java.io.*;
public class Ques6 {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a number: ");
int number = Integer.parseInt(br.readLine());
int temp = number;
int count = 0;
while (number != 0) {
int r = number % 10;
count++;
number /= 10;
}
System.out.println("The number of digits in the number "+ temp +" is " + count);
}
}
