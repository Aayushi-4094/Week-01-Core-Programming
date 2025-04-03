import java.util.*;
public class Ques9 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of students: ");
int numStudents = input.nextInt();
int[][] marks = new int[numStudents][3];
double[] percentages = new double[numStudents];
String[] grades = new String[numStudents];
for(int i = 0; i < numStudents; i++) {
System.out.println("Enter the marks for student " + (i + 1));
for(int j = 0; j < 3; j++) {
while(true) {
if(j == 0) {
System.out.print("Physics: ");
} else if(j == 1) {
System.out.print("Chemistry: ");
} else {
System.out.print("Math: ");
}
marks[i][j] = input.nextInt();
if(marks[i][j] >= 0) {
break;
} else {
System.out.println("Please enter a non-negative value.");
}
}
}
}
for(int i = 0; i < numStudents; i++) {
percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
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
System.out.println("Physics: " + marks[i][0]);
System.out.println("Chemistry: " + marks[i][1]);
System.out.println("Math: " + marks[i][2]);
System.out.println("Percentage: " + percentages[i]);
System.out.println("Grade: " + grades[i]);
System.out.println();
}
}
}