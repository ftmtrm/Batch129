package MyPractices.zeynepQuestions;

import java.util.Scanner;

public class ZeynepQuestions {
    public static void main(String[] args) {
        /* TASK :
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"2.vize notu double değerinde girilecek.
        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!
        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.5. final notu double değerinde olmalı. (örn: 65,5)
        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.
        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.
        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.
                                        eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
                                                                        80(80dahil)   ile 90 arasında ise  BA,
                                                                        70(70 dahil)   ile 80 arasında ise BB,
                                                                        60(60dahil) ile 70 arasında ise CB,
                                                                        50(50 dahil) ile 60 arasında ise CC,
                                                                     40(40 dahil) ile 50 arasında ise DC,
                                                                     30(30 dahil) ile 40 arasında ise DD,
                                                                     30 'dan düşük ise FF            gelmeli.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Vize notunuzu sayi cinsinden giriniz");
        double vizeNotu = input.nextDouble();
        System.out.println("Final notunuzu sayi cinsinden giriniz");
        double finalNotu = input.nextDouble();
        System.out.println("Vize oranini sayi cinsinden giriniz");
        double vizeOran = input.nextDouble();
        System.out.println("Final oranini sayi cinsinden giriniz");
        double finalOran = input.nextDouble();

        double ort = vizeNotu*vizeOran + finalNotu*finalOran;

        String notHarf = ort> 89 ? "AA" :
                ort > 79 ? "BA" : ort > 69 ? "BB" : ort > 59 ? "CB" : ort > 49 ? "CC" : ort > 39 ? "DC" : ort > 29 ? "DD" : ort > -1 ?
                "FF": "0 ile 100 arasi bir not giriniz";

        System.out.println("notHarf= " + notHarf);








    }
}
