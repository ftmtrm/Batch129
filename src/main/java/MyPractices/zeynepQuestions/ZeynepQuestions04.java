package MyPractices.zeynepQuestions;

import java.util.Scanner;

public class ZeynepQuestions04 {
    public static void main(String[] args) {
        /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
       soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız
            */
        //1
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 0'dan buyuk bir sayi giriniz");
        int num = input.nextInt();

        armstrong(num);
        girilenSayiyaKadarOlanArmstrong(num);
    }

    private static void armstrong(int num) {
        int kupT = 0;
        int bS = 0;
        int temp = num;

        while (num > 0) {
            bS = num % 10;
            kupT += (bS * bS * bS);
            num /= 10;
        }
        if (kupT == temp)
            System.out.println("" + temp + ": Armstrong sayidir");
        else
            System.out.println("" + temp + ": Armstrong sayi degildir");

    }      //2.

    private static void girilenSayiyaKadarOlanArmstrong(int num) {
        for (int i = 1; i <= num; i++) {
            armstrong(i); //recursive method uyguladik


        }

    }
}





