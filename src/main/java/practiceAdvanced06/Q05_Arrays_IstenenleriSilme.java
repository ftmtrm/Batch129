package practiceAdvanced06;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays_IstenenleriSilme {
    //Bir  integer Array'de verilen bir deger disindaki elamanlari
    // yeni bir Array olarak yazdiran bir method yaziniz.

    public static void main(String[] args) {
        int [] arr = {1,2,2,3,4,5,5};
        System.out.println("istenileniSil(arr) = " + Arrays.toString(istenileniSil(arr)));

    }
public static int[] istenileniSil(int[] arr){
        Scanner input = new Scanner(System.in);
    System.out.println("arr = " + Arrays.toString(arr));
    System.out.println("Silmek istediginiz elemani giriniz");
    int silinecek = input.nextInt();
    int lenght = 0;
    for (int w:arr) {
        if(w!=silinecek){
            lenght++;
        }
    }
    System.out.println("lenght = " + lenght);
    int [] arrSilinmis = new int[lenght];
    int idx = 0;
    for(int w:arr){
        if(w!=silinecek){
            arrSilinmis[idx]=w;
            idx++;
        }
    }
    return arrSilinmis;
}
}
