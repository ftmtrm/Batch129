package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {

        //Arraylist olustururken sag tarafa constructor Arraylist yazmak zorundasiniz.
        //ama sol tarafa ister "ArrayList"yazin isterseniz de "List" yazin ikisi de calisir.
        List<Character> initials = new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        //Bir list'te kac eleman oldugunu nasil anlariz?
        //Array'lerden bahsederken "length" kullanin, List'lerden bahsederken "size" kullanin.

       int numOfElement = initials.size();
        System.out.println(numOfElement);//4

        //Bir list'ten istenen bir eleman nasil alinir?

        char u = initials.get(2);
        System.out.println(u);// M verir.

        //Ex: Verilen bir String List'teki tum elemanlarin toplam karakter sayilarini bulan kodu yaziniz
        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        // 1.yol: Recommended
        int sum = 0;
        for(String w: cities){
            sum+=w.length();

        }
        System.out.println(sum);
        //2.yol:
        int toplam = 0;
        for (int i = 0; i < cities.size() ; i++) {
            toplam+=cities.get(i).length();
        }
        System.out.println(toplam);

        //Bir List'teki istenen bir elemani nasil degistirebiliriz?
        cities.set(0,"New York");
        System.out.println(cities);

        //Ex2: Maas List'i olustrunuz ve maaslara yuzde 20 zamn yapiniz
        List<Double> salary = new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);

        //1.yol:
        int idx = 0;
        for(Double w: salary){
            salary.set (idx,w*1.20);
            idx++;
        }
        System.out.println(salary);
        //2.yol;
        for (int i = 0; i <salary.size() ; i++) {
            salary.set(i,salary.get(i)*1.20);

        }
        System.out.println(salary);
    }
}
