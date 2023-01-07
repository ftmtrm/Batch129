package day04asciiwrapperclassoperatorsmemoryusage;

public class Operators01 {
    public static void main(String[] args) {
        /*
        1) +,-,*,/ islemleri Javada matematikteki gibi kullanilir
        note 1: int/int ==> int olur
        note2: double/int ==> double olur.
        cunku Java'da mat.sel islemler farkli data type'lari kullanilirsa sonuc buyuk data type'inda olur

        2) Javada "logical operatorlar" vardir. AND ve OR islemleri logical operatorlar'dir.
        Cay AND Kahve  Sonuc
        +   &&   -       -
        -   &&   +       -
        -   &&   -       -
        +   &&   +       +

        AND isleminden true alabilmek icin hersey true olmalidir.mukemmeliyetcidir.perfectionist
        AND isleminde tek bir false sonucu false yapar
        AND islemi icin && kullanilir ancak & da kullanilabilir.
        ancak && kullanilirsa ilk ifade false oldugunda digerlerini kontrol etmez bu nedenle daha hizlidir.
        & kullanilirsa ilk ifade ne olursa olsun digerlerini de kontrol eder.bu nedenle daha yavas calisir.
        bu nedenle && kullanilir.


        Cay OR Kahve Sonuc
        +  ||   -     +
        -  ||   +     +
        +  ||   +     +
        -  ||   -     -

        OR isleminde bir tane true sonucu true yapmaya yeter.
        OR isleminde sonucun false olmasi icin hersey false olmalidir
        Or islemi polyanna gibidir.

        NOT Operatoru (!) true olani false, false olani true yapar
        !true = false
        !false = true
        !!true = true

        3) karsilastirma operatorleri (comparison operators):
        (<,>,<=,>=,==,!=)
        note: karsilastirma operatorlerini kullandiginizda kesinlikle boolean alirsiniz


         */

        boolean first = 3<5;
        boolean second = 2+3 != 5;
        boolean third = 2+3*5>=19;

        System.out.println(first+"-"+second+"-"+third);// true - false - false
        System.out.println(first && second);//false
        System.out.println(first || second || third);//true
    }
}
