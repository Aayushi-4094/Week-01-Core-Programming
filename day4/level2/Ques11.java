package day4.level2;

import java.util.Arrays;
import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for a ");
        int a = input.nextInt();
        System.out.println("Enter the value for b ");
        int b = input.nextInt();
        System.out.println("Enter the value for c ");
        int c = input.nextInt();
        double delta = Math.pow(b, 2) - 4 * a * c;
        double[] roots = findRoots(a, b, c, delta);
        System.out.println("The roots are " + Arrays.toString(roots));
    }

    public static double[] findRoots(int a, int b, int c, double delta) {
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            return new double[] {root1, root2};
        } else if (delta == 0) {
            double root = -b / (2.0 * a);
            return new double[] {root};
        } else {
            return new double[0];
     }
    }
}
