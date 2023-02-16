package Lambda_Practice_BurakHoca;

import day37Lambda.Utilities;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5, -8, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));
        ciftvePztfLamExYazdir(sayi);
        System.out.println("\n *******");
        ciftvePztfMethodRfrnceYazdir(sayi);
        System.out.println("\n *******");
        ElmnKareleriYazdir(sayi);
        System.out.println("\n *******");
        kareTkrszYazdr(sayi);
        System.out.println("\n *******");
        ByktenKcgeSirala(sayi);
        System.out.println("\n *******");
        PztfKupBul(sayi);
        System.out.println("\n *******");
        ToplamBulMthRfrnce( sayi);
        System.out.println("\n *******");
        ToplamBulLambdaExp(sayi);
        System.out.println("\n *******");
        System.out.println(pztfCrpBulLambdaExp( sayi));
        System.out.println(CiftKarelerKcktenBuyuge(sayi));

    }

    //SORU1: List elemanlarının çift ve pozitif olanlarını,
    // Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftvePztfLamExYazdir(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 == 0 && t > 0).forEach(t -> System.out.print(t + " "));
    }

    //SORU2: List elemanlarının çift ve pozitif olanlarını,
    // Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftvePztfMethodRfrnceYazdir(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 == 0 && t > 0).forEach(Utilities::yazInt);
    }

    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    public static void ElmnKareleriYazdir(List<Integer> sayi) {
        sayi.stream().map(Utilities::karesi).forEach(Utilities::yazInt);
    }

    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void kareTkrszYazdr(List<Integer> sayi) {
        sayi.stream().map(Utilities::karesi).distinct().forEach(Utilities::yazInt);
    }

    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void ByktenKcgeSirala(List<Integer> sayi) {
        sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utilities::yazInt);
    }

    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void PztfKupBul(List<Integer> sayi) {
        sayi.stream().filter(Utilities::pozitifMi).map(Utilities::kupu).
                filter(t -> t % 10 == 5).forEach(Utilities::yazInt);
    }

    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın
    public static void ToplamBulMthRfrnce(List<Integer> sayi) {
        Optional<Integer>sonuc = sayi.stream().reduce(Integer::sum);
        System.out.println(sonuc);
        //reduce, forEach gibi terminal methodlarindan sonra hicbisey method kullanilamaz
        // null exception firlatma ihtimali oldugu icin Java
       // kendini garantiye aliyor ve Optional integer'a cevir diyor.
//        System.out.println(sayi.stream().reduce(Integer::sum)) seklinde de oluyor atama yapmadan.
    }
    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
    public static void ToplamBulLambdaExp(List<Integer> sayi) {
        int toplam= sayi.stream().reduce(0, (t, u) -> t + u);
        System.out.println(toplam);
        //Orn; reduce( 0,(t,u)->t+u) ==>  "t" ilk degeri "sifir" dan alir, daha sonraki degerleri
        // toplamanin sonucundan alir."u" ise degerlerini her zaman "stream " den yani akista bize ne verilmis ise (orn List) oradan alir .
        //cunku herhalukarda  "0" bir deger oldugu icin "Optional Integer" a da gerek kalmaz.
        //Aksi takdirde "0 Identity"  olmadiginda Java, Ya listte hic eleman yoksa(null ise)!!!  diye kizarir.
        //Java null i Integer kabul etmedigi icin hata verir , bunu engellemek icin java "Optional Integer" a cevirir
    }
    //SORU9 : Listin pozitif elemanlarının, carpımını Lambda Expression ile return ederek yazdırın
    public static int pztfCrpBulLambdaExp(List<Integer> sayi) {
        int carpim = sayi.stream().filter(t -> t > 0).reduce(1, (t, u) -> t * u);
        return carpim;
    }
    ////SORU10 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp
        // list halinde return ederek yazdırınız.
    public static List<Integer> CiftKarelerKcktenBuyuge(List<Integer> sayi) {
       List<Integer>sonuc = sayi.stream().filter(Utilities::ciftMi).map(Utilities::karesi).sorted().collect(Collectors.toList());
        return sonuc;
    }
}