package ssgler.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class ArrayList01 {
    public static void main(String[] args) {
        /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazin
         */
        Random randomSayilar=new Random();
        int sayi=0;

        List<Integer>sayiListesi=new ArrayList<>();
        while (sayiListesi.size()<50){
            sayi=randomSayilar.nextInt(1000);

            if (!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }
        }
        System.out.println(sayiListesi);

        Scanner scan=new Scanner(System.in);
        int kalantahmin=5;
        int dogrutahmin=0;
        while (kalantahmin>0){
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            if (sayiListesi.contains(sayi)){
                System.out.println("tebrikler dogru tahminde bulundunuz"+", "+"lutfen yeni tahminlerde bulununuz");
               dogrutahmin++;
                System.out.println(" dogru tahmin sayiniz : "+dogrutahmin);
            }else {System.out.println("lutfen yeni bir sayi giriniz");
            kalantahmin--;
            System.out.println("kalan hakkınız : "+kalantahmin);}

            }

        }

    }


