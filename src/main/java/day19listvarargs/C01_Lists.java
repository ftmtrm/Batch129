package day19listvarargs;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {
        List<String>names = new ArrayList<>();
        
        names.add("Hakan");
        names.add("Yunus");
        names.add("Ayse");
        names.add("Zisan");
        names.add("Sevcan");
        names.add("Omer");
        
        List<String>males = new ArrayList<>();
        males .add("Hakan");
        males .add("Yunus");
        males .add("Ali");
        
        names.retainAll(males); // kesisim kumesindekileri aliyor.yani Hakan ve Yunus'u aldi.ortak olmayanlar siliniyor.
        System.out.println("names = " + names);
        System.out.println("males = " + males);//[Hakan, Yunus, Ali] degismiyor, aynen kalir.

        //List'teden belirli bir araliktaki datalari getirmek
        List<String>sanatci = new ArrayList<>();
        sanatci.add("Ajda");
        sanatci.add("Cuneyt");
        sanatci.add("Mahsun");
        sanatci.add("Muslum");
        sanatci.add("Orhan");

        System.out.println(sanatci.subList(1,3));
        //subList sout'un icinde yazdirilabilir ya da atama yapip conteyner'in adi yazdirilabilir

    }
}
