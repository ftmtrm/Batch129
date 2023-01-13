package ssgler.ssgLists;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {
    public static void main(String[] args) {
        //bir listede ortalamanin ustunde olan element sayisini bulunuz

        List<Double> sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);

        double sum = 0;
        double ort = 0;
        for(Double w: sayilar){
            sum+=w;
        }ort = sum/sayilar.size();
        System.out.println(ort);

        List<Double> ortalamaUstundekilerList = new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar.get(i) > ort) {
                ortalamaUstundekilerList.add(sayilar.get(i));
            }
        }
        System.out.println(ortalamaUstundekilerList);
        // 2 .yol
        for (double sayi : sayilar) {
            if (sayi > ort) {
                ortalamaUstundekilerList.add(sayi);
            }
        }

        System.out.println(ortalamaUstundekilerList);//[5.0, 5.0, 6.0, 7.0]
    }

    }

