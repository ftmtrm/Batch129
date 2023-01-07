package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists01 {
    public static void main(String[] args) {
        /* 1) ArrayList'ler coklu data depolamak icin kullanilir.
           2) Arraylist'ler non=primitive data type'indeki coklu datalari depolamak icin kullanilir
              Arrayler ise primitive data veya reference kabul ederler.(1.fark)
           3) Arraylist'leri olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur.(bu daha iyidir)
           4) Arraylist(List)'ler eleman sayisinda flexible'dir.ancak Array'ler flexible degildir.(2.fark)
           5) Madem Arrayler eleman sayisi konusunda flexible degil nicin Java Arrayleri iptal etmedi?
              -Bazi veriler sabittir degismez ondan Array'ler tercih edilir. yani eleman sayisi belli olan datalari depolamak
              icin Arrayler tercih edilir.turkiyenin bolgeleri gibi
              -Arrayler super fast tir
              -Arrayler memory'de cok az yer kaplar.
        */

        //List nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);

        //List'lere eleman nasil eklenir?
        ages.add(12);
        ages.add(9);
        ages.add(10);

        ages.add(1,656);//index bire 656 koy demek
        ages.add(3,777);

        System.out.println(ages);// elemanlari sizin verdiginiz siraya gore listeye koyuyor [12,9,10]
        //Liste eleman eklemek icin add methodu kullanilir. Add methodu elemanlari sizin verdiginiz sirada list'e ekler.
        // buna Java'da "insertion order" denir

       //list'e coklu eleman nasil eklenir veya List'e baska list nasil eklenir?
        //bir list'e coklu eleman eklemek icin o elemanlari once baska bir list'in icine eklemelisiniz
        ArrayList<Integer>newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);//9,656,12,777,10,8,9,10
        ages.addAll(2,newAges);//2.index'e 8,9,10'u ekle
        System.out.println(ages);

        // list'i Array'e cevirmek icin "toArray methodu" kullanilir.//ages.toArray();
        // bir listin icindeki tum elemanlari silmek icin "clear methodu" kullanilir.//ages.clear();
        boolean r = ages.contains(656);//contains () bir elemanin list te olup olmadigini kontrol etmek icin kullanilir.
        //Bir List'in baska bir list ile ayni olup olmadigini nasil kontrol ederiz?
        ArrayList<String>names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");
        ArrayList<String>names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s = names1.equals(names2);
        System.out.println(s);//false verdi. Cunku iki listin esit olabilmesi icin ayni indexte ayni elemanlar olmali!!!!!

        //Ex1: verilen iki integer listte tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz.
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);//7 yaparsak false verir.
        nums1.add(9);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(9);
        nums2.add(8);
        nums2.add(10);

        Collections.sort(nums1);//coklu datanin biryere konulmasi.listler collection yapisinin bir parcasidir.
        Collections.sort(nums2);

        boolean t = nums1.equals(nums2);
        System.out.println(t);
    }
}
