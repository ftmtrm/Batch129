package MyPractices.teampractice;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Arrays03 {
    /*yazılan değerin array içerisinde arayan Java Kodu yazınız.
    Array: [1551,1223,1443,1267,1789,1023,2020]
    Aranan Değer:2020
    Beklenen Çıktı:True
    Aranan Değer:2010
    Beklenen Çıktı :False*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num = input.nextInt();

        int [] arr = {1551,1223,1443,1267,1789,1023,2020};
        boolean varMi = false;
        for(int w:arr){
            if(w==num) {
                varMi= true;
                break;
            }
        }
        System.out.println(varMi);
        //2.yol:
        int crr[]={1551,1223,1443,1267,1789,1023,2020};

        System.out.println();

        System.out.println("Aradiğiniz sayi: ");
        int sayi= input.nextInt();
        int sonuc=Arrays.binarySearch(crr, sayi);

        if (sonuc>=0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        System.out.println();

       /* Saati saniyeye çeviren java methodunu yazınız.*/
        System.out.println("Lutfen bir saat degeri giriniz");
        saniyeyeCevir(input.nextInt());
    }
    public static int saniyeyeCevir(int input){

        int saniye = input*60*60;
        System.out.println(saniye);

        return saniye;
    }

}

