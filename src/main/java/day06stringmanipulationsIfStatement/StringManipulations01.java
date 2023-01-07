package day06stringmanipulationsIfStatement;

public class StringManipulations01 {
    public static void main(String[] args) {
        //EX1: Bir String'in bas ve sonunda bosluk karakteri varsa siliniz.
        //    "   Ali Can   " ==> "Ali Can" yapmaliyiz

        String s = "  Ali Can  ";
        String sTrimmed = s.trim();
        //trim methodu bir String'in bas ve sonundaki bosluklari siler aradakilere dokunmaz
        System.out.println(s);
        System.out.println(sTrimmed);

        //Ex2: Asagida fiyatlari verilen urunlerin toplam fiyatlarini bulunuz.
        // String tv = "$456.99"; String laptop = $875.99; ==>456.99+875.99 toplamak amacimiz
        String tv1 = "$456.99";
        String laptop1 = "$875.99";
        String tv2= tv1.replace("$","");
        System.out.println(tv2);//456.99 ==>ondalik sayilar Javada otomatik olarak double kabul edilir.

        String laptop2 = laptop1.replace("$","");
        System.out.println(laptop2);//875.99

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);//1332.98

        //EX3: Verilen ismin ilk isminin ilk harfini ve soyisminin ilk harfini ekrana yazdiriniz.
        String name = "   ali cAN  ";
        //ilk once ismi duzeltcez 1.ve 2.adimlarla
        // 1. trim kullanilcak bundan sonra isim "ali cAN" oldu
        // 2. toUpperCase kullanilcak bundan sonra isim "ALI CAN" oldu
        // 3. charAt(0) kullanarak A yi alcaz.
        // 4. trim + toUpperCase + split (ile spaceden kesip CAN bolumunu almak icin [1] yazcaz + charAt(0) yapip C yi alcaz.

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);//A'yi aldik.
        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second);//split yapip C'yi aldik
        System.out.println(""+first+second);//AC

        //Ex4: Bir String'in hic karakter icermedigini(bos String) kontrol eden kodu yaziniz
        String str = "";
        //1.yol: lenght() kullan
        boolean result1 = str.length()==0;
        System.out.println("String bos mu?"+result1);
        //2.yol:
        boolean result2 = str.isEmpty();
        //2.yol java bir konuda method uretmisse o methodu kullanmak en iyisidir.
        // isEmpty'i Java urettigi icin  bunu kullanmak daha mantiklidir,
        // hem de 1.yolda javaya iki is yaptirilmis oluyor, o nedenle 2.yol secilir.
        System.out.println("String bos mu?" +result2);

        //Ex5: Bir String'in bosluk haric hicbir karakter icermedigini kontrol eden kodu yaziniz
        String t = "      ";
        //1.yol:
        boolean result3 = t.replace(" ","").length()==0;
        System.out.println("Sadece space mi var?"+ result3);
        //2.yol:
        boolean result4 = t.replace(" ","").isEmpty();
        System.out.println("Sadece space mi var?"+ result4);
        //3.yol:
        boolean result5 = t.isBlank();
        System.out.println(result5);
        //isBlank methodu sadece space iceren stringler icin true verir.
        // space disinda bir karakter icerirse false verir.
        // bu method bos Stringler icin de true verir
        //is Blank ()==> space+hicbirsey icin true verir.
        //isEmpty () ==> sadece hicbirsey icin true verir

        //Ex6: Bir Stringte a, e, i karakterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //"Java is easy to learn" ==> a'ninki 1; i'ninki 5; e'ninki 8 olcak sonuc=14 almaliyiz.
        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');//1 vermeli
        System.out.println(idxA);
        int idxI = r.indexOf('i');//5 vermeli
        System.out.println(idxI);
        int idxE = r.indexOf('e');//8 vermeli
        System.out.println(idxE);
        System.out.println("Indexler toplami" + (idxA+idxI+idxE));//14 verdi

        //Ex7: Bir String'te Java kelimesinin ilk olarak kacinci indexte kullanildigini gosteren kodu yaziniz.
        //"Ah Java vah Java sensiz olmuyor Java."//3.indexte

        String u = "Ah Java vah Java sensiz olmuyor Java.";
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);
        //indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J'nin) indexini almis olursunuz
        //indexOf () methodu olmayan karakterler icin kullanilirsa her zaman "-1" verir.
        int idxofXyz = u.indexOf("xyz");
        System.out.println(idxofXyz);//-1 verir/

        //Ex8: Bir Stringte a, e, i karakterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //        //"Java is easy to learn" ==> a 18'i, i 5'i, e 17'yi vercek toplam 40 olcak.
        String v = "Java is easy to learn";
        int idxofA = v.lastIndexOf('a');//18 vercek
        System.out.println(idxofA);
        int idxofI = v.lastIndexOf('i');//5 vercek
        System.out.println(idxofI);
        int idxofE = v.lastIndexOf('e');//17 vercek
        System.out.println(idxofE);

        System.out.println(idxofA+idxofE+idxofI);
        //lastindexOf () methodu olmayan karakterler icin kullanilirsa her zaman "-1" verir.

        //Ex9: Bir Stringteki tekrarsiz karakterleri ekrana yazdiriniz.
        //abbccdc==>ad vermeli
        String y = "aac";//******kisa yol ogrenilcek
        char ch1 = y.charAt(0);//a yi vercek
        if(y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);//ama tekrar oldugu icin a yi yazmaz

        }
        char ch2 = y.charAt(1);//a yi vercek
        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);//ama tekrar oldugu icin a'yi yazmaz
        }
        char ch3 = y.charAt(2);//c yi vercek
        if(y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);//tekrar olmadigi icin c yi yazar.
        }

        //Note: bazi kodlarin bazi sartlara bagli olarak calismasi gerekir.banka hesabinin kullanici adiyla calismasi gibi
        //bazi kodlari bazi sartlara gore aktive etmek icin "if statement" kullanilir.
        // "if you study hard, you will learn Java." sart true sonuc true' sart false sonuc false

        //Ex10:Sayi pozitif ise ekrana pozitif yazdir.
        int num =12;
        if(num>0){
            System.out.println("Pozitif");
        }
        //Ex11: sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdirin
        int number = 3;
        if(number>-1 && number<10){
            System.out.println("Rakam");
        }
        //Ex12: sayi 3 basamakli ise ekrana "Wooow!" yazdirin.
        int n = 456;
        n = Math.abs(n);//mutlak deger alir//negatif olan 3 basamaklilari da almasi icin.
        if(n>99 && n<1000){
            System.out.println("Wooow!");

        }

    }


}
