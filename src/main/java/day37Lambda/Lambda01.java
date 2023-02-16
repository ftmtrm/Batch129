package day37Lambda;

import day36Lambda.Universite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(9);
        list.add(13);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(12);
        list.add(15);

        TumCiftSayilarinKupleri(list);
        System.out.println();
        TumElemanlarinTop(list);
        System.out.println();
        ucIleBolunebilenler(list);
        System.out.println();

    }//main

    //Tum cift sayi olan elemanlarin kuplerini ekrana yazdiriniz
    public static void TumCiftSayilarinKupleri(List<Integer> list) {
        list.stream().
                filter(Utilities::ciftMi).map(Utilities::kupu).forEach(Utilities::yazInt);
    }

    //list'deki tum elemanlarin toplamini ekrana yazdiriniz
    public static void TumElemanlarinTop(List<Integer> list) {
        System.out.println(list.stream().
                reduce(Utilities::toplam));
    }

        //list'deki tum tek sayi olan elemanlarin carpimini ekrana yazdiriniz
        public static void TumElemanlarinCrpm(List<Integer> list) {
            System.out.println(list.stream().filter(Utilities::tekMi).
                    reduce(Utilities::carpim));
        }

        //list'deki 3 ile bolunebilen elemanlarin 2 fazlalarinin toplamini ekrana yazdiriniz
        public static void ucIleBolunebilenler(List<Integer> list) {
            System.out.println(list.stream().filter(Utilities::uceBolunebilme).map(t -> t + 2).reduce(Utilities::toplam));

        }
            //list'deki elemanlari ekrana yazdiriniz ama tekrarli olanlari 1 kere yazdiriniz



            }

