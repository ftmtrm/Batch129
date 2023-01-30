package practiceAdvanced12;

import java.util.HashMap;
import java.util.Map;

public class Q05_Map_AdSoyad {
    public static void main(String[] args) {
        /*İki farklı Array'de aynı indekste barındırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
        input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
        output : {John=Doe, Mark=Twain, Ali=Can};*/
        String[] ad = {"John", "Mark", "Ali"};
        String[] soyAd = {"Doe", "Twain", "Can"};

        Map<String, String> adsoyAd = new HashMap<>();
        for (int i = 0; i < ad.length; i++) {
            adsoyAd.put(ad[i],soyAd[i]);
        }
        System.out.println(adsoyAd);
    }
}
