package practiceAdvanced13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q02_Map_Aile {
    /*
    Ad-Soyad-Yaş ve kardeşler listesini tek bir Map içerisinde saklayan bir kod yazınız.
     */
    public static void main(String[] args) {
       /* Map<String,String> adSoyad = new HashMap<>();
        Map<Map<String,String>, Integer> adSoyadYas = new HashMap<>();
        adSoyad.put("Ali", "Can");
        adSoyadYas.put(adSoyad,15);
        System.out.println("adSoyadYas = " + adSoyadYas);*/
        Aile ali = new Aile("Ali","Can",15,"Ahmet","Hayriye");
        System.out.println("ali.getAileMap() = " + ali.getAileMap());
        Aile veli = new Aile("Veli","Han",25,"Mehmet","Hatice","Hasan","Hüseyin");
        System.out.println("veli.getAileMap() = " + veli.getAileMap());
        Aile ayse = new Aile("Ayşe","Tan", 35, "Fatma");
        System.out.println("ayse.getAileMap() = " + ayse.getAileMap());

    }
}
