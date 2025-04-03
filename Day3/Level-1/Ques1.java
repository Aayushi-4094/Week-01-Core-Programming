import java.util.*;
public class Ques1 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int[] age = new int[10];
System.out.println("enter the age of the students");
for(int i =0;i<10;i++){
age[i] = input.nextInt();
}
for(int i =0;i<10;i++){
if(age[i] >= 18){
System.err.println("The student with the Age "+ age[i] + " can vote.");
}
else if(age[i]<18 && age[i] >0){
System.err.println("The student with the Age "+ age[i] + " cannot vote.");
}
else if(age[i]<0){
System.err.println("invalid");
}
}
}
}