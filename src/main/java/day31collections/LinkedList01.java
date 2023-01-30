package day31collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {
        /*
 1) Arraylistler eleman silme ve eleman ekleme konusunda basarisizdirlar.o yuzden eleman silme ve ekleme islem
  leri coklukla yapilacaksa Arraylist kullanmak tavsiye edilmez. bu durumlarda LinkedList kullanilir.
  LinkedList index kullanmadığı için eleman ekleme ve çıkarma işlemini oldukça kolay yapar.(foto cektim)
 2) LinkedList'ler yapilari dolayisiyla index kullanmadiklarindan eleman silmede ve eklemede re-index yapilmasi
  na gerek yoktur. bu da LinkedList'leri eleman eklemede ve silmede cok basarili hale getirir.
  bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken durumlarda LinkedList kullanmak tavsiye edilir.
 3) Arraylist'lerde search islemi kolay yapilir cunku indexler adres gibidir.
  LinkedList'lerde ise search islemini yapmak zordur. cunku index kullanmaz index olmayinca herhangi bir elemani
   bulmak icin en bastan butun elemanlar kontrol edilir bu da cok fazla is demektir.
         */
    LinkedList<String> names = new LinkedList<>();//List<String> cityNames = new LinkedList<>(); boyle de olur.
    names.add("Steve");//add methodu ortak hem array de hem linked listte var demekki parent olan List'ten
        //override yapilip aliniyor
    names.add("Ajda");
    names.add("Raj");
    names.add("Megan");
    names.add("Brandon");
        System.out.println(names);

    names.addFirst("Cuneyt");//en basa bunu koyar ustteki listin
    names.addLast("Ajda");//en sona bunu koyar
        System.out.println(names);
    names.add(3,"Suleyman");//arkada index kullanmiyor aslinda 3.node'dan sonraya Suleyman'i ekliyor.
        //names.add(int index, String element) yazani secince bunu yapti.
    //names.clear();//butun elemanlari siliyor.
    names.remove("Ajda");//2 Ajda olunca sadece ilk gorunumu (Ajda'yi) siler.Arka planda loop kullaniyor.
        System.out.println(names);
    names.remove(4);//4.node'u siler.
    names.add("Suleyman");
    names.add("Suleyman");
    String r1 = names.remove();//ilk elemani siler//removeFirst de aynisini yapar.
        // okunurluk acisindan konulmustur(cut-paste)
        System.out.println(r1);//sildigi ilk elemani geri getirir.
        System.out.println(names);//[Steve,Suleyman,Raj,Brandon,Ajda,Suleyman]
    names.removeFirstOccurrence("Suleyman");//Suleymanin ilk gorunumunu siler.remove (object) olanla aynidir.
    names.removeLastOccurrence("Suleyman");//Suleymanin son gorunumunu siler.
    names.getFirst();//ilk elemani alir
    names.getLast();//son elemani alir
    String r2 = names.peek();//copy paste islemi gibi//peekFirst de ayni
    System.out.println(r2);//Steve
        System.out.println(names);
        names.poll();//cut paste yapar
    //remove() bos LinkedList'te kullanilirsa hata hata verir poll bos LinkedList'te kullanilirsa null verir.
        names.pop();




    }

}
