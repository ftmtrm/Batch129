package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int a = 12;//Bu yapinin icinde sadece bir tane data depolanabilir.
        //ama biz kod yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz.
        //bu depolayabilme icin Java "Array" yapisini olusturmustur.

        //Array nasil olusturulur?
        // Array olusturmak icin Array elemanlarinin data tipi ve eleman sayisi mutlaka yazilmalidir
        // sadece bir data tipi kabul eder.
        String stdNames [] = new String[5];//[null,null,null,null,null]

        //Array console'a nasil yazdirilir?
        //to string methodunu kullanmadan sadece Array ismi ile yazdirirsaniz Java o Array'in adresini yazdirir
        System.out.println(Arrays.toString(stdNames));

        //Array'e eleman ekleme nasil yapilir?
        //indexle eleman alir.
        stdNames[0]= "Cuneyt";
        stdNames[1]= "Kemal";
        stdNames[2]= "Ajda";
        stdNames[3]= "Ezel";
        stdNames[4]= "Besir";
        System.out.println(Arrays.toString(stdNames));

        //Array'den specific bir eleman almak
        System.out.println(stdNames[2]);
        //ex1: Array'deki her elemani sonuna kadar "!" isareti koyarak ekrana yazdiriniz.
        for (int i = 0; i < stdNames.length; i++) {
            System.out.println(stdNames[i] + "!");

        }

    }
}
