package day32collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {

        long one = System.nanoTime();
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);
        System.out.println(ts);//natural order'a gore dizdi.
        long two = System.nanoTime();

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);
        TreeSet<Integer> hts = new TreeSet<>(hs);//hashsete cevirdik cok yavas oldugu icin elemanlari hashsetle
        //yip sonra treesete cevirmek daha mantikli olur ama yine de daha yavastir.
       // System.out.println(hs);//Random siraladi
        System.out.println(hts);
        long three = System.nanoTime();

        System.out.println("TreeSet'in uygulama suresi : "+(two-one));//2485300
        System.out.println("HashSet'in uygulama suresi : "+(three-two));//175200 nerdeyse on kat hizli calisti

        /* Note: Treeset eleman eklemede cooook yavas' Hashset ise cook hizlidir. Treeset'in bu negatif yonunden kurtulmak
icin HashSet olusturup elemanlara ekler ve sonra da Hashset'i TreeSet'e ceviririz.*/
 //first methodu
        int first = ts.first();
        System.out.println(first);//ilk elemani verir.
        int last = ts.last();
        System.out.println(last);//son elemani verir.

        int floor1 = ts.floor(15);//15 elemanlardan biri degil o nedenle 15'in bir oncesinde 12 var 12 yazdirdi.
        System.out.println(floor1);
        int floor2 = ts.floor(12);//12 elemanlardan biri o nedenle aynisini yazdirir.olmayan elemani yazarsak
        //exception atar.bu nedenle floor methodunda kullanilabilecek sayi en kucuk elemandan az olamaz.
        System.out.println(floor2);

        int ceiling1 = ts.ceiling(15);//15 eleman degil o nedenle 15'den bir sonraki elemani(25) verir.
        System.out.println(ceiling1);
        int ceiling2 = ts.ceiling(25);//25 elemanlardan biri o nedenle aynisini(25) verir.
        System.out.println(ceiling2);
        //ceiling methodunda kullanacaginiz sayi en buyuk elemandan buyuk olamaz.

        SortedSet<Integer> tailSet1 = ts.tailSet(12);//12 elemanlardan biri oldugu icin 12'den sonraki
        //elemanlar bir set icinde yazdirilir.

        System.out.println(tailSet1);//[12,25,32] verdi
        SortedSet<Integer> tailSet2 = ts.tailSet(15);//15 elemanlardan biri degil bu nedenle 15'den sonraki
        //elemanlar bir set icinde yazdirildi.

        System.out.println(tailSet2);//[25,32]

       NavigableSet<Integer> tailSet3 = ts.tailSet(12,false);//12 dahil olmasin demek istiyoruz.
        // 12den sonrakileri dondurcek true yazarsak 12'yi de gosterir.[25,32]
        System.out.println(tailSet3);

        SortedSet<Integer>headSet1 = ts.headSet(12);
        System.out.println(headSet1);//[3,8]==>12 elemanlardan biri "onceki elemanlar" bir set icinde yazdirildi.
        //12 yazdirilmadi.
        SortedSet<Integer>headSet2 = ts.headSet(12,true);
        System.out.println(headSet2);//[3,8,12]==>var olan elemani kucuk olanlarin arasinda goster demek istiyoruz.

       Integer higher1 =  ts.higher(12);//12'den bir sonraki elemani verir
        System.out.println(higher1);
    //Normal methodlar parametrelerde belirtilen data tipleriyle calisirlar.
        // generic methodlar ise verilen her turlu data tipiyle calisabilen methodlardir.
        Integer lower1 = ts.lower(12);//8 verir 12'den bir onceki elemani verir.
        System.out.println(lower1);


    }
}
