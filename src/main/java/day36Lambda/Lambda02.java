package day36Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {
        Universite u1 = new Universite("hacettepe", "fizik", 1200, 88);
        Universite u2 = new Universite("bogazici", "QA", 1000, 90);
        Universite u3 = new Universite("ODTU", "Dev", 900, 95);
        Universite u4 = new Universite("Marmara", "matematik", 3000, 82);
        Universite u5 = new Universite("Ege", "elektrik-elektronik", 2000, 83);

        List<Universite> unv = new ArrayList<>(Arrays.asList(u1, u2, u3, u4, u5));
        System.out.println(notOrt75tenByk(unv));
        System.out.println();
        matBlmVarMi(unv);
        System.out.println();
        System.out.println(ogrnciSylarBykKck(unv));
        System.out.println();
        System.out.println(mtmtkBlmSys(unv));
        System.out.println(ogrnciSysBesyuzEllidenFzl(unv));
        System.out.println();
        System.out.println(ogrnciSysBinEllidenAz(unv));


    }
        //Task 01: butun universitlerin not ortalamasinin 75'ten buyuk oldugunu gosteren bir program olusturunuz.
        public static boolean notOrt75tenByk(List<Universite>unv) {
            return unv.
                    stream().
                    allMatch(t -> t.getNotOrtalamasi() > 75);//bir tanesi bile 75'in altindaysa false veriyor.
        }
    //Task 02: butun universitelerin herhangi birinde matematik bolumu olup olmadigini gosteren bir program olusturunuz.
    public static boolean matBlmVarMi(List<Universite>unv) {
        return unv.
                stream().
                anyMatch(t -> t.getBolum().equalsIgnoreCase("matematik"));//t.getBolum().contains de oluyor.
    }
//Task 03: Universiteleri ogrenci sayilarina gore buyukten kucuge siralayan  bir program olusturunuz.
        public static List<Universite> ogrnciSylarBykKck(List<Universite>unv) {
            return unv.stream().
                    sorted(Comparator.comparing(Universite::getOgrenciSayisi).reversed()).collect(Collectors.toList());

        }

//Task 04-->"matematik" bolumlerinin sayisini  print ediniz.
    public static int mtmtkBlmSys(List<Universite>unv) {
        return (int) unv.stream().
              filter(t -> t.getBolum().equalsIgnoreCase("matematik")).count();
//count: sayma islemi yapar.
    }

//Task 05-->Ogrenci sayilari 550'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.

    public static OptionalInt ogrnciSysBesyuzEllidenFzl(List<Universite>unv) {//max method icin optional int kullandik
        return unv.stream().
                filter(t -> t.getOgrenciSayisi() > 550).
                mapToInt(t -> t.getNotOrtalamasi()).max();//mapToInt ile degeri guncelledik
        // max() methodundan null gelme ihtimali wrapper classlarda var.OptionalInt return etmeni ister
    }

//Task 06-->Ogrenci sayilari 1050'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
        public static OptionalInt ogrnciSysBinEllidenAz(List<Universite>unv) {//min method icin optional int kullandik
            return unv.stream().
                    filter(t->t.getOgrenciSayisi()<1050).
                    mapToInt(t -> t.getNotOrtalamasi()).min();


}

}