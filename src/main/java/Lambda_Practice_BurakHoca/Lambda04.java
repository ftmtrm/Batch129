package Lambda_Practice_BurakHoca;

import java.util.stream.IntStream;

public class Lambda04 {
    public static void main(String[] args) {
        System.out.println(birdenXeKadarTop(10));
        System.out.println("\n***********");
        System.out.println(birdenXeKadarTekTop(13));
        System.out.println("\n***********");
        System.out.println(birdensonsuzaKadarTekSayiIlkxTop(3));
        System.out.println("\n***********");
        System.out.println(ikidensonsuzaKadarCiftSayiIlkxTop(16));
        System.out.println("\n***********");
        System.out.println(BestensonsuzaKadarIlkxKuvvetTop(4));
        System.out.println("\n***********");
        System.out.println(faktoriyel(5));

    }

    //1) 1'den x'e kadar int degerleri akısa alınız(x dahil olacak),
    // toplamını bulup return ederek yazdırınız.
    public static int birdenXeKadarTop(int x) {
        int sonuc = IntStream.range(1, x + 1).sum();
        return sonuc;
    }

    //2) 1'den x'e kadar int degerleri akısa alınız(x dahil olacak),
    //  tek sayıların, toplamını bulup return ederek yazdırınız. (x dahil olacak)
    public static int birdenXeKadarTekTop(int x) {
        int sonuc = IntStream.rangeClosed(1, x).filter(t -> t % 2 != 0).sum();
        return sonuc;
    }

    //3) 1'den sonsuza kadar giden Tek sayılardan,
    //    ilk x tanesini toplayınız sonucu return ederek yazdırınız
    public static int birdensonsuzaKadarTekSayiIlkxTop(int x) {
        int sonuc = IntStream.iterate(1, t -> t + 2).limit(x).sum();
        return sonuc;
    }

    //4) 2'den sonsuza kadar giden Çift sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız
    public static int ikidensonsuzaKadarCiftSayiIlkxTop(int x) {
        int sonuc = IntStream.iterate(2, t -> t + 2).limit(x).sum();
        return sonuc;
    }

    //5)  5'den sonsuza kadar giden kuvvetlerinden
    //    ilk x kuvvetinin toplamını return ederek yazdırınız
    public static int BestensonsuzaKadarIlkxKuvvetTop(int x) {
        int sonuc = IntStream.iterate(5, t -> t * 5).limit(x).sum();
        return sonuc;
    }

    //6) x sayisinin faktoriyelini bulunuz.
    public static int faktoriyel(int x) {
        int sonuc = IntStream.rangeClosed(1, x).reduce(1, (a, b) -> a * b);
        return sonuc;
    }
}