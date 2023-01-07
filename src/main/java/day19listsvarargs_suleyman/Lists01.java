package day19listsvarargs_suleyman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {
    public static void main(String[] args) {
        //INTERVIEW Question
        //verilen bir listteki elemanlari tekrarsiz olarak yazdiriniz.
        //[2,3,2,2,5] ==> [2,3,5] olcak

        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);

        List<Integer> newList = new ArrayList<>();
        for(Integer w: myList){
            if(!newList.contains(w)){
                newList.add(w);
            }
        }
        System.out.println(newList);
        //Ex2: Musteriden urun ismini aliniz.Musterinin ismini verdigi urun listede varsa urunun ismini yazdiriniz
        //listede yoksa "out of stock" yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Urun arama sistemimize hosgeldiniz");
        System.out.println("Urun aramayi sonlandirmak icin Q'ya basiniz");
        List<String> products = new ArrayList<>();
        products.add("TV");
        products.add("Radio");
        products.add("ipad");
        products.add("PC");
        products.add("Notebook");
        products.add("Mobile Phone");

        /*
        for loop kurunuz product listindeki herbir elemanin
        tum karakterlerini set method kullanarak kucuk harfe ceviriniz
         */

        do {
            System.out.println("Aradiginiz urunun ismini giriniz");

            String p = input.nextLine();

        if(p.equalsIgnoreCase("Q")){
            break;

        }else if(products.contains(p)){
                System.out.println((p + " is in stock"));
        }else
                System.out.println(p + " is out of stock");

        }while(true);//Q'ya basinca zaten cikacagi icin sonsuz loop yapiyoruz.
        System.out.println("Sitemizi kullandiginiz icin tesekkur eder tekrar bekleriz.");
    }
}
