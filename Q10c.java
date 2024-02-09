public class Q10c {
    public static int numberOfDaysInAYear(int year) {
        // Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Return the number of days based on whether it's a leap year or not
        return isLeapYear ? 366 : 365;
    }
    public static void main(String[] args) {
        int year = 2024; // Example year
        int days = numberOfDaysInAYear(year);
        System.out.println("Number of days in year " + year + ": " + days);
    }

    // public static int numberOfDaysInAYear(int year) {
    //     // Check if the year is a leap year
    //     boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    //     // Return the number of days based on whether it's a leap year or not
    //     return isLeapYear ? 366 : 365;
    // }
}