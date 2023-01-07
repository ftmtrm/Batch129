package day18arraylist;

import java.util.ArrayList;

public class C02_ArrayList {
    public static void main(String[] args) {
        //verilen bir listteki elemanlari tekrarsiz olarak yazdirma
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        System.out.println("a = " + a);
        ArrayList<Integer> yeniList = new ArrayList<>();
        for (Integer w : a) {
            if(!yeniList.contains(w)){
                yeniList.add(w);
            }
            
        }
        System.out.println("yeniList = " + yeniList);
        
        
        

    }
}
