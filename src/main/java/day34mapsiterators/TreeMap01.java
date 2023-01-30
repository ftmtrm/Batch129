package day34mapsiterators;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    /*
    1) TreeMap entry'leri key'lere gore "natural order'a koyar.
    2) TreeMap cok yavastir.cunku natural order yapmak cok zaman ister.
    3) TreeMap thread safe ve synchronized degildir.
    4) TreeMap'lerin key'lerinde "null" kullanilamaz.Ama value'larda istediginiz kadar kullanabilirsiniz.
     */
    public static void main(String[] args) {
        long one = System.nanoTime();
        TreeMap<String,Integer> stdAges = new TreeMap<>();
        stdAges.put("Ali",21);
        stdAges.put("Kemal",19);
        stdAges.put("Ayse",25);
        stdAges.put("Murat",22);
        System.out.println(stdAges);//keylere gore alfabetik sira yapti.

        long two = System.nanoTime();
        HashMap<String,Integer> stdAges2 = new HashMap<>();
        stdAges.put("Ali",21);
        stdAges.put("Kemal",19);
        stdAges.put("Ayse",25);
        stdAges.put("Murat",22);

        System.out.println(stdAges2);
        long three = System.nanoTime();

        HashMap<String,Integer> stdAges3 = new HashMap<>();
        stdAges.put("Ali",21);
        stdAges.put("Kemal",19);
        stdAges.put("Ayse",25);
        stdAges.put("Murat",22);

        TreeMap<String,Integer>stdAges4 = new TreeMap<>(stdAges);
        System.out.println(stdAges4);
        long four = System.nanoTime();

        System.out.println("TreeMap: "+(two-one));
        System.out.println("HashMap: "+(three-two));
        System.out.println("HashMap==> TreeMap: "+(four-three));



    }
}
