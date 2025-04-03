package day4.level3;

import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1");
        int x1 = sc.nextInt();
        System.out.println("Enter x2");
        int x2 = sc.nextInt();
        System.out.println("Enter x3");
        int x3 = sc.nextInt();
        System.out.println("Enter y1");
        int y1 = sc.nextInt();
        System.out.println("Enter y2");
        int y2 = sc.nextInt();
        System.out.println("Enter y3");
        int y3 = sc.nextInt();
        boolean collinearUsingSlopes = isCollinearUsingSlopes(x1, x2, x3, y1, y2, y3);
        if(collinearUsingSlopes == true){
        System.out.println("The points are collinear using slopes");
        }
        else{
            System.out.println("The points are not collinear using slopes");
        }
        boolean collinearUsingArea = isCollinearUsingArea(x1, x2, x3, y1, y2, y3);
        if(collinearUsingArea == true){
        System.out.println("The points are collinear using area of triangle");
        }
        else{
            System.out.println("The points are not collinear using area of triangle");
        }

    }

    public static boolean isCollinearUsingSlopes(int x1, int x2, int x3, int y1, int y2, int y3){
        int m1 =  (y2 - y1)/(x2 - x1);
        int m2 = (y3 - y2) / (x3 - x2);
        int m3 =  (y3 - y1)/(x3 - x1);
        if((m1 == m2) && (m2 == m3) && (m3 == m1)){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isCollinearUsingArea(int x1, int x2, int x3, int y1, int y2, int y3){
        double area = (0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));
        if(area == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
