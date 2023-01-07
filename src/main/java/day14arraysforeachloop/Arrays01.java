package day14arraysforeachloop;

import javax.print.DocFlavor;
import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Ex1: String array olusturun, icine 5 tane eleman ekleyin.
        // ilk eleman ile son elemanin icerdigi karakter sayilari toplamini ekrana yazdiriniz.
        String arr [] = new String[5];
        arr[0]="Math";
        arr[1]="Science";
        arr[2]="Music";
        arr[3]="English";
        arr[4]="Art";
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].length()+ arr[arr.length-1].length());

        //Ex2: String array olusturun, icine 5 tane eleman ekleyin.
        // tum elemanlarin karakter sayisini toplamini ekrana yazdiriniz.

        String brr[] = new String[5];
        brr[0] = "Miami";
        brr[1] = "istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Athena";

        //1.yol: for loop
       int totalChar = 0;

        for (int i = 0; i < brr.length; i++) {
            totalChar+=brr[i].length();
        }
        System.out.println(totalChar);
        //2.yol:
        //for-each loop (enhanced=zenginlestirilmis loop)
        // baslangic degeri loop'un calisma sart ve increment decrement kismini kendisi halleder.
        //bu loop "Array"lerde ve "Collection"larda kullanilir ama hepsinde degil
        //Index kullanmaniz gerektiginde bazen bu loop caresiz kalir mecburen diger looplari kullaniriz
        int sum = 0;
        for (String w :brr) {
                    sum+=w.length();
        }
        System.out.println(sum);
    }
}
