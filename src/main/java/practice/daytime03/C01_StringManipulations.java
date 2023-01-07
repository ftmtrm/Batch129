package practice.daytime03;

import java.util.Scanner;

public class C01_StringManipulations {
    public static void main(String[] args) {
        System.out.println(15+20+"Merhaba");//35Merhaba yazdirir
        System.out.println("Merhaba"+15+20);//Merhaba1520
        System.out.println("Merhaba"+(15+20));//Merhaba35
        System.out.println("Merhaba"+15*20);//Merhaba300

        //Kullanicidan ismini ve soyismini girmesini isteyin
        // console'a nasil girerse girsin isminin buyuk harfle gorunmesini saglayin
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ad ve soyadinizi giriniz");
        String isim = input.nextLine(),soyAd=input.nextLine();//****YENI****MULTIPLE DECLARATION(COKLU TANIMLAMA)
        String tamIsim = isim.concat(" "+soyAd).toUpperCase();
        System.out.println(tamIsim);

        //rakam haricindekileri silin
        String str = "45.99 $";
        str=str.replaceAll("\\D","");
        // \\D Rakam haricindekileri al yani $ isaretini alcak ve silcek
        // \\w tum buyuk, kucuk harf ve rakamlari al demek
        // \\W tum buyuk, kucuk harf ve rakamlarin disindaki hersey
        // \\S bosluk disindakileri al demek
        // \\s bosluklari al
        // \\d tum rakamlari al
        System.out.println("str = " + str);

        //verilen bir cumleyi * ile gizleyin,10.karakterden sonrasini yazdirin
        String cumle = "Her dert Java gibi olsa";
        System.out.println(cumle.replaceAll("\\w","*")+cumle.substring(10));

        //a harfi yerine @ yerlestiriniz
        String kelime = "olaganustu";
        System.out.println(kelime.replace("a","@"));

        //butun a lari e ile degistirin.
        String txt = "Merhaba Dunya";
        System.out.println(txt.replace("a","e"));
        System.out.println(txt.replaceFirst("a","e"));//sadece ilk a yi e yapar.

        //"kalem" yerine "biber" yazdirin.
        String str2 = " Dolma Kalem ile bir Dunya kaleme aldik";
        System.out.println(str2.replaceAll("Kalem","biber"));

        String str3 = "bugun hava yagmurlu";
        System.out.println(str3.length());

        String str4 = "";
        System.out.println(str4.length());

        String str5 = " ";
        System.out.println(str5.length());

        //kullanicidan isim ve soyisim girmesini isteyin. hangisinin daha uzun oldugunu yazdiran kodu olusturunuz.
        Scanner input1 = new Scanner (System.in);
        System.out.println("Lutfen isim ve soyisminizi giriniz: \n isim :");
        String name = input.next();
        System.out.println("soyisim: ");
        String surname = input.next();

        if(name.length()>surname.length()) {
            System.out.println("isminiz daha uzun");

        }else if(name.length()==surname.length()) {
            System.out.println("isminiz ile soyisminizin uzunlugu ayni");

        }else {
            System.out.println("soyisminiz daha uzun");

        }










    }


}
