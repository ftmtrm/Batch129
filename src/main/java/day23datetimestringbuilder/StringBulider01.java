package day23datetimestringbuilder;

public class StringBulider01 {
    public static void main(String[] args) {
        /*Java'da String, String Class kullanilarak veya StringBuilder Class kullanilarak olusturulabilir.
        String Class kullanarak olusturdugunuz String'ler immutable'dir(degistirilemez).
        StringBuilder kullanarak olusturdugunuz String'ler ise mutable'dir(degistirilebilir).
        varolan String degistirilmez.update edilmis data yeni bir konteynira koyulur.buna immutable denir
        varolan deger hep ayni kalsin deniliyorsa String kullanilmali
        degisime acik olsun tekrar tekrar konteynirla ugrasmiyim deniliyorsa String Builder kullanilmali.
         */
        //immutable
        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        //String'i degistirdikten sonra ayni string'e atarsaniz Java yine yeni bir konteynir olusturur,
        // degismis degeri bu yeni konteynirin icine koyar ve eski konteyniri gosteren oku yeni konteynira yonlendirir
        //Dolayisiyla eski konteynir adressiz kalir ve garbage collector adressiz olan konteynirlari siler.

        String a = "Money";
        a= a + " More";

        //mutable
        //StringBuilder kullanarak String uretmenin 1.yolu
        StringBuilder sb1 = new StringBuilder("Python");
        //sb.append("!") Python! oldu yeni konteynir olusturmazlar. ayni konteynira degismis hali koyulur.buna mutable denir.
        sb1.append("!").append("?").append(".");
        System.out.println(sb1);//Python!?

        //StringBuilder kullanarak String uretmenin 2.yolu
        StringBuilder sb2 = new StringBuilder();//icini bos birakip sonra append'le eleman eklemek
        System.out.println(sb2.length());//0
        System.out.println(sb2.capacity());//16 tane bos kutuyu otomatik olarak verir.

        //StringBuilder kullandiginizda baslangic kapasitesi 16'dir.
        //kapasite asildirginda varolan kapasitenin iki katinin iki fazlasi kadar varolan kapasiteye ekleme yapilir.

        sb2.append("Java");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16 tane bos kutunun 4'u dolu oldu 12'si bos.

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//lenght 19 vercek
        System.out.println(sb2.capacity());//34 verdi 16 kutu daha eklicek.2 tane de ekstra veriyor.16*16+2

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//34*2+2=70

        //StringBulider kullanarak String uretmenin 3.yolu
        StringBuilder sb3 = new StringBuilder(2);
        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6

        sb3.insert(2,"xxxxxx");//bastaki iki karakteri gorme sonra x'leri koy dedik//lenght 9 olur.
        System.out.println(sb3);//Flxxxxxxo oldu araya insert etmis olduk

        sb3.toString();//bu method StringBuilder'i Stringe cevirmek icin kullanilir.String classtaki bazi methodlar(split gibi)
        // SB de yoktur bu nedenle bazen toString methodu kullanarak cevirmek gerekebilir.

        sb3.toString().split("l");

        StringBuilder sb4 = new StringBuilder(sb3);//Stringi tekrar StringBuilder'a cevirdik
        sb3.reverse(); //varolan Stringi tersine cevirir.//oxxxxxxlF
        System.out.println(sb3);

        sb3.deleteCharAt(1);//verilen indexteki karakteri siler
        System.out.println(sb3);

        sb3.delete(1,6);
        //butun x'leri silcek index 1'deki karakterden index 5'e kadar tum karakterleri siler.6 dahil olmadigi icin 5 yazdik
        System.out.println(sb3);

        StringBuilder sb5 = new StringBuilder("Java");
        StringBuilder sb6 = new StringBuilder("Java");

        System.out.println(sb5.compareTo(sb6)); //alfabetik olarak karsilastirir.
        //sb5 alfabetik sirada onceyse sonuc negatif olur sonra ise sonuc pozitif olur.
        // ikisi de ayni oldugu icin 0 verir.Kava yaparsak -1 verir.ilki ikincisinden 1 geri demek
        //Lava yaparsak +2 verir //Hava yaparsak -2 yapar.
        // ascii deger kullanilir java yazarsak kucuk j ile buyuk J arasindaki fark olan 32'yi verir.
        //kava ile Jbva yazsak yine -1 verir. zaten k ile j ayni olmadigi icin 2.karaktere bakmaz.

        sb6.setCharAt(2, 'm');//istenilen indexi istenilen karakterle degistirir.
        System.out.println(sb6);//Jama oldu
        sb6.replace(1,3,"xyz");
        System.out.println(sb6);//index 2nin yerine xyz koydu Jxyza oldu.

        //substring methodu String'in methodudur.
        // StringBuilder Class'ta kullanmamiza izin verilen bazi String Class methodlari vardir.(substring)
        //bu methodlari SB ustunde kullaninca String Builder'in orjinal degeri degismez.

        String s7 = sb6.substring(1,3);
        System.out.println(s7);//xy verir.
        System.out.println(sb6);//Jxyza kaldi
    }
}
