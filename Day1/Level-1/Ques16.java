import java.util.*;
public class Ques16 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the the number of students.");
int numberOfStudents = input.nextInt();
float maxNumberOfHandshakes = (numberOfStudents*(numberOfStudents-1))/2;
System.out.println("The maximum number of possible handshakes are "+ maxNumberOfHandshakes);
}
}