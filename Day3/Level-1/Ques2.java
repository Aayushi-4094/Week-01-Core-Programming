import java.util.*;
public class Ques2 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter the height");
int[] height = new int[3];
System.out.println("enter the age");
int[] age = new int[3];
for(int i = 1;i<=3;i++){
String youngest = (age[i-1] < age[i] && age[i] < age[i+1]) ? a[i-1] : (age[i] < age[i-1] && age[i] < age[i+1]) ? age[i] : age[i+1];
String tallest = (age[i-1] > age[i] && age[i-1] > age[i+1]) ? age[i-1] : (age[i] > age[i-1] && age[i] > age[i+1]) ? age[i] : age[i+1];
}
System.out.println(youngest + " is Youngest");
System.out.println(tallest + " is Tallest");
}