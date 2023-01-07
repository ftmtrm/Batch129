package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Ex 1: String bir array olusturunuz.6 eleman yerlestiriniz.
        //karakter sayisi 5'den cok olan elemanlari siliniz
        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        System.out.println(Arrays.toString(colors));
        //yeni bir array olusturup karakter sayisi
        // 5 ve 5den kucuk olan elemanlari yeni array'e transfer edecegiz
        //boylece yeni array'de karakter sayisi 5den buyuk olan eleman kalmicak
        //array olusturmak icin iki sey belirlenmelidir
        //1) elemanlarin data type'i
        //2) yeni array'de kac tane eleman olacak
        //verilen array'de eleman sayisi 5 ve 5'den kucuk olan kac eleman var bulmaliyiz
        int counter = 0;
        for (String w : colors) {
            if (w.length() <= 5) {
                counter++;
            }
        }
        //yeni array olustur.
        String newColors[] = new String[counter];
        //karakter sayisi 5 ve 5'den kucuk olanlari yeni array'e transfer et
        int idx = 0;
        for (String w : colors) {
            if (w.length() <= 5) {
                newColors[idx] = w;
                idx++;

            }
        }
        System.out.println(Arrays.toString(newColors));//[Red, Blue, Green, Brown]

        }


    }
