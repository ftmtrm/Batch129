package day04asciiwrapperclassoperatorsmemoryusage;

public class WrapperClass {
    public static void main(String[] args) {
int n = 12;

//"n" yazip nokta koyarsaniz hic method goremezsiniz cunku primitiveler method icermez.
// wrapper classlar non-primitivedir bu nedenle memory de cok yer kaplarlar.
// o yuzden sart degilse wrapper class kullanmayi tercih etmeyiz.

Integer m = 12;//"m" yazip nokta koyarsaniz bircok method gorursunuz cunku wrapper classlar method icerir.

        byte p = 23;
        Byte r = 43;

        //ex1: short data tipinin min ve max degerlerini kod yazarak bulunuz.
        short max = Short.MAX_VALUE;
        System.out.println(max);

        short min = Short.MIN_VALUE;
        System.out.println(min);

        //ex2: int data tipinin min degeri ile byte data tipinin max degerinin toplamini bulunuz.

        int intMin =Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;

        System.out.println(intMin+byteMax);

        //ex3: - primitive int`i wrapper integer`a ceviriniz. autoboxing

        int num = 22;
        Integer wrappernum = num;
        System.out.println(wrappernum);

        // - wrapper byte`i primitive byte`a cevirelim.unboxing

        Byte k = 43;
        byte primitivek = k;

        System.out.println(primitivek);

        //ex4: primitive char`i wrapper class`a ceviriniz.
        //wrapper boolean`i primitive boolean`a ceviriniz.

        char initial = 'T';
        Character initialWrapper = initial;
        System.out.println(initialWrapper);

        Boolean isOld = true;
        boolean isOldWrapper = isOld;
        System.out.println(isOldWrapper);

        //ex5: string olarak verilen iki fiyatin toplamini ekrana yazdiriniz
        String shirt = "2300";
        String shoes = "5200";

        System.out.println(shirt+shoes);//23005200 verir.
        //Javada + sembolu iki sayi arasinda kullanilirsa toplama islemi olur.
        //javada + sembolu iki string arasinda veya bir string ve bir sayi arasinda kullanilirsa
        // concatenation islemi olur. Java burada mat.teki islem onceligi kurallarini kullanir.
        //once uslu sayilar sonra parantez ici yapilir sonra carpma bolme yapilir
        // en son toplama cikarma yapilir

        //"A"+7 = "A7" olur
        //8+3+"K" = "11K"
        //"J"+5+12 = "J512"
        //"K"+3*5 = "K15"

        int toplamFiyat = Integer.valueOf(shirt)+ Integer.valueOf(shoes);
        System.out.println(toplamFiyat);//7500
//ex:6 size String olarak verilen iki fiyatin toplamini ekrana yazdiriniz.
String tv = "$11000";
String radio = "$3000";

 int totalprice = Integer.valueOf(tv)+ Integer.valueOf(radio);
 //burda $ isareti oldugu icin toplamayi yapamaz.
        // valueOf methodu rakam olan stringlerde kullanilir digerlerinde hata verir.
        // hata duzeltme sonra ogrenilecek


        System.out.println(totalprice);

    }
}
