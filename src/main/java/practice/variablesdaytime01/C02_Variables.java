package practice.variablesdaytime01;

import java.util.Scanner;

public class C02_Variables {


    /*
    techpoed spor salonu icin kullanicidan isim,soyisim,yas,kilo,boy
    salona devam edecegi ay suresi bildilerini alip aylik $20 olarak toplam ucretini yazdiriniz
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("TechProEd Spor Salonuna hosgeldiniz");
        System.out.println("Lutfen isim soyisim giriniz");

        String isim = input.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input.nextByte();
        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = input.nextDouble();
        System.out.println("Lutfen boyunuzu giriniz");
        double boy = input.nextDouble();
        int aylik_ucret = 20;
        System.out.println("aylik_ucret ="+aylik_ucret);
        System.out.println("Kac ay geleceginizi giriniz");
        int ay = input.nextInt();
        int toplam_tutar = aylik_ucret*ay;
        System.out.println("toplam_tutar="+toplam_tutar);

        System.out.println("\nIsminiz : "+isim+ "\t"+
                "  Yasiniz : " +yas+ " Kilonuz :"+kilo+   " Boyunuz : "+boy+ " Odemeniz gereken toplam tutar : "+toplam_tutar+"$");



    }
}
