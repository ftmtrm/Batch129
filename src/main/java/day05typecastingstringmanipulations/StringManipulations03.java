package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
        /*
        Ex1: Asagidaki kurallara gore kullanicinin girdigi sifreyi kontrol ediniz.
        1. En az 8 karakter olsun.
        2. Bosluk karakteri olmasin.
        3. En az bir tane buyuk harf olsun.
        4. En az bir tane kucuk harf olsun.
        5. En az bir tane sembol olsun.
        6. En az bir tane rakam olsun.

         */
    Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        // 1. En az 8 karakter olsun.
        boolean firstRule = pwd.length()>7;//Ac123?sd verdik sifre olarak.
        System.out.println(firstRule);

        // 2. Bosluk karakteri olmasin.
         boolean secondRule = !pwd.contains(" ");
        System.out.println(secondRule);

        // 3. En az bir tane buyuk harf olsun.
        //note:buyuk harf olmayanlari sil
        // kalan karakter sayisina bak
        // karakter sayisi 0 ise buyuk harf yok demektir.
        // sifirdan buyuk ise buyuk harf var demektir.

        boolean thirdRule = pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println(thirdRule);

        // 4. En az bir tane kucuk harf olsun.
        boolean fourthRule = pwd.replaceAll("[^a-z]","").length()>0;
        //methodlari ayni satirda yanyana kullanmaya "Method Chain" denir
        System.out.println(fourthRule);

        // 5. En az bir tane sembol (harf ve rakam harici hersey) olsun.
        boolean fifthRule = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
                System.out.println(fifthRule);

        // 6. En az bir tane rakam olsun.
        boolean sixthRule = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixthRule);

        System.out.println("Password gecerli mi?" + (firstRule && secondRule && thirdRule && fourthRule && fifthRule && sixthRule));

    }
}
