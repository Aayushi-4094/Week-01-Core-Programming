package day4.level3;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        System.out.println("Month Name: " + monthName(month));
        System.out.println("Number of Days: " + dayInMonth(month, year));
        int firstDay = getFirstDayOfMonth(month, year);
        System.out.println("First Day of the Month: " + firstDay);
        System.out.println("Day of the Week: " + getDayOfWeek(1, month, year));

        System.out.println("\n " + monthName(month) + " " + year);
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        int numDays = dayInMonth(month, year);
        for (int i = 1; i <= numDays; i++) {
            System.out.printf("%3d", i);
            if ((i + firstDay - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static String monthName(int month) {
        String[] monthNames = {" ", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if (month < 1 || month > 12) {
            return "Invalid month";
        } else {
            return monthNames[month];
        }
    }

    public static int dayInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else {
            return days[month - 1];
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int t = (14 - month) / 12;
        int y0 = year - t;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * t - 2;
        int d = 1;
        int result = (d + x + (31 * m0) / 12) % 7;
        return result; 
    }

    public static String getDayOfWeek(int day, int month, int year) {
        int t = (14 - month) / 12;
        int y0 = year - t;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * t - 2;
        int result = (day + x + (31 * m0) / 12) % 7;
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return daysOfWeek[result];
    }
}

