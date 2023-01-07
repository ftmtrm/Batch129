package practice.IfStatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        /* Kullanicidan bir gun alin. Eger gun cuma ise "Muslumanlar icin kutsal gun"
        Cumartesi ise "Yahudiler icin kutsal gun"
        pazar ise "Hristiyanlar icin kutsal gun" yazdiran kodu olusturun
         */
        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String gun = input.next().toLowerCase();//kucuk harfe cevirdik

        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");

        } else if (gun.equals("pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");

        } else {
            System.out.println("Kutsal gun degil");
        }

    }
}

