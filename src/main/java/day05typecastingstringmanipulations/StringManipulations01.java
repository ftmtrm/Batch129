package day05typecastingstringmanipulations;

public class StringManipulations01 {
    //String bir non-primitive data tipidir ve ayni zamanda bir class'dir.

    public static void main(String[] args) {

        String s = "Java is easy";

        //EX 1: "s" String'indeki tum karakterleri buyuk harf yapiniz.

        String sUpper = s.toUpperCase();
        System.out.println(sUpper);

        //ex 2: "s" String'indeki tum karakterleri Kucuk harf yapiniz/
        String sLower = s.toLowerCase();
        System.out.println(sLower);

        //Ex 3: "s" String'indeki ilk karakteri aliniz.
        char firstChar = s.charAt(0);
        System.out.println(firstChar);

        //Ex 4: s stringindeki ikinci ve sondan ikinci karakteri aliniz ve ekrana yanyana yazdiriniz.
        char secondChar = s.charAt(1);
        char lastSecond = s.charAt(10);
        //1.yol:
        System.out.print(secondChar);
        System.out.println(lastSecond);
        //2.yol:
        System.out.println(""+secondChar+lastSecond);

        //Ex5: "s" stringinde kullanilan karakter sayisini bulunuz.
        int sLength = s.length();
        System.out.println(sLength);

        //Ex 6: "s" stringinde kullanilan ilk 4 karakteri aliniz.
        //substring te ilk index dahil yani "0"  ikinci index yani "4" harictir. [0,4)
        String sub1 = s.substring(0,4);//java kelimesi 0123
        System.out.println(sub1);

        //Ex 7: "s" stringindeki is kelimesini aliniz.
        String sub2 = s.substring(5,7);
        System.out.println(sub2);

        //Ex8: "s" stringindeki easy kelimesini aliniz.
        String sub3 = s.substring(8,12);
        System.out.println(sub3);

//bir karakterden baslayip string'in sonuna kadar almak isterseniz ikinci index i yazmayiniz.
        String sub4 = s.substring (8);
        System.out.println(sub4);

        //Ex9: "s" string'inde "money" kelimesinin var olup olmadigini kontrol ediniz.
        boolean isExist = s.contains("money");//Easy yazarsak da false verir. buyuk harfle baslatildigi icin
        System.out.println(isExist);

        /*bir methodu ogrenirken 3seyi ogrenin
        1. bu method ne is yapar?
        2. bu methodun farkli kullanimlari nasildir?
        3. bu method size ne return eder.
         */

        //Ex 10: "s" String'ini belli bir harf ile baslayip baslamadigini kontrol ediniz
        boolean isStart = s.startsWith("Java");
        //JAVA yazarsaniz false verir ""yazarsaniz da true verir.cunku java kelimesinden once bir karakter yok.
        System.out.println(isStart);
        //Ex11: "s" string'inin 6.karakterden itibaren belli bir harfle baslayip baslamadigini kontrol ediniz.

        boolean isBegin = s.startsWith("i",5);//true verir i ile baslar cunku
        // burdaki 5 ilk 5 karakteri gorme demek
        System.out.println(isBegin);


    }







}
