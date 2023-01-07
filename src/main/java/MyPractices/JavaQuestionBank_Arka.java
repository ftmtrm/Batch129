package MyPractices;

import java.util.ArrayList;
import java.util.List;

public class JavaQuestionBank_Arka {

    //Listede eleman olarak 15 varsa, tum 15'leri 51 olarak degistiriniz.
    public static void main(String[] args) {

        List<Integer> g = new ArrayList<>();
        g.add(12);
        g.add(11);
        g.add(15);
        g.add(34);
        g.add(15);
        g.add(43);
        if(g.contains(15)){
            for (Integer w : g) {
                if(w==15){
                    int idx = g.indexOf(15);
                    g.set(idx,51);
                }
            }
            System.out.println(g);
        }else
            System.out.println("Liste 15 elemanini icermiyor");

//Listede 15 veya 13 varsa, bu elemanları kaldırınız.
//Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)
    List<Integer> h = new ArrayList<>();
    h.add(10);
    h.add(31);
    h.add(15);
    h.add(13);
    h.add(54);
    h.add(13);
    if(!h.contains(15)&& !h.contains(13)){
        System.out.println("Liste 15 veya 13 elemanlarini icremiyor");
    }else{
        for(int i=0;i< h.size();i++){
            if(h.get(i)==15){
                int idx= h.indexOf(15);
                h.remove(idx);
                i--;
            }
            if(h.get(i)==13){
                int idx1= h.indexOf(13);
                h.remove(idx1);
                i--;
            }
        }
        System.out.println(h);
    }

    }
}