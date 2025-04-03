import java.util.*;
public class Ques3 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the number");
int numbers = input.nextInt();
int[] multiple = new int[15];
for(int i = 1;i<11;i++){
multiple[i] = i* numbers;  
System.out.println(numbers +" * "+ i +" = " + multiple[i]);

}
}
}