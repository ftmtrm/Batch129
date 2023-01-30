package MyPractices.replit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber_List {
    /* Write a program that accepts an integer as input and prints first 10 prime numbers greater than input
     Check numbers if they are even or not in a return method.
 Input : 5  Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]*/
    public static void main(String[] args) {
        int input = 5;
        List<Integer> primeNumbers = new ArrayList<>();
        int num = input + 1;
        int count = 0;
        while (count < 10) {
            if (isPrime(num)) {
                primeNumbers.add(num);
                count++;
            }
            num++;
        }

        System.out.println(primeNumbers);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    }





