package day19listsvarargs_suleyman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lists02 {
    public static void main(String[] args) {
       /* Rastgele kullanici adi olusturan JAVA kodu yaziniz.
        1. Kullanicidan ismini isteyelim
        2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
        3. Kullanici adinin alinabilir olup olmadigina bakalim.
        4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
        5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
       */
        List<String> databaseIsim = new ArrayList();
        databaseIsim.add("AYSE");//OKAN23
        databaseIsim.add("AHMET");//OKAN44
        databaseIsim.add("SERDAR");//OKAN51
        databaseIsim.add("OKAN");//OKAN22
        databaseIsim.add("BETUL");//OKAN

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kullanici adinizi giriniz.");
        String userName = input.nextLine().toUpperCase().trim();
        //1.Yol:random sayi bulmak icin
        int random = (int)(Math.random()*100);
        //2.yol:
        int random1 = new Random().nextInt(100);

        while(databaseIsim.contains(userName+random)){
            random = (int)(Math.random()*100);

            //tekrar bir rastgele sayi seciyor.(OKAN15 varsa mesela)
            //OKAN23 oldu yine varsa listte loop basa donuyor yeniden random sayi secip ismin yanina yazdiriyor.
        }
        if(databaseIsim.contains(userName)){
            System.out.println("Bu username database'de var tekrar kullanilamaz.");
            databaseIsim.add(userName+random);

        }else {
            System.out.println("Bu username kullanilabilir");
            databaseIsim.add(userName);

        }
        System.out.println(databaseIsim);

    }
}
