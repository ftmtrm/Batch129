package day15arrayssule;

import java.util.Arrays;
import java.util.Comparator;

public class C05_Arrays {
    public static void main(String[] args) {
        //Arama motoruna "guzel isimler" adli bir application icin isimleri kucukten buyuge siralayan kodu yaziniz

        String arr []= {"Abdurrahman", "Emre", "Yunus", "Ali", "Mehmet", "Can", "Veli"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Comparator.comparingInt(String ::length));
        System.out.println((Arrays.toString(arr)));

        //String array elemanlarini karaketer sayisina gore ve ayni karakter sayisina sahipse
        // alfabetik siraya gore (natural order) ve tersten buyukten kucuge siralayiniz

        String brr []= {"Abdurrahman", "Emre", "Yunus", "Ali", "Mehmet", "Can", "Veli"};
        Arrays.sort(brr, Comparator.comparingInt(String ::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println((Arrays.toString(brr)));



    }
}
