
import java.util.*;
public class Ques7 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the weight(in kg): ");
double weight = input.nextDouble();
System.out.print("Enter the height(in cm): ");
double heightInCm = input.nextDouble();
double heightInMeters = heightInCm/100;
double bmi = weight /(heightInMeters * heightInMeters);
if(bmi<= 18.4){
System.out.println("Person is underweight as BMI is " + bmi);
}
else if(bmi> 18.5 && bmi<= 24.9){
System.out.println("Person is normal as BMI is " + bmi);
}
else if(bmi> 25.0 && bmi<= 39.9){
System.out.println("Person is oveweight as BMI is " + bmi);
}
else if(bmi>= 40.0){
System.out.println("Person is obese as BMI is " + bmi);
}

}
}