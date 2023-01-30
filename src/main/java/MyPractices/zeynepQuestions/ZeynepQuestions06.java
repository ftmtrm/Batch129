package MyPractices.zeynepQuestions;

import java.util.Scanner;

public class ZeynepQuestions06 {
    public static void main(String[] args) {
        /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = input.nextInt();
        int bolenSayiT = 0;

        for (int i = 1; i <sayi ; i++) {
            if (sayi % i == 0) {
                bolenSayiT += i;
            }
        }
            if (bolenSayiT==sayi){
                System.out.println("Mukemmel sayi");
            }else
                System.out.println("mukemmel sayi degildir");
        }

    }

