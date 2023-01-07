package day03scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan bir dikdortgenin en ve boyunu isteyerek
        // dikdortgenin alanını ve çevresini hesaplayan kodu yazınız

        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen dikdortgenin kisa kenarini giriniz");

        int en = input.nextInt();

        System.out.println("Lutfen dikdörtgenin uzun kenarini giriniz");

        int boy= input.nextInt();

        System.out.println("Alan=="+(en*boy));
        System.out.println("Cevre=="+2*(en+boy));
    }





}
