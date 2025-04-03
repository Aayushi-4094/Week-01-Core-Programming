import java.util.*;
public class Ques6 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double[] heights = new double[11];
int l = heights.length;
double sum = 0.0;
double meanHeight = 0.0;
System.out.println("Enter the heights");
for(int i =0;i<l;i++){
heights[i] = input.nextInt();
}
for(int i =0;i<l;i++){
sum += heights[i];
meanHeight = sum/11;
}
System.out.print("The mean height of the football team is : "+ meanHeight);
}
}