package day4.level1;
import java.lang.*;
import java.util.*;
public class Ques11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature");
        int temperature = sc.nextInt();
        System.out.println("Enter the wind speed");
        int windSpeed = sc.nextInt();
        double result = calculateWindChill(temperature, windSpeed);
        System.out.println("The wind chill temperature is " + result);

    }
    public static double calculateWindChill(double temperature, double windSpeed){
        return (35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * Math.pow(windSpeed,0.16));
    }
}
