import java.io.*;
public class Ques9 {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a number: ");
int number = Integer.parseInt(br.readLine());
int greatestFactor = 1;
for(int counter = number - 1;counter >= 1;counter--)
{
if (number % counter == 0) {
greatestFactor = counter;
break;
}
}
System.out.println("The greatest factor of " + number + " is " + greatestFactor);
}
}
