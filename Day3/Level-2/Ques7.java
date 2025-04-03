import java.util.*;
public class Ques7 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of persons: ");
int number = input.nextInt();
double[][] personData = new double[number][3];
String[] weightStatus = new String[number];
for(int i = 0; i < number; i++) {
while(true) {
System.out.print("Enter the weight (in kg) of person " + (i + 1) + ": ");
personData[i][0] = input.nextDouble();
if(personData[i][0] > 0) {
break;
} else {
System.out.println("Please enter a positive value.");
}
}
while(true) {
System.out.print("Enter the height (in cm) of person " + (i + 1) + ": ");
personData[i][1] = input.nextDouble();
if(personData[i][1] > 0) {
break;
} else {
System.out.println("Please enter a positive value.");
}
}
personData[i][2] = personData[i][0] / Math.pow((personData[i][1] / 100), 2);
if(personData[i][2] <= 18.4){
weightStatus[i] = "Underweight";
} else if(personData[i][2] > 18.5 && personData[i][2] <= 24.9){
weightStatus[i] = "Normal";
} else if(personData[i][2] > 25.0 && personData[i][2] <= 39.9){
weightStatus[i] = "Overweight";
} else if(personData[i][2] >= 40.0){
weightStatus[i] = "Obese";
}
}
for(int i = 0; i < number; i++) {
System.out.println("Person " + (i + 1) + ":");
System.out.println("Height: " + personData[i][1] + " cm");
System.out.println("Weight: " + personData[i][0] + " kg");
System.out.println("BMI: " + personData[i][2]);
System.out.println("Status: " + weightStatus[i]);
System.out.println();
}
}
}