package day4.level1;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the side 1");
            int a = sc.nextInt();
            int result = negativeZeroPositive(a);
            System.out.println("The number " + a + " is " + result);
}
public static int negativeZeroPositive(int a){
    return (a>0)? 1 : (a==0) ? 0 :-1;
}
}

