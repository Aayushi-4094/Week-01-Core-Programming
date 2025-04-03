import java.util.*;
public class Ques8 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of students: ");
int numStudents = input.nextInt();
int[] physics = new int[numStudents];
int[] chemistry = new int[numStudents];
int[] math = new int[numStudents];
double[] percentages = new double[numStudents];
String[] grades = new String[numStudents];
for(int i = 0; i < numStudents; i++) {
while(true) {
System.out.print("Enter the marks of physics for student " + (i + 1) + ": ");
physics[i] = input.nextInt();
if(physics[i] >= 0) {
break;
} else {
System.out.println("Please enter a non-negative value.");
}
}
while(true) {
System.out.print("Enter the marks of chemistry for student " + (i + 1) + ": ");
chemistry[i] = input.nextInt();
if(chemistry[i] >= 0) {
break;
} else {
System.out.println("Please enter a non-negative value.");
}
}
while(true) {
System.out.print("Enter the marks of math for student " + (i + 1) + ": ");
math[i] = input.nextInt();
if(math[i] >= 0) {
break;
} else {
System.out.println("Please enter a non-negative value.");
}
}
}
for(int i = 0; i < numStudents; i++) {
percentages[i] = (physics[i] + chemistry[i] + math[i]) / 3.0;
if(percentages[i] >= 80 && percentages[i] <= 100){
grades[i] = "A, Level 4, above agency-normalised standards";
} else if(percentages[i] >= 70 && percentages[i] < 80){
grades[i] = "B, Level 3, at agency-normalised standards";
} else if(percentages[i] >= 60 && percentages[i] < 70){
grades[i] = "C, Level 2, below but approaching agency-normalised standards";
} else if(percentages[i] >= 50 && percentages[i] < 60){
grades[i] = "D, Level 1, well below agency-normalised standards";
} else if(percentages[i] >= 40 && percentages[i] < 50){
grades[i] = "E, Level 1, too below agency-normalised standards";
} else if(percentages[i] < 40){
grades[i] = "Remedial students";
}
}
for(int i = 0; i < numStudents; i++) {
System.out.println("Student " + (i + 1) + ":");
System.out.println("Physics: " + physics[i]);
System.out.println("Chemistry: " + chemistry[i]);
System.out.println("Math: " + math[i]);
System.out.println("Percentage: " + percentages[i]);
System.out.println("Grade: " + grades[i]);
System.out.println();
}
}
}