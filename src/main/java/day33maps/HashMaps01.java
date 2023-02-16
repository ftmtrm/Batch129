package day33maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps01 {
    /*
    1) Map'lerde "USA=400,000,000" seklinde data depolamamiz gerektiginde kullanilir.
    2) "USA=400,000,000" datasinin USA kismi key olarak adlandirilir ve key'ler essizdir.(unique)
    3) "USA=400,000,000" datasinin 400,000,000 bolumu value olarak adlandirilir ve value'lar tekrarli olabilir.
    4) Map'lerde depoladiginiz her bir dataya "entry" denir.Eleman denmez
    5) "Entry"ler unique'dir.Cunku key kisimlari unique oldugundan herbir entry digerlerinden farklidir.
    6) "Hashmap"ler cok hizlidir cunku "entry"leri siralama ile ugrasmazlar.
    7) "HashMap"lerde bir tane "key"i "null" yapabilirsiniz.
    8) "Hashmap"lerde birden fazla value'yu null yapabiliriz cunku value'lar tekrarli olabilir.
    9) "Hashmap"ler "multi thread" icin kullanilamaz ve "synchronization" yoktur.
     */
    public static void main(String[] args) {
        //HashMap nasil olusturulur?
        HashMap<String, Integer> hm = new HashMap<>();
        System.out.println(hm);//{}

        //HashMap'lere nasil "entry" eklenir?
        hm.put("USA", 400000000);//entry eklemek icin "put" kullanilir.
        hm.put("Germany", 83000000);
        hm.put("Albania", 3000000);
        hm.put("Albania", 2800000);
        hm.put(null, 12000000);
        hm.put(null, 18000000);
        hm.put("Myanmar", null);
        hm.put("Bhutan", null);
        System.out.println(hm);//Entry==> {null=18000000, Myanmar=null, USA=400000000, Bhutan=null, Germany=83000000, Albania=2800000}
        //!!!Ayni key'i kulllanarak yeni bir entry eklerseniz varolan entry'nin value'sunu update etmis olursunuz.
        //Listlerdeki set methoduna benzer.

        //HashMap'lerde sadece key'ler nasil alinir?
        Set<String> hmKeys = hm.keySet();//key'leri set olarak kullaniyor.tekrarsiz olsun diye
        System.out.println(hmKeys);//[null, Myanmar, USA, Bhutan, Germany, Albania] collection oldugu icin boyle yazdirdi

        //HashMap'lerde sadece value'ler nasil alinir?
        //Ex: hm Map'indeki ulkelerin toplam nufusunu bulunuz.
        hm.values();//set kullanmiyor tekrarli olabilir cunku. collection kullaniyor
        Collection<Integer> hmvalues = hm.values();
        int sum = 0;
        for (Integer w : hmvalues) {
            if (w != null) {
                sum += w;
            }
        }
        System.out.println(sum);

        //HashMap'lerde belirli bir key'in value'su nasil alinir?
        Integer usaPopulation = hm.get("USA");
        System.out.println(usaPopulation);

        //HashMap'lerde varolan bir key'in value'sunu degistirmek icin kullanilir.
        hm.replace("Bhutan", 35000000);
        System.out.println(hm);

        //HashMap'lerde olmayan bir key nasil eklenir?.
        hm.putIfAbsent("USA", 700000000);//USA zaten oldugu icin eklemedi
        System.out.println(hm);
        hm.putIfAbsent("India", 700000000);//yeni key oldugu icin ekledi.
        System.out.println(hm);

        //ex2: yeni ogretmenin maasi standart ucretten(10 bin) 1000 tl fazla, eski ogretmenin maasi standart ogretmenden
        //2000 tl fazla olsun.
        HashMap<String, Integer> salaries = new HashMap<>();
        salaries.put("Ali", 8000);
        salaries.put("Ayse", 5000);
        salaries.put("Veli", 9000);
        salaries.put("Tom", 9900);

        String teacherName = "Kemal";
        if (salaries.keySet().contains(teacherName)) {
            salaries.put(teacherName, 12000);//{Tom=12000, Veli=9000, Ayse=5000, Kemal=11000, Ali=8000}
        } else
            salaries.putIfAbsent(teacherName, 11000);
        System.out.println(salaries);//{Tom=9900, Veli=9000, Ayse=5000, Kemal=11000, Ali=8000}

        //replace methodu key USA ve value 400 milyon ise value'yu 500 milyon yapar.
        hm.replace("USA", 400000000, 500000000);
        System.out.println(hm);

        //getOrDefault(): olan key'ler icin varolan value'yu olmayan key'ler icin ise sizin ikinci parametreye yazdiginiz degeri verir.
        Integer r = hm.getOrDefault("Bhutan", 0);//Bhutan varsa onun nufusunu vercek yoksa 0 vercek

        //entrySet() methodu herbir entry'yi set'in icinde verir.Set'lerin methodlarini kullanabilmek icin
        // Map'i entryset kullanarak set'e cevirmis oluruz. Maplerde loop kullanilmaz.
        //Map'i Set'e cevirdigimizde Set'in butun ozelliklerini kullanabiliriz.Mesela Loop gibi
        //EntrySet() methodunu kullandiginizda elde ettiginiz Set'in elemanlari Map.Entry<String, Integer> seklinde bir Map olur
        //bu yuzden elemanlar icin Map methodlari kullanilabilir.

        Set<Map.Entry<String, Integer>> myEntries = hm.entrySet();
        System.out.println(myEntries);

        //Ex: Ulke ismindeki karakter sayisini ulke nufusuna ekleyen ve sonucu konsola yazdiran kodu yaziniz.
        for (Map.Entry<String, Integer> w : myEntries) {
            if (w.getValue() != null && w.getKey() != null) {
                int toplam = w.getValue() + w.getKey().length();
                System.out.println(toplam);
            }
        }
    }
}