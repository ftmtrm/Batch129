package day19listsvarargs_suleyman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lists03 {

        public static void main(String[] args) {

            //Example 2: SAYI TAHMIN OYUNU
            //Oyuncudan 1-10 arasi bir sayi isteyin
            //eleinizdeki listede oyuncunun tahmin ettigi sayi varsa BINGO yazdiriniz.
            //yoksa verdigi sayiyi listenize ekleyiniz.
            // ilk BINGO'yu tamamlayana "KAZANDINIZ" yazdiriniz.
            //[5,8,2,9]==> 2 ==> [5,8,BINGO,9]
            //[5,8,2,9]==> 3 ==> [5,8,BINGO,9,3]
            //[5,8,2,9]=====> [BINGO,BINGO,BINGO,BINGO,BINGO,BINGO]


            Scanner input = new Scanner(System.in);
            List<String> numsList = new ArrayList<>();
            //Arrays.asList(5,8,2,9) yaparsak eleman sayisi degistirilemez
            //Arrays.asList ile list olusturulabilir.
            // ancak listlerdeki eleman sayisini degistiren hicbir method bu list icin kullanilamaz
            // cunku bunu kullanirsaniz eleman sayisini degistiremezsiniz
            // dolayisiyla bu sorunun cozumunde ihtiyaciniz olan Listi "Arrays.asList kullanarak olusturmamalisiniz.

            numsList.add("5");
            numsList.add("8");
            numsList.add("2");
            numsList.add("9");

            int counter = 0;
            String num = "";

            do{
                System.out.println("Lutfen 1 ile 10 arasinda bir tam sayi giriniz");
                num = input.next();

                if(num.equalsIgnoreCase("Q")){
                    break;
                }else if(numsList.contains(num)){
                    numsList.set(numsList.indexOf(num), "Bingo");
                    counter++;
                }else{
                    numsList.add(num);
                }
            }while(counter!= numsList.size());

            if(!num.equalsIgnoreCase("Q")) {
                System.out.println("Kazandiniz");
            }else{
                System.out.println("Oyundan isteyerek ayrildiniz, tekrar bekleriz");
            }

            System.out.println("Final report: " + numsList);
        }
}