package day36Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Ayse", "Ada", "Okan", "Semih",
                "Gulsen", "Ali", "Zeynep", "Semih", "bilal", "Suleyman", "Abdullah", "Abdulkadir", "Ebubekir"));
        alfabetikBykTkrsz(isimler);
        System.out.println();
        chrctrTrsTkrsz(isimler);
        System.out.println();
        chrctrKckByk(isimler);
        System.out.println();
        chrctrYedidenAz(isimler);
        System.out.println();
        wileBaslayanlar(isimler);
        System.out.println();
        xileBitenler(isimler);
        System.out.println();
        enBuyukKarakter(isimler);
        System.out.println();
        snIlkHrfHrc(isimler);
        System.out.println();
        krktrSysCftTkrszBykKck(isimler);
        System.out.println();

    }//main

    //yazdir method Method referance
    public static void yazdir(String a) {
        System.out.println("a" + " ");//yazdirmak icin bu da kullanilabilir
    }

    // Task -1 : List elemanlarini alfabetik buyuk harf ve  tekrarsiz yazdiriniz.
    public static void alfabetikBykTkrsz(List<String> isimler) {
        isimler.stream().distinct().map(String::toUpperCase).sorted().forEach(t -> System.out.print(t + " "));
    }

    // Task -2 : list elemanlarinin character sayisini ters sirali olarak tekrarsiz yazdiriniz..
    public static void chrctrTrsTkrsz(List<String> isimler) {
        isimler.
                stream().
                map(String::length).
                distinct().//bunu one koyunca sadece isimlerden siliyor karakter sayisi ayni olanlari silmiyor
                sorted(Comparator.reverseOrder()).
                forEach(t -> System.out.print(t + " "));
    }

    // Task-3 : List elemanlarini, character sayisina gore kucukten buyuge gore yazdiriniz..
    public static void chrctrKckByk(List<String> isimler) {
        isimler.
                stream().
                sorted(Comparator.comparing(String::length)).
                forEach(t -> System.out.print(t + " "));
    }

    // Task-4 : List elemanlarinin hepsinin karakter sayisinin 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void chrctrYedidenAz(List<String> isimler) {
        System.out.println(isimler.
                stream().
                allMatch(t -> t.length() <= 7) ? "list elemanlarinin karakter sayisi 7 ve 7'den daha azdir" :
                "list elemanlarinin karakter sayisi 7'den fazladir.");
    } //all match()--> mukemmeliyetcidir butun elemanlar o sarti saglarsa true dondurur.1 eleman dahi sarti saglamazsa sonuc false olur.
    //any match ()--> en az bir eleman sarti sagliyorsa true dondurur.
    //none match()--> hicbir sarti eleman sarti saglamazsa true dondurur, en az bir tanesi sagliyorsa false dondurur.

    // Task-5 : List elelmanlarinin hepsinin "w" ile baslamasını noneMatch() ile kontrol ediniz.
    public static void wileBaslayanlar(List<String> isimler) {
        System.out.println(isimler.
                stream().
                noneMatch(t -> t.startsWith("w")) ? "w ile baslayan isim bizde olmaz" :
                "w ile baslayan isimler");
    }

    // Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı var mı kontrol ediniz.
    public static void xileBitenler(List<String> isimler) {
        System.out.println(isimler.
                stream().
                anyMatch(t -> t.endsWith("x")) ? "x ile biten isimler var" :
                "x ile biten isim yoktur");
    }

    // Task-7 : Karakter sayisi en buyuk elemani yazdiriniz.

    public static void enBuyukKarakter(List<String> isimler) {
        Stream<String> sonIsim = isimler.
                stream().
                sorted(Comparator.comparing(t -> t.toString().
                        length()).reversed()). limit(1);
        System.out.println(Arrays.toString(sonIsim.toArray()));
    }
        //Stream'i Array'e cevirdik.limit() methodu bu sekilde calisiyor.

//limit() methodu icine 1 sayisini yazarsaniz en buyuk karakter sayisina sahip elemani verir.
// 2 yazarsak en buyuk karakter sahisina sahip ilk iki elemani verir.

// Task-8 : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari yazdiriniz.
        public static void snIlkHrfHrc(List<String> isimler) {
            isimler.
                    stream().
                    sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                    skip(1).
                    forEach(t -> System.out.print(t + " "));
        }
        // Task-9 : Karakter sayilari cift olan elemanlarin karakter sayilarinin karelerini hesaplayan;
        // tekrarli olanlari sadece bir kere buyukten kucuge  yazdiran programi yaziniz

    public static void krktrSysCftTkrszBykKck(List<String> isimler) {
        isimler.
                stream().
                filter(t->t.length()%2==0).
                map(t->t.length()*t.length()).
                distinct().
                sorted(Comparator.reverseOrder()).
                forEach(t -> System.out.print(t + " "));


    }

    }

