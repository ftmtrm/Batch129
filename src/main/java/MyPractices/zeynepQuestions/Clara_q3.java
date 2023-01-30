package MyPractices.zeynepQuestions;

import java.util.Scanner;

public class Clara_q3 {
    public static void main(String[] args) {
        //Kullaniciya fibonacci sayi dizisinin kac elemanini gormek isedigini sorunuz.
        //fibonacci sayi dizisini yazdiran kodu yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kac adet fibonacci sayisi gormek istediginizi giriniz");
        int number = input.nextInt();
        int fibo1 = 1;
        int fibo2 = 1;
        int fibonacci = 0;
        System.out.print(fibo1+ " ");
        System.out.print(fibo2+ " ");

        for (int i = 1; i <number-1; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
                System.out.print(fibonacci+ " ");
            }

        }





    }

