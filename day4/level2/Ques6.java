package day4.level2;

import java.util.Scanner;

public class Ques6 {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9.0;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5.0) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = convertFahrenheitToCelsius(fahrenheit);
        double fahrenheitFromCelsius = convertCelsiusToFahrenheit(celsius);
        double pounds = 10;
        double kilograms = convertPoundsToKilograms(pounds);
        double poundsFromKilograms = convertKilogramsToPounds(kilograms);
        double gallons = 5;
        double liters = convertGallonsToLiters(gallons);
        double gallonsFromLiters = convertLitersToGallons(liters);

        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius");
        System.out.println(celsius + " Celsius is equal to " + fahrenheitFromCelsius + " Fahrenheit");
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms");
        System.out.println(kilograms + " kilograms is equal to " + poundsFromKilograms + " pounds");
        System.out.println(gallons + " gallons is equal to " + liters + " liters");
        System.out.println(liters + " liters is equal to " + gallonsFromLiters + " gallons");
    }
}
