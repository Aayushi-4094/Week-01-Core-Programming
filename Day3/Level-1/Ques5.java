import java.util.*;
public class Ques5 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the number between 6 and 9");
int numbers = input.nextInt();
int[] multiplicationResult = new int[15];
for(int i = 1;i<11;i++){
multiplicationResult[i] = i* numbers;  
System.out.println(numbers +" * "+ i +" = " + multiplicationResult[i]);
}
}
}