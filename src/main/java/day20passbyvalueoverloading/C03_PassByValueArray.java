package day20passbyvalueoverloading;

import java.util.Arrays;

public class C03_PassByValueArray {
    public static void main(String[] args) {
        /* bir array oluşturalım.
                sonra array elemanlarını  elemanDegistir methodu yazıp orada
        array elemanlarından bazılarını degiştirelim.
        method void olsun.
        main methoda döndükten sonra yeniden array'i yazdıralım*/

        int sayilar[] = {3, 4, 5, 6};
        System.out.println("sayilar[]=" + Arrays.toString(sayilar));

        elemanDegistir(sayilar);

        System.out.println("main icinde eleman degisince sayilar = " + Arrays.toString(sayilar));

        arrayiDegistir(sayilar);//return yapmadik [10,4,5,6] verdi

        System.out.println("main icinde arrayi degistirince sayilar = " + Arrays.toString(sayilar));
    }

    private static void arrayiDegistir(int[] sayilar) {
        sayilar = new int[6];
        System.out.println("method icinde arrayi degistirince sayilar []=" + Arrays.toString(sayilar));

    }


    private static void elemanDegistir(int[] sayilar) {
        sayilar[0] = 10;
        System.out.println("method icinde eleman degisince sayilar Array'i = " + Arrays.toString(sayilar));
    }
}
