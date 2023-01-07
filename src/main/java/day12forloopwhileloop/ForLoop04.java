package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop04 {
    public static void main(String[] args) {
        /* Kullanicidan baslangic ve bitis degerlerinin arasindaki tum cift sayilari ekrana yazdiriniz.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Baslangic degerini giriniz");
        int start = input.nextInt();
        System.out.println("Bitis degerini giriniz");
        int end = input.nextInt();
        if (start > end) {
            System.out.println("Baslangic degeri bitis degerinden buyuk olamaz");

        } else {
            for (int i = start; i <= end; i++) {//bazi looplar hic calismadan da kirilabilir
                // bitisi baslangictan buyuk girerse
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }

            }
        }

    }
}
