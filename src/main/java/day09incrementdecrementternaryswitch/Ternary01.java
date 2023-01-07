package day09incrementdecrementternaryswitch;

public class Ternary01 {
    public static void main(String[] args) {
       //Ex1:
        int a = 10;
        int b = 20;

        int r1 = a<7 ? a++ : b++;
        System.out.println(r1);//20 oldu direk b'yi aldi postincremet yapti ++b olsaydi 21 olurdu
        System.out.println(a);//10
        System.out.println(b);//21 oldu

        int r2 = a<b ? a++:b++;
        System.out.println(r2);//10
        System.out.println(a);//11
        System.out.println(b);//20

        //Ex2: verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //sayi negatifse -1 ile carpilir pozitifse ya da 0 ise birseye gerek yok.
        int c = -4;
        int r3 = c<0 ? -1*c: c;
        System.out.println(r3);
        //Ex3: iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise
        // "farkli isaretli sayilari carpamiyorum" mesaji veren kodu yazdiniz.
        int m = 5;
        int n = 6;
        Object r4 = (m>0 && n>0) ||(m<0 && n<0) ? m*n : "farkli isaretli sayilari carpamiyorum";
        //hem string hem int lazim oldugu icin object kullanilir.
        // diger data tiplerinin hepsinin parenti vardir
        // object kendi Parent i olmayan tek data tipidir.
        //farkli data tiplerini Objectin icinde calistirabiliriz
        // Javada butun non primitive data tiplerinin ortak babasidir
        //farkli data tipleri icin ortak bir variable olusturulmak istendiginde kullanilir.
        //Javada Object Hz.Adem'e benzer
        System.out.println(r4);
        //Ex4: verilen bir sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz
        int p = -629;
        int r = Math.abs(p);
        String r5 = (r>99 && r<1000) ? p + "   3 basamaklidir": p + "   3 basamakli degildir";
        //dinamik yaptik consoledaki yazimi
        System.out.println(r5);

    }


}
