package day4.level3;

import java.util.*;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int otp = generateOTP();
        System.out.println("Generated OTP: " + otp);
        int[] otpArray = arrayOfGeneratedOTP();
        System.out.println("Array of generated OTP: ");
        for (int i = 0;i<10;i++) {
            System.out.print(otpArray[i] + " ");
        }
        System.out.println();
        boolean otpBoolean = uniqueOTP(otpArray);
        System.out.println("Are OTPs unique? " + otpBoolean);
    }

    public static int generateOTP() {
        Random random = new Random();
        int otp = random.nextInt(900000) + 100000;
        return otp;
    }

    public static int[] arrayOfGeneratedOTP() {
        Random random = new Random();
        int[] result = new int[10];
        for (int i = 0; i < 10; i++) {
            result[i] = random.nextInt(900000) + 100000;
        }
        return result;
    }

    public static boolean uniqueOTP(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false;
                }
            }
        }
        return true;
}
}
