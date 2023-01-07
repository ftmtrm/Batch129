package day04memorykullanimiwrapperclassascii;

public class c03_MantikOperatorleri {
    /* javada 3lü karşılaştırma yapamıyor.java bunu ikili yapabilir.
    bunu da mantık operatörü sayesinde yapabilir.
    == matematikteki eşittir işareti Javada budur.
    ikili karşılaştırma yapıp Mantık operatörleri ile birleştirmeliyiz

    && == ve and operatörü true almak için bütün verilerin doğru olması gerekir.mükemmeliyetçi
    Cay ve Limon
     +  && + = True alır
     +  && - = false alır
     -  && + = false alır
     -  && - = false alır

     && ile & arasındaki fark: ikilide kodun tamamını çalıştırmadan ilk false'u bulunca hemen durdurur.
     tek & de ise tüm kodu tarar bulsa da bulmasa da sonra durur.
     bu da &&'nin &'den daha hızlı çalışmasını sağlar.


    || veya or operatörü: polyannacıdır, en ufak bir pozitiflikte true döner.
    Cay veya Limon
     +   ||   +   = true döner
     +   ||   -   = true
     -   ||   +   = true
     -   ||   -   = false

     */
    public static void main(String[] args) {

        System.out.println(5+2==8);//false
        boolean sonuc1 = 5>4 && 7<9 && 6+3==9 && 5+2 !=8;
        System.out.println(sonuc1);//true

        boolean sonuc2 = 5>4 && 7>9 && 6+3==9 && 5+2 ==7;
        System.out.println(sonuc2);//false

        int sayi1= 15;
        System.out.println(10<sayi1 && sayi1 <20);//true

        int sayi2 = 5;
        System.out.println(sayi2<10 || sayi2>20);//true

    }
}
