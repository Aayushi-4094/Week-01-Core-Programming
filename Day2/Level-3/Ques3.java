import java.util.*;
public class Ques3 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the marks of physics: ");
int physics = input.nextInt();
System.out.print("Enter the marks of chemistry: ");
int chemistry = input.nextInt();
System.out.print("Enter the marks of math: ");
int math = input.nextInt();
double percentage = (physics +chemistry + math)/3;
if(percentage>= 80 && percentage<= 100){
System.out.println("The Percentage of the student is " + percentage +" Grade is A and Remark is Level 4, above agency-normalised standards");
}
else if(percentage>= 70 && percentage< 80){
System.out.println("The Percentage of the student is " + percentage +" Grade is B and Remark is Level 3, at agency-normalised standards");
}
else if(percentage>= 60 && percentage<70){
System.out.println("The Percentage of the student is " + percentage +" Grade is C and Remark is Level 2, below but approaching agency-normalised standards");
}
else if(percentage>= 50 && percentage<60){
System.out.println("The Percentage of the student is " + percentage +" Grade is D and Remark is Level 1, well below agency-normalised standards");
}
else if(percentage>= 40 && percentage< 50){
System.out.println("The Percentage of the student is " + percentage +" Grade is E and Remark is Level 1, too below agency-normalised standards");
}
else if(percentage<40){
System.out.println("The Percentage of the student is " + percentage +" Remedial students");
}
}
}