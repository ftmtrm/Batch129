package practiceAdvanced13;

import java.util.*;

public class Aile {
    private Map<String,String> adSoyad = new HashMap<>();
    private List<String> kardeslerList = new ArrayList<>();
    private Map<Integer, List<String>> yasKardesler = new HashMap<>();
    private Map<Map<String,String>,Map<Integer, List<String>>> aileMap = new HashMap<>();

    public Aile (String ad, String soyad, int yas, String... kardesler){//constructor olusturarak getter setter'a
        // gerek kalmadan variable'lari baska class'tan cagirabilecegiz.constructor'i generate ile olusturursak o yapi isimize
        //yaramayacak sekilde olabilir.oyle durumlarda manual olusturulmasi gerekiyor.
        adSoyad.put(ad,soyad);
        kardeslerList.addAll(Arrays.asList(kardesler));
        yasKardesler.put(yas,kardeslerList);
        aileMap.put(adSoyad,yasKardesler);

    }

    public Map<Map<String, String>, Map<Integer, List<String>>> getAileMap() {

        return aileMap;
    }
}


