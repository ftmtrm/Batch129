package day11loops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        //5'den 10'a kadar olan tamsayilarin toplamini bulan kodu yaziniz
        int sum = 0;
        for (int i = 5; i <11 ; i++) {
            sum=sum+i;

        }
        System.out.println("5'den 10'a kadar toplam:"+sum);

        //6'dan 3'e kadar olan tamsayilarin carpimini bulan kodu yaziniz
        int multiply = 1;
        for (int i = 6; i >2 ; i--) {
            multiply = multiply * i;//multiply*=multiply kullanilmasi daha iyidir

        }
        System.out.println("6'dan 3'e kadar carpim:"+multiply);

        //kullanicidan alinan bir tam sayinin rakamlari toplamini yazan kodu yaziniz.
        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int num = input.nextInt();
        num=Math.abs(num);
        int sonuc = 0;
        for (int i = num; i >0; i=i/10) {
            sonuc=sonuc+i%10;


        }
        System.out.println(sonuc);

        }
}
