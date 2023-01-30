package MyPractices.replit;

import java.util.Scanner;

public class Alfabe {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter command: ");
        char letter = input.next().charAt(0);
        switch (letter) {
            case 'a':
                System.out.println("Your request is being processed");
                break;
            case 'b':
                System.out.println("Thank you anyway for your consideration");
                break;
            case 'c':
                System.out.println("Sorry, no help is currently available");
                break;
            default:
                System.out.println("Invalid entry, please try again!");
        }
    }
}