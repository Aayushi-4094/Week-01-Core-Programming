import java.util.*;
public class Perimeter {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the perimeter of square");
int peri = input.nextInt();
int side  = peri/4;
System.out.println("The length of the side is "+ side + " whose perimeter is "+ peri);
}
}