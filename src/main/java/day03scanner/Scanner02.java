package day03scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {
        //kullanıcıdan ilk ismini ve soyismini alıp ikisini aynı satırda ekrana yazdırınız
        Scanner input = new Scanner(System.in);//1.adım
        System.out.println("Ilk isminizi giriniz...");//2.adım
        String firstName = input.next();//memorye koymuş oluyoruz.
        // next() method kullanıcıdan tek kelimeli String almak için kullanılır
        System.out.println("soyisminiz giriniz...");
        String lastName = input.next();//memorye koymuş oluyoruz

        System.out.println(firstName+" "+lastName);


    }
}
