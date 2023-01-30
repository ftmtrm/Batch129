package day18arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class C04_ArrayList {
    public static void main(String[] args) {
     //Example 1:Bir List'teki elemanlardan birbirine en yakin olan ikisini bulunuz
     //              [12, 19, 15, 30, 21]  ==>  19 ve 21
        ArrayList<Integer> a = new ArrayList<>();
        Collections.sort(a);
        a.add(12);
        a.add(19);
        a.add(15);
        a.add(30);
        a.add(21);
        System.out.println(a);//[12, 19, 15, 30, 21]
        Collections.sort(a);
        System.out.println("a = " + a);//a = [12, 15, 19, 21, 30]

        int minFark = Integer.MAX_VALUE;//default deger olarak max.sayiyi atadim ki
        // iki sayiyi karsilastirdiginda her halukarda listede ki sayi secilsin diye
       for( int i = 1;i < a.size();i++){
            minFark = Math.min(minFark, a.get(i) - a.get(i - 1));
            //30u da dahil edebilmek icin bir oncekiyle kiyasliyoruz.o nedenle i-1 yazilir
            }

        System.out.println(minFark);

        }

    }


