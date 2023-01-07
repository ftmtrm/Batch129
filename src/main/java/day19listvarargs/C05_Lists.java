package day19listvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_Lists {
    public static void main(String[] args) {
        //INTERVIEW Question
        //kullanicidan alinan bir tamsayiya kadar FIBONACCI dizisi olusturun

        List<Integer> fibonacci = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = input.nextInt();
        fibonacci.add(0);
        fibonacci.add(1);

        int i = 1;
        if (sayi <= 1) {
            System.out.println("Lutfen 1'den buyuk bir sayi giriniz");
        } else {
            while (fibonacci.get(i) < sayi) {
                fibonacci.add(fibonacci.get(i) + fibonacci.get(i - 1));
                //bir onceki eleman ile topla
                i++; //bir basamak ilerlesin
            }
            if (fibonacci.get(fibonacci.size() - 1) > sayi) {
                fibonacci.remove(fibonacci.size() - 1);
                System.out.println("Girdiginiz sayi fibonacci sayisi degildir Girilen sayiya kadar dizi " + fibonacci);
            } else
                System.out.println("Girdiginiz sayi fibonacci sayisidir."+fibonacci);

        }


    }
}
