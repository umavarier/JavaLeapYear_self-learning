// program to find the entered year is leap year .

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner inputYear = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = inputYear.nextInt();
        inputYear.nextLine();
        isLeapYear(year);


        inputYear.close();
    }

    public static void isLeapYear(int year) {
        boolean ly;
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                ly = true;
            } else {
                ly = false;
            }
        } else {
            ly = false;
        }

        if (ly) {
            System.out.println(year + " is Leap year.");
        } else {
            System.out.println(year + "is not Leap year.");
        }
    }

}

