package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {
    public static void main(String[] args) {
        //Ex: String Array elemanlarini karakter sayisina gore kucukten buyuge siralayiniz.
        // ["Michael" , "Ajda" , "Thomas",  "Tom"]
        String arr[] = {"Michael" , "Ajda" , "Thomas",  "Tom"};
        Arrays.sort(arr, Comparator.comparingInt(String::length));//verilen elemanlari sirala ama verilen kurala gore sirala
        //comparator olani sectik siralama icin verdigimiz kurali kullan diyoruz
        // :: method referance denir bir methodu kullan demek string'teki length'i kullan diyoruz
        System.out.println(Arrays.toString(arr));

        //Ex2: String Array elemanlarini karakter sayisina gore buyukten kucuge siralayiniz.
        String brr[ ]={"Michael" , "Ajda" , "Thomas",  "Tom", "Cuneyt"};
        Arrays.sort(brr, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr));

        //Ex3://Ex: String Array elemanlarini karakter sayisina gore kucukten buyuge siralayiniz.
        //ayni karakter sayisina sahip olanlari da alfabetik sirayla ekrana yazdirin

         String crr[] = {"Michael" , "Ajda" , "Thomas", "Cuneyt","Tom", "Reyhane", "Ali", "Cin", "Cem", "Gabriel"};
         Arrays.sort(crr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));//Java'da varolan methodlari kullanmaya "functional programming(Lambda)" denir.


    }
}
