package practice.daytime04;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
        /* INTERVIEW Question
        kullanicidan toplanmak uzere sayilar isteyin
        sayi adedi 10'u gecerse veya toplam 500'u gecerse bu kadar sayi yeter
        ".....adet sayi girdiniz
        toplami....yazdiriniz
         */
        Scanner input = new Scanner(System.in);

        int sayi = 0;
        int toplam = 0;
        int sayac = 0;
        while (sayac < 11 && toplam < 501) {
            System.out.println("Lutfen toplamak istediginiz birsayi giriniz");
            sayi = input.nextInt();//her adimda gozukmesi icin loop un icinde yazdim
            toplam += sayi;
            sayac++;
        }
        if (toplam>500 || sayac>10){
            System.out.println("Bu kadar sayi yeter."+sayac+"adet sayi girdiniz.Toplam"+toplam);
        }else
            System.out.println(sayac+" adet sayi girdiniz.Toplami " + toplam);

        }

    }

