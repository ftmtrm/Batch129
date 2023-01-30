package MyPractices.replit;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;
import java.util.Scanner;

public class GCD_LCM {
    /*Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
    Input :30 and 40 Expected OutPut:GCD for 30 and 40 = 10 LCM for 30 and 40 = 120*/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = input.nextInt();
        System.out.println("Please enter an another number");
        int num2 = input.nextInt();
        //Calculating GCD
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

        //Calculating LCM
        int lcm = (num1 * num2) / gcd;
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

    }
}


