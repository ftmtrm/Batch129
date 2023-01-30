package day31collections;

import java.util.HashSet;

public class HashSet01 {
    /*Hash bir tekniktir biz bu teknigi kullanarak unique(benzersiz) datalar uretiriz.
    set==> tekrarsiz datayi depolamak icin kullanilan bir Collection'dir.
    Set'ler 3'e ayrilir:
    - Hashset:       a)Super fast'tir.cunku HashSet'ler verdiginiz elemanlari siralamak icin zaman kaybetmez
    yani HashSet'lere eklenen elemanlar rastgele siralanirlar.hiz cok onemliyse elemanlarin
    sirasi onemli degilse kullanilmasi uygundur.
                     b) HashSet'ler tekrarli elemana musaade etmez.
                     c) HashSet'ler sadece bir tane "null"i eleman olarak kabul ederler.
    - LinkedHashset: a) Elemanlari insertion order'a gore dizer.
                     b) Elemanlari siralamakta zaman kaybettigi icin HashSet'e gore yavastir.

    - TreeSet        a) Elemanlari natural order'a gore siralar.(Tree kelimesini gorursek natural order
    aklimiza gelmeli) cok zahmetlidir.
                     b) TreeSet natural order yaparken cok zaman harcar o yuzden en yavas Set'tir.
                     c) Tekrarli elemana musaade etmezler.
     */
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);
        System.out.println(hs);//random siralama yapti

        int hc = hs.hashCode();
        System.out.println(hc);//329 HashSet'in hashcode'udur.
    }



}
