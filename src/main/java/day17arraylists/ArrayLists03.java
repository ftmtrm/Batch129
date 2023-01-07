package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        String n = cities.remove(1);//index e gore silen remove methodu //istanbul silindi.
        //sildigi elemani verir.
        System.out.println((n));
        System.out.println(cities);

        boolean p = cities.remove("Kayseri");
        System.out.println(p);
        System.out.println(cities);//objeye gore silen remove methodu.
        // 2.kez kayseri yazsak 2sini de silmez sadece ilk "Kayseri"yi (ilk gorunumu) siler.
        //size o elemani silip silmedigini ifade eden true ya da false verir.
        // eger eleman list'te varsa elemani siler ve size true verir.
        // yok ise o elemani silemediginden size false verir.
    }
}
