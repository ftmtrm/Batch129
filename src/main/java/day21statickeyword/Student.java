package day21statickeyword;

import java.util.List;

public class Student {
    /*
    1)Static variable veya static methodlar (class member) tum objeler icin ortak elemandir.
    2) Static class member'lar uzerinde yapilan tum degisiklikler tum object'leri etkiler.
    3) Static class member'lar Class'a, non-static class member'lar objectlere monte edilir.
    mesela bir class'ta 100 tane object olusturdugunuzda non-static olanlar 100 kere olusturulur.
    ama static olanlar object sayisindan bagimsiz olarak bir kere olusturulur.
    4) Static class member'lara ulasmak icin object olsturmaya gerek duyulmaz,
    ama non-static calss member'lara ulasmak icin object olusturmak sarttir.
    substring ve lenght non-static'tir.ikisi de objeye baglidir.
    Arrays. yazinca ortaya cikanlari hepsi static'tir.
    List.of statictir.
     */
    public static String stdName = "Tom Hanks";

    public int age = 13;
    //ogrenci isminin ilk harflerini veren methodu olusturunuz.
    public static String getInitials(String name){
        String first = name.substring(0,1);
        String second = name.split(" ")[1].substring(0,1);
        //splitten sonra can'i alioruz cunku [1]'de Can var [0] da Ali var
        return first + second;
    }
    //ogrenci ismindeki sesli harfleri sayan bir method olusturunuz.
    public int countVowels(String name){
        int counter = 0;
        for (int i = 0; i <name.length() ; i++) {
           char ch= name.toLowerCase().charAt(i);
            switch (ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }

        }
        return counter;



    }

    }

