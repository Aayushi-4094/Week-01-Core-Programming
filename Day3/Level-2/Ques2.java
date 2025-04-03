import java.util.*;
public class Ques2 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int[] height = new int[3];
int[] age = new int[3];
String youngest = "";
String tallest = "";
for(int i = 0;i<3;i++){
System.out.println("Enter the height");
height[i] = input.nextInt();
System.out.println("Enter the age");
age[i] = input.nextInt();
}
int minAge = age[0];
int maxHeight = height[0];
for(int i = 1;i<3;i++){
if(age[i] < minAge){
minAge = age[i];
youngest = (i==1) ? "Akbar" : "Anthony";
}
if(height[i] > maxHeight){
maxHeight = height[i];
tallest = (i==1) ? "Akbar" : "Anthony";
}
}
System.out.println(youngest + " is Youngest");
System.out.println(tallest + " is Tallest");
}
}