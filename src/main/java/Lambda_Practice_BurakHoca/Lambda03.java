package Lambda_Practice_BurakHoca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda03 {
    public static void main(String[] args) {
        Lambda03_PojoApartman da01 = new Lambda03_PojoApartman("dogu", 1, 7000);
        Lambda03_PojoApartman da02 = new Lambda03_PojoApartman("bati", 2, 10000);
        Lambda03_PojoApartman da03 = new Lambda03_PojoApartman("guney", 3, 12000);
        Lambda03_PojoApartman da04 = new Lambda03_PojoApartman("dogu", 5, 15000);

        List<Lambda03_PojoApartman> daireler = new ArrayList<>(Arrays.asList(da01, da02, da03, da04));
        System.out.println(tumDaireKira5000denBuyuk(daireler));
        System.out.println("\n ***********");
        System.out.println(EnAzBirininKatSayisi2(daireler));
        System.out.println("\n ***********");
        System.out.println(CephesiDoguOlanlarinSayisi(daireler));
        System.out.println("\n ***********");
        System.out.println(katkayisinaGoreBuyKucSir(daireler));
        System.out.println("\n ***********");
        System.out.println(katkayisi2denFazlaDaireBuyKucSir(daireler));
        System.out.println("\n ***********");
        katkayisi2denFazlaDaireBuyKucSir2(daireler);
        System.out.println("\n ***********");
        System.out.println(katkayisi3denAzDaireKucBuySir(daireler));
        System.out.println("\n ***********");

    }

    //1) Tüm dairelerin kira'ları 5000'den buyuk ise return ederek True yazdırın
    public static boolean tumDaireKira5000denBuyuk(List<Lambda03_PojoApartman> daireler) {
        Boolean sonuc = daireler.stream().allMatch(t -> t.getKira() > 5000);//allmatch terminal methoddur.
        return sonuc;
    }

    //2) Dairelerden En Az Birinin katSayisi 2 ise return ederek True yazdırın
    public static boolean EnAzBirininKatSayisi2(List<Lambda03_PojoApartman> daireler) {
        Boolean sonuc = daireler.stream().anyMatch(t -> t.getKatSayi() == 2);
        return sonuc;
    }

    //3)  Dairelerden cephesi 'dogu' olanların, sayısını return ederek yazdırınız.
    public static long CephesiDoguOlanlarinSayisi(List<Lambda03_PojoApartman> daireler) {
       long sonuc= daireler.stream().filter(t -> t.getCephe().contains("dogu")).count();
        return sonuc;
    }
    //4) Daireleri, katSayisina göre buyukten kucuge sıralayınız.List halinde return ederek yazdırınız.
    public static  List<Lambda03_PojoApartman> katkayisinaGoreBuyKucSir(List<Lambda03_PojoApartman> daireler) {
        List<Lambda03_PojoApartman> sonuc = daireler.stream().
                sorted(Comparator.comparing(Lambda03_PojoApartman::getKatSayi).reversed()).
                collect(Collectors.toList());
       return  sonuc;
    }
    //5) katSayisi 2'den fazla olan daireleri, kiraya gore buyukten kucuge sıralayınız
    //    en buyuk kira'sını list halinde return ederek yazdırınız.
    public static  List<Integer> katkayisi2denFazlaDaireBuyKucSir(List<Lambda03_PojoApartman> daireler) {
        List<Integer> sonuc = daireler.stream().filter(t -> t.getKatSayi() > 2).
                sorted(Comparator.comparing(Lambda03_PojoApartman::getKira).reversed()).
                limit(1).map(t -> t.getKira()).
                collect(Collectors.toList());
        return sonuc;
    }
    //5)  katSayisi 2'den fazla olan daireleri, kiraya gore buyukten kucuge sıralayınız
    //    en buyuk kira'sını list halinde return ederek yazdırınız.(2.yol)
    public static  void katkayisi2denFazlaDaireBuyKucSir2(List<Lambda03_PojoApartman> daireler) {
        Stream<Integer> sonuc = daireler.stream().filter(t -> t.getKatSayi() > 2).
                sorted(Comparator.comparing(Lambda03_PojoApartman::getKira).reversed()).
                limit(1).map(t -> t.getKira());
        System.out.println(Arrays.asList(sonuc.toArray()));
    }
    //6) katSayisi 3'den az olan daireleri, kiraya gore kucukten buyuge sıralayınız
    //    en kucuk kira'sini list halinde return ederek yazdırınız.
    public static  List<Integer> katkayisi3denAzDaireKucBuySir(List<Lambda03_PojoApartman> daireler) {
        List<Integer> sonuc = daireler.stream().filter(t -> t.getKatSayi() < 3).
                sorted(Comparator.comparing(Lambda03_PojoApartman::getKira)).
                limit(1).map(t -> t.getKira()).
                collect(Collectors.toList());
        return sonuc;
    }
}