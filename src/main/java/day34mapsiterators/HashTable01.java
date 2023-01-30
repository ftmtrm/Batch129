package day34mapsiterators;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable01 {
    /*
    1)Hashtable "thread-safe" ve synchronized"dir.
    2)Hashtable enrtyleri rastgele siralar.
    3)Hashtable'lar HashMap'lere gore daha yavastirlar.
    4)Hashtable'lar key'lerde ve value'larda "null" kullanilmasina musaade etmezler.

    Note: "multi-thread" ve "synchronization" kullanmaniz gerekirse ve key ve value'larda "null" kullanmak yasak
    ise Hashtable kullanmak gerekir.
     */
    public static void main(String[] args) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        ht.put(1,2);//1 -1
        ht.put(2,4);//1 -1 2 -2
        ht.put(6,8);
        System.out.println(ht);//{6=8,2=4,1=2}

    }
}
