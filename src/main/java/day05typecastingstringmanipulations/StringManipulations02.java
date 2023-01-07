package day05typecastingstringmanipulations;

import java.sql.SQLOutput;

public class StringManipulations02 {

    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Ex1: "s" string'inin money ile bitip bitmedigini kontrol ediniz.
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //Ex2: s stringindeki "money" kelimesini "dollar" kelimesine ceviriniz.
        String s1 = s.replace("money", "dollar");
        System.out.println(s1);

        //Ex3: s stringindeki "earn" kelimesini win kelimesine ceviriniz.
        String s2= s.replace("earn","win");
        System.out.println(s2);//Lwin Java win money yazar

        //Ex4: s stringindeki "a" harflerini "*"a ceviriniz.
        String s3 = s.replace("a","*");
        System.out.println(s3);
        //note: replace methodunda coklu karakter ile calisirsaniz mecbur cift tirnak kullanacaksiniz
        //ama tek karakterle calisirsaniz cift veya tek tirnak kullanilabilir.
        //ama ya ikisi de cift tirnak olmalidir ya da ikisi de tek tirnak olmalidir.

        //Ex5: "s" stringindeki "n" harflerini "XXX" a ceviriniz.
        String s4 = s.replace("n","XXX");
        System.out.println(s4);

        //Ex6: "s" stringindeki tum e harflerini siliniz.
        //note: hicbir sey char data tipinde yok
        // bu yuzden replace methodu kullanarak silme islemi yaparsaniz mutlaka cift tirnak kullaniniz
        String s5 = s.replace("e","");
        System.out.println(s5);

        String t = "Ali 13 yasindadir!...";

        //Ex7: "t" stringindeki tum rakamlari "*"a ceviriniz.
        //note: bir grup datayi degistirmek icin replaceall methodu kullanilir.
        //bir grup datayi ifade etmek icin "regularexpressions"(regex) kullaniriz.
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);

        /*
        Meshur Regex'ler:
        1. Tum rakamlar ==> [0-9]
        2. Tum kucuk harfler ==> [a-z]
        3. Tum buyuk harfler ==> [A-Z]
        4. Tum kucuk ve buyuk harfler ==> [a-zA-Z]
        5. Tum harfler ve rakamlar ==> [a-zA-Z0-9]
        6. Tum noktalama isaretleri ==> //p{Punct}
        7. Tum sesli harfler ==> [aeiouAEIOU]
        x,q,w harfleri ==> [xqw]

        8. Kucuk harflerden farkli tum karakterler ==>[^a-z]
        9. Tum harflerden farkli tum karakterler ==> [^a-zA-Z]
        10/ Bosluk disindaki tum karakterler == //S
         */

        //Ex8: "t" stringindeki tum rakamlari ve harfleri "!"e ceviriniz.
        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);

        //Ex9: "t" stringindeki tum sesli harfleri "?"e ceviriniz.
        String t3 = t.replaceAll("[aeiouAEIOU]","?");
        System.out.println(t3);

        //EX10: "t" stringindeki kucuk harfler disindaki tum karakterleri "<>" ceviriniz.
        String t4 = t.replaceAll("[^a-z]","<>");
        System.out.println(t4);

        //Ex11:"t" stringindeki tum harfler disindaki tum karakterleri '+'e ceviriniz.
        String t5 = t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);

        //Ex12: "t" stringindeki bosluklar disindaki tum karakterleri "$"e ceviriniz.
        String t6 = t.replaceAll("[^ ]", "TL");
        System.out.println(t6);

        //EX13: "t" stringindeki sesli harfler disindaki tum karakterleri "&"e ceviriniz.
        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);





    }
}
