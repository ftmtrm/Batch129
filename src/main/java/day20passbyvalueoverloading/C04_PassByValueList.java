package day20passbyvalueoverloading;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {
    public static void main(String[] args) {
       /* bir list oluşturalım.
        sonra list elemanlarını  elemanDegistir methodu yazıp orada
        list elemanlarından bazılarını degiştirelim.
        method void olsun.
        main methoda döndükten sonra yeniden list'i yazdıralım */

        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("D");

        listElemanlariniDegistir(harfler);
        System.out.println("Main icinde methoddan sonra harfler = " + harfler);//[R,B,C,D]
        //Listemizde icindeki elemanlardan bir ya da birkacini degistirdigimizde listeyi degistirmis olmuyoruz.
        // pass by value Array ve List'lerde de aynen gecerlidir degerini korur.
        // eleman ekleyip cikarmakla degismis olmuyor
        // listin ve arrayin yapisini degistirirsek deger de degisir.

        listDegistir(harfler);
        System.out.println("mainin icinde methoddan sonra harfler = " + harfler);//[R,B,C,D]
    }

    private static void listDegistir(List<String> harfler) {
        harfler = new ArrayList<>();
        System.out.println("methodda yeni list harfler = " + harfler);// =[]
    }

    private static void listElemanlariniDegistir(List<String> harfler) {
        harfler.set(0,"R");
        System.out.println("method icindeki harfler = " + harfler);
    }
}
