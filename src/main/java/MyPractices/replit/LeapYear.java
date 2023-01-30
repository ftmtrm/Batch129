package MyPractices.replit;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.println("Please enter year");
        int year = input.nextInt();
        System.out.println("Please enter a month number");
        int numOfMonth = input.nextInt();
        switch (numOfMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Day number that you entered is: 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Day number that you entered is:  30");
                break;
            case 2:
                if (year%100==0 && year%400==0 || year%100!=0 && year%4==0) {
                    System.out.println("Day number that you entered is: 29 and the year is leap");
                } else {
                    System.out.println("Day number that you entered is: 28");
                }
                break;
            default:
                System.out.println("Please enter a valid month number");
        }
    }
}
