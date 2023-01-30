package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {
        //Note1:sort() methodu sayisal data tiplerini kucukten buyuge siralar.(ascending order)
        //Note2:sort() methodu String data tiplerini alfabetik olarak siralar.(alphabetical order)
        //Note3: ascending order + alphabetical order ==> Natural order
        //Note4: sort methodu array elemanlarini natural order'a gore siralar.
        //Note5: binarySearch() methodu bir elemanin bir array'de olup olmadigini kontrol etmek icin kullanilir
        // binarySearch() methodunu kullanmadan once "sort" methodunu kullanmak zorundayiz.
        //sort methodunu kullanmazsaniz buldugunuz sonuc guvenilir olmaz.

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));
        int num1 = Arrays.binarySearch(colors, "Blue");
        System.out.println(num1);//var hem de index'i 0 diyor
        int num2 = Arrays.binarySearch(colors, "Orange");
        System.out.println(num2);//var hem de index'i 3 diyor
        int num3 = Arrays.binarySearch(colors, "Tarik");
        System.out.println(num3);//-6 verdi "-"olursa bu arrayde yok demek olsaydi
        // 6.eleman olurdu (yellowdan once yani) demek.



        }



    }

