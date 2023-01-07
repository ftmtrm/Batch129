package day05typecastingstringmanipulations;

public class Typecasting01 {

        /*
        Numeric primitive data tiplerinin birbirine donusturulmesine "type casting" denir.
        numeric (sayisal) data types: byte, short, int, long, float, double

        note 1: Kucuk data tiplerini buyuk data tiplerine cevirmeyi Java otomatik olarak yapabilir.
        bu isleme Autowidening (Otomatik Genisletme)  denir.

        note 2: Buyuk data typelarini kucuk data typelarina cevirmek riskli bir istir.
        Java bu riskli isi otomatik olarak yapmaz bu islemi kod yazanlar yapar.
        bu isleme "Explicit Narrowing (Aciktan Daraltma)" denir.
               */

    public static void main(String[] args) {

        //byte data tipini int data tipine ceviriniz.
        byte age = 13;
        int ageInt =age;//AutoWidening

        //long data tipini short data tipine ceviriniz.
        long weight = 234;
        short weightShort = (short) weight;//Explicit Narrowing

        //int data tipini float data tipine ceviriniz.
        int population = 700000;
        System.out.println(population);
        float populationFloat = population;//AW
        System.out.println(populationFloat);

        //double data tipini short data tipine ceviriniz.
        double number = 12.234;
        System.out.println(number);
        short numberShort = (short)number;
        System.out.println(numberShort);//12 olarak yazar

        //DIKKAT
        //donusum yaptigini sayi (260) donuseceginiz data tipinin sinirlari disindaysa
        // Java kullandiginiz sayi ile mod islemi yapar.ve bu sonucu yazar.
        //ex 1:
        short num= 260;
        System.out.println(num);
        byte numByte = (byte)num;
        System.out.println(numByte);//4 yazar cunku 260/256 (-128 ile 127 arasinda 256 tane sayi var.
        // bolumunden kalan 4'tur. yani yanlistir.

        //ex 2:
        short n =1023;
        System.out.println(n);//1023 verir
        byte nByte = (byte)n;
        System.out.println(nByte);//-1 verdi
        // (1023/256 ya bolunce bolum 4 olur kalan -1'dir.yani sayiyi 1024 olarak alir.






    }
}
