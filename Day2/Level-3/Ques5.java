import java.io.*;
import java.lang.*;
public class Ques5 {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a number: ");
int number = Integer.parseInt(br.readLine());
int temp = number;
double cubeSum = 0;
while (number != 0) {
int r = number % 10;
double cube = Math.pow(r,3);
cubeSum += cube;
number /= 10;
}
if(cubeSum == temp){
System.out.println("The number "+ temp +" is Armstrong number");
}
else{
System.out.println("The number "+ temp +" is not Armstrong number");
}
}
}
