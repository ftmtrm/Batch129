package day32collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

    /*Queue'larda ilk gelen ilk isleme girer.(First in First Out ==> FIFO)
    Bazen de son gelen ilk isleme girer.(Last in Last Out ==> LIFO)
    "Deque" ==> Double Ended Queue (Iki uclu kuyruk)==> Ikisini de kullanir.(Hem FIFO hem de LIFO kullanir)
    "Queue" bir Interface'dir bu yuzden constructor'i yoktur.Dolayisiyla object olustururken
    new keyword'unden sonra kullanilamaz.New keyword'unden sonra data tipi Queue olan bir object olusturmak
    icin new keyword'unden sonra Linkedlist veya PriorityQueue Class'lari kullanilabilir.
    "Queue" olustururken constructor olarak priority "Queue" kullanirsaniz elemanlari kendi belirleyecginiz
    siraya gore siralama hakkiniz olur.
    */
    public static void main(String[] args) {

        Queue <String>myQueue = new LinkedList();
        myQueue.add("Milk");
        myQueue.add("Butter");
        myQueue.add("Jam");
        myQueue.add("Egg");
        myQueue.add("Luxury water");
        System.out.println(myQueue);//[Milk, Butter, Jam, Egg, Luxury water]
        // linkedlist kullandigimiz icin insertion order'a gore siraladi.

        myQueue.poll();//cut paste yapar ilk elemani siler sonra verir.Queue bos ise null verir.
        myQueue.element();//copy paste yapar ilk elemani silmeden verir.Queue bos ise exception atar
        myQueue.peek();//copy paste yapar ilk elemani silmeden verir.Queue bos ise null verir.
        myQueue.remove();//cut paste ilk elemani siler.Queue bos ise exception atar.

        boolean r = myQueue.offer("Avocado");//Qeueu'ya eleman eklemek icin kullanilir.add methodundan farki:
        // restriction koyulunca offer() methodu eklemez add methodu kisitlamalari dikkate almaz yine de ekler.
        System.out.println(r);
        System.out.println(myQueue);

        Queue<String> yourQueue = new PriorityQueue<>();
        yourQueue.add("Milk");
        yourQueue.add("Butter");
        yourQueue.add("Jam");
        yourQueue.add("Egg");
        yourQueue.add("Luxury water");

        System.out.println(yourQueue);
    }
}
