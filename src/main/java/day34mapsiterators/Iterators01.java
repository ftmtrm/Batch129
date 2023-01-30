package day34mapsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    /*Iterators Loop'ların yaptığı işi yapar.
    Iteratorslar tıpkı loop'ta olduğu gibi elemanı alarak işleme sokar.
    Javanın Iterators'ları ortaya çıkarma sebebi infinite Loop riskini bitirmektir.
    Iterator'larda sonsuz loop yoktur.
    Iterator'lar Java tarafından sonradan oluşturulmuşlardır.
    Loop'ların yaptıkları bütün işlemleri yapabilirler.
    Looplar ile Iterator'larin performans farki yoktur ama Iterator'lar eleman silme ve update etmede daha basarilidirlar.
    Iki tip Iterator vardir:
    i)Iterator: Sadece elemanlari remove edebilirsiniz.
                Sadece soldan saga calisir, yani tek yonludur.
    ii)ListIterator: Eleman "remove" , "update" ve "add" yapabilirsiniz.
                     Hem soldan saga hem de sagdan sola calisabilir, yani cift yonludur.
    */

    public static void main(String[] args) {
        //Iterator
        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");

        Iterator<String> itr1 = list1.iterator();//list'i iterator'a donusturur.
        //(| pointer koyar her birinin onune)[Ali,Can,Aliye]
        while (itr1.hasNext()) {//sonrasinda var mi diye bakiyor.true ise asagidaki next methodunda Ali'yi verir.

            itr1.next();//Ali'yi verdi.sonraki dongude Can'i verdi.pointer Aliye'nin onune geldi.son dongude Aliye'yi verdi

            itr1.remove();//next() methodunun verdigi elemani (Ali)sildi.sonraki dongude Can'i sildi.son dongude Aliye'yi sildi.
            //son donguden sonra while'in condition'i false oldugu icin loop kirildi.
        }
        System.out.println(list1);
        //ListIterator
        //EX1:
        List<String> list2 = new ArrayList<>();
        list2.add("Ali");
        list2.add("Can");
        list2.add("Aliye");
        System.out.println(list2);

        ListIterator<String> listItr = list2.listIterator();
        while (listItr.hasNext()) {

            String el = listItr.next();
            listItr.set(el + "!");
        }
        System.out.println(list2);
        //EX2:
        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);
        ListIterator<String> listItr2 = list3.listIterator();
        //Asagidaki loop pointer'i en saga almak icin yazildi.
        while(listItr2.hasNext()){//burasi ve asagidaki kisim tamamlandiginda pointer en sonda
            listItr2.next();
        }
        //Asagidaki loop elemanlari en sondan en basa dogru yazdirmak icin kullanildi.
        while(listItr2.hasPrevious()){
            String el =listItr2.previous();
            System.out.println(el+ "<==");//Aliye Can Ali

        }
    }
}