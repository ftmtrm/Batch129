package day03scanner;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {
        //kullanıcıdan bir dikdörtgenin iki kenar uzunluğunu alınız
        //alanını hesaplayınız
        //cevresini hesaplayınız

        Scanner input = new Scanner(System.in);
        System.out.println("Kisa kenar uzunlugunu giriniz..");
        float shortSide= input.nextFloat();
        System.out.println("uzun kenar uzunlugunu giriniz");
        float longSide = input.nextFloat();

        System.out.println("Alan=" + (shortSide*longSide));
        System.out.println("Cevre="+(2*shortSide+2*longSide));


    }
}
