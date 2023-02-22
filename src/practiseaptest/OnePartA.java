package practiseaptest;

import static practiseaptest.HelperFunctions.print;

public class OnePartA {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    private static int firstDayOfYear(int year){
        int day = 0;
        for (int i = 1800; i < year; i++) {
            if (isLeapYear(i)) {
                day += 2;
            } else {
                day++;
            }
            day %= 7;
        }
        return day;
    }
    private static int dayOfYear(int month, int day, int year) {
        int dayOfYear = 0;
        for (int i = 1; i < month; i++) {
            dayOfYear += daysInMonth(i, year);
        }
        dayOfYear += day;
        return dayOfYear;
    }
    private static int daysInMonth(int i, int year) {
        if (i == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else if (i == 4 || i == 6 || i == 9 || i == 11) {
            return 30;
        } else {
            return 31;
        }
    }
    public static int numberOfLeapYears(int year1, int year2) {
        if (!(0 <= year1) || !(year1 <= year2)) {
            return 0;
        }
        int numLeapYears = 0;
        for (int i = year1; i <= year2; i++) {
            if (isLeapYear(i)) {
                numLeapYears++;
            }
        }
        return numLeapYears;
    }

    public static void main(String[] args) {
        print(numberOfLeapYears(2020, 2012));
    }
}
