import java.io.*;
import java.lang.*;
public class Ques12 {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
final double POUND_TO_KG = 2.2;
System.out.println("Enter the weight in pounds");
double weightInPounds = Double.parseDouble(br.readLine());
double weightInKg = weightInPounds * POUND_TO_KG;
System.out.println("The weight of the person in pound is "+weightInPounds+" and in kg is "+weightInKg);
}
}
