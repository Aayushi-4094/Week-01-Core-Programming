package day4.level3;
import java.lang.*;
import java.util.*;
public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1");
        int x1 = sc.nextInt();
        System.out.println("Enter x2");
        int x2 = sc.nextInt();
        System.out.println("Enter y1");
        int y1 = sc.nextInt();
        System.out.println("Enter y2");
        int y2 = sc.nextInt();
        double eucDist = euclideanDistance(x1, x2, y1, y2);
        System.out.println("The euclidean distance is : " +eucDist);
        double[] slopeAndYIntercept = slopeAndY(x1, x2, y1, y2);
        System.out.println("Y intercept = " + slopeAndYIntercept[0] + " * x " + slopeAndYIntercept[1]);

    }

    public static double euclideanDistance(int x1, int x2, int y1, int y2){
        double distance = Math.sqrt(Math.pow((x2-x1),2)) - Math.sqrt(Math.pow((y2-y1),2));
        return distance;
    }
    public static double[] slopeAndY(int x1, int x2, int y1, int y2){
        double m = (y2-y1)/(x2-x1);
        double b = y1 - (m * x1);
        return new double[]{m, b};
    }
}
