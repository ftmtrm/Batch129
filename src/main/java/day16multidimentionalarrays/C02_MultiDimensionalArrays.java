package day16multidimentionalarrays;

import java.util.Arrays;

public class C02_MultiDimensionalArrays {
    public static void main(String[] args) {
        //bir tane integer multidimensional array olusturunuz. Bu arraydeki tum sayilarin toplamini veren kodu yaziniz
        int arr[][] = {{2, 5, 1}, {32, 75}};

        int sum = 0;
        System.out.println(Arrays.deepToString(arr));
        for (int[] w : arr) {
            for (int i : w) {
                sum += i;
            }
        }
        System.out.println(sum);

        //multidimensional array tek katli array'e nasil cevrilir?
        /* 1) Once multidimensional arrayin eleman sayisini bulun
           2) yeni bir array almaliyim
           3) yeni bir arrayin buyuklugu; ilk multidimensional arrayin eleman sayisina esit buyuklukte olmali
         */
        int brr[][] = {{2, 5, 1}, {32, 75}};
        int toplam = 0;
        System.out.println(Arrays.deepToString(brr));
        for (int[] w : brr) {
            toplam += w.length;
        }
        System.out.println(toplam);//yeni olusturacagimiz arrayin buyuklugunu belirledik.
        int idx = 0;
        int crr[] = new int[toplam];//toplam yerine 5 yazmayin dinamik olmaz
        for (int[] w : brr) {
            for (int k : w) {//w arrayinin icerisindeki herbir k degerini getir
                //yeni crr arrayinin icine idx'e gore yerlestir.
                crr[idx] = k;
                idx++;

            }
        }
        System.out.println(Arrays.toString(crr));
    }
}
