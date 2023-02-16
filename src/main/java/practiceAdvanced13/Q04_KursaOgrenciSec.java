package practiceAdvanced13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q04_KursaOgrenciSec {
   /* Spor kursu için seçilecek öğrencileri belirleyen bir kod yazınız. kurs gereklilikleri:
    erkekler: boy: 1.60 ve üstü  kilo:70-90 kg
    kızlar: boy: 1.50 ve üstü  kilo:50-70 kg
    kullanıcıdan öğrenci sayısı ve herbir öğrenci için isim , cinsiyet, kilo ve boy bilgilerini girmesini isteyiniz.
    */
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ogrenci sayisini giriniz");
       int ogrSayisi = scanner.nextInt();
       String[] isimArr = new String[ogrSayisi];
       String[] cinsiyetArr = new String[ogrSayisi];
       double[] kiloArr = new double[ogrSayisi];
       double[] boyArr = new double[ogrSayisi];
       for (int i = 0; i < ogrSayisi; i++) {
           System.out.println(i + 1 + ". isim giriniz: ");
           scanner.nextLine();//dummy
           isimArr[i] = scanner.nextLine();
           System.out.println("cinsiyet giriniz (E,K)");
           String cinsiyet = scanner.next().toLowerCase().trim().substring(0, 1);
           if (cinsiyet.equals("k") || cinsiyet.equals("e")) {
               cinsiyetArr[i] = cinsiyet;
           } else {
               System.out.println("Hatali giris yaptiniz! Yeniden deneyiniz");
               i--;
               continue;
           }
           System.out.println("kilo giriniz(kg): ");
           kiloArr[i] = scanner.nextDouble();
           System.out.println("boy giriniz(m): ");
           boyArr[i] = scanner.nextDouble();
       }
       System.out.println(Arrays.toString(isimArr));
       System.out.println(Arrays.toString(cinsiyetArr));
       System.out.println(Arrays.toString(kiloArr));
       System.out.println(Arrays.toString(boyArr));

       System.out.println();
       int sayac = 0;
       List<String> kursaSecilenOgrenciler = new ArrayList<>();
       for (int i = 0; i < ogrSayisi; i++) {
           if (cinsiyetArr[i].equals("k") && kiloArr[i] >= 50 && kiloArr[i] <= 70 && boyArr[i] > 1.5) {
               kursaSecilenOgrenciler.add(isimArr[i]);
               sayac++;
           }else if(cinsiyetArr[i].equals("e")&& kiloArr[i]>=70 && kiloArr[i]<=90 && boyArr[i] >1.6){
               kursaSecilenOgrenciler.add(isimArr[i]);
                   sayac++;
           } else
               System.out.println("Kursa secilemeyen ogrenciler :" + isimArr[i]);

    }
       System.out.println("kursaSecilenOgrenciler : "+kursaSecilenOgrenciler);
        if(sayac==0){
        System.out.println("Kursa secilen ogrenci yoktur");
}
        //odev: exception ve secilemeyen ogrenci isimleri
   }



}
