package day4.level2;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ageArr = new int[3];
        int[] heightArr = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age for friend " + (i + 1));
            ageArr[i] = sc.nextInt();
            System.out.println("Enter height for friend " + (i + 1));
            heightArr[i] = sc.nextInt();
        }

        String youngest = youngestOfThree(ageArr);
        System.out.println("The youngest is " + youngest);

        String tallest = tallestOfThree(heightArr);
        System.out.println("The tallest is " + tallest);
    }

    public static String youngestOfThree(int[] ageArr) {
        if (ageArr[0] <= ageArr[1] && ageArr[0] <= ageArr[2]) {
            return "Amar";
        } else if (ageArr[1] <= ageArr[0] && ageArr[1] <= ageArr[2]) {
            return "Akbar";
        } else {
            return "Anthony";
        }
    }

    public static String tallestOfThree(int[] heightArr) {
        if (heightArr[0] >= heightArr[1] && heightArr[0] >= heightArr[2]) {
            return "Amar";
        } else if (heightArr[1] >= heightArr[0] && heightArr[1] >= heightArr[2]) {
            return "Akbar";
        } else {
        return "Anthony";
    }
}
}
