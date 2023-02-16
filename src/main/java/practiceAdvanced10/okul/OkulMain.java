package practiceAdvanced10.okul;

//import java.util.ArrayList;bunlara da gerek kalmadi
//import java.util.List;
import java.util.Scanner;

public class OkulMain {

    /* 1- Değişkenleri ad, soyad, yaş olan bir Ogrenci pojo class'ı oluşturunuz.
    2- Değişkenleri okulAd, maxOgrenciSayisi, ArrayList cinsinden Öğrencileri olan bir Okul pojo class oluşturunuz
    3- Main metodunun olduğu OkulMain isimli bir class oluşturunuz.
    4- Bir okul objesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar öğrenci ekleyiniz.
    Fakat oluşturacağınız öğrencilerin yaşı 15'i geçmemeli, 8'den küçük olmamalı.
    Bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.*/
    public static void main(String[] args) {
         /*Ogrenci ogrenci = new Ogrenci("Ali","Can",12);//pojo class
            ogrenci.setAd("Sally");
         Ogrenci ogrenci2 = new Ogrenci("Veli","Can",23);//pojo class
         List<Ogrenci> liste = new ArrayList<>();
         liste.add(ogrenci);
         liste.add(ogrenci2);
         Okul okul = new Okul("Ata",50,liste);*/
        Scanner scanner = new Scanner(System.in);
        Okul okul = new Okul();
        System.out.println("Okul adini giriniz");
        okul.setOkulAdi(scanner.nextLine());
        System.out.println("Maksimum ogrenci sayisini giriniz");
        okul.setMaxOgrenciSayisi(scanner.nextInt());
//        List<Ogrenci> ogrenciListesi = new ArrayList<>();//buna da gerek kalmamis oldu
        for (int i = 1; i <= okul.getMaxOgrenciSayisi(); i++) {
            scanner.nextLine();//dummy scanner
            Ogrenci ogrenci = new Ogrenci();
            System.out.println(i + " . ogrenci ad: ");
            ogrenci.setAd(scanner.nextLine());//orjinal adin herdefasinda degismesi icin statik yapmak gerek
            System.out.println(i + " . ogrenci soyAd: ");
            ogrenci.setSoyAd(scanner.nextLine());
            System.out.println(i + " . ogrenci yas: ");
            try {
                ogrenci.setYas(scanner.nextInt());
                if (ogrenci.getYas() < 8 || ogrenci.getYas() > 15) {
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException arithmeticException) {
                System.out.println("Ogrenci yasi 8-15 araliginda olmalidir.");
                i--;
                continue;
            } catch (Exception exception) {
                System.out.println(" 8-15 araliginda bir SAYI giriniz.");
                continue;
            }
           // ogrenciListesi.add(ogrenci);//buna gerek kalmiyor addOgrenciTolist methodu olusturunca
            okul.addOgrenciToList(ogrenci);
        }
        System.out.println(okul);
    }
}