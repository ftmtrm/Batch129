package day32collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    public static void main(String[] args) {
        //LinkedHashSet olusturma
        LinkedHashSet<String> artist = new LinkedHashSet<>();

        //LinkedHashSet'e eleman ekleme:
        artist.add("Ajda");
        artist.add("Tom");
        artist.add("Brad");
        artist.add("Angelina");
        artist.add("Tom");//koyulabilir izin verir ama set'lerde tekrar olmaz kod calisir hata vermez
        // ayni elemani tekrar tekrar eklersek "set" sadece en son ekleneni gosterir.buna override denir

        System.out.println(artist);//insertion order'a gore dizer.

        LinkedHashSet<String>actress = new LinkedHashSet<>();
        actress.add("Ajda");
        actress.add("Angelina");

        artist.removeAll(actress);
        System.out.println(artist);//[Tom,Brad]


    }
}
