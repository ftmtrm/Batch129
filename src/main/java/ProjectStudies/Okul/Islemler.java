package ProjectStudies.Okul;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

        static List<Kisi> ogrncListesi = new ArrayList<>();
        static ArrayList<Kisi> ogrtListesi = new ArrayList<>();
        static Scanner scan = new Scanner(System.in);
        static String kisiTuru;
        public static final String W = "\u001B[37m";
        public static final String R = "\u001B[31m";
        public static final String G = "\u001B[32m";
        public static final String Y = "\u001B[33m";
        public static final String B = "\u001B[34m";

        public static void girisPaneli() {
            System.out.println(R+"**********************************    "+Y+" \nOGRENCI VE OGRETMEN YONETIM PANELI\n"+G+"**********************************");
            System.out.println(B+"1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS ");
            System.out.print("Lutfen yapmak istediginiz islemi giriniz : ");
            System.out.print("isleminizi seciniz : ");
            String secim = scan.next().toUpperCase();
            switch (secim) {
                case "1":
                    kisiTuru = "OGRENCI";
                    islemMenusu();
                    break;
                case "2":
                    kisiTuru = "OGRETMEN";
                    islemMenusu();
                    break;

                case "Q":
                    cıkıs();
                    break;
                default:
                    System.out.println("hatalı giriş yaptınız");
                    girisPaneli();//recursive method call
                    break;
            }

        }
        private static void cıkıs() {
            System.out.println("yine bekleriz");
        }

        public static void islemMenusu() {
            System.out.println("Sectiginiz kisi turu: "+kisiTuru+", Lutfen asagidaki islemlerden tercih yapiniz.\n"
                    +R+"*********** "+kisiTuru+" ISLEMLER ************\n"+B+" 1-EKLEME\n 2-ARAMA\n 3-LISTELEME\n 4-SILME\n 0-ANA MENU");
            System.out.print(B+"Islem Tercihiniz : ");

            System.out.print("islem tercihinizi giriniz : ");
            int secilenIslem = scan.nextInt();

            switch (secilenIslem) {
                case 1:
                    ekle();
                    islemMenusu();
                    break;
                case 2:
                    arama();
                    islemMenusu();
                    break;
                case 3:
                    listele();
                    islemMenusu();
                    break;
                case 4:
                    sil();
                    islemMenusu();
                    break;
                case 0:
                    girisPaneli();
                    break;
                default:
                    System.out.println("Lutfen birsey giriniz ");
                    islemMenusu();
                    break;
            }

        }
        private static void sil() {

            System.out.println(R+"   ***   " + kisiTuru + " silme sayfası   ***"+B);

            boolean flag = true;//flag bayrak olsun true->bayrak havada false->bayrak yerde

            if (kisiTuru.equalsIgnoreCase("OGRENCI")){//ogrenci arıyorsa if body çalışacak
                scan.nextLine();//dummy
                System.out.println();//bos satır print
                System.out.print("Silinecek ogrenci kimlik no giriniz : ");

                String silinecekKimlikNo=scan.next();

                for (Kisi k:ogrncListesi) {
                    if (k.getKimlikNo().equals(silinecekKimlikNo)){//flag havada
                        System.out.println("Silinen ogrenci : "+k.getAdSoyad());
                        ogrncListesi.remove(k);//ogrsc silindi
                        flag=false;
                        break;
                    }

                }if (flag){
                    System.out.println("Silinecek ogrenci mevcut değil ");
                }
            }else{//ogretmen aranıyorsa else body calışacak
                System.out.print("silinecek ogretmenin kimlik no giriniz : ");
                String silinecekOgrtKimlikNo=scan.next();
                for (Kisi k: ogrtListesi) {
                    if (k.getKimlikNo().equalsIgnoreCase(silinecekOgrtKimlikNo)){//flag havada
                        System.out.println("Silinen ogretmen : "+k.getAdSoyad());
                        ogrtListesi.remove(k);
                        flag=false;
                        break;
                    }

                }if (flag){//flag inince
                    System.out.println("Silinecek ogretmen mevcut değil ");
                }
            }

        }
        private static void listele() {

            System.out.println(B + "   ***   " + kisiTuru + " listeleme sayfası   ***" + R);
            if (kisiTuru.equalsIgnoreCase("OGRENCI")) {//ogrenci listeleme if
                System.out.println(ogrncListesi);
            } else if (kisiTuru.equalsIgnoreCase("OGRETMEN")) {//ogrenci listeleme if
                System.out.println(ogrtListesi);
            }
        }
//            }else {//ogretmen listeleniyor
//                for (Kisi k: ogrtListesi) {
//                    System.out.println(k.toString() + " adı soyadı : " + k.getAdSoyad() + k.getYas());
//                }
//            }
//        }
        private static void arama() {
            System.out.println(R+"   ***   " + kisiTuru + " arama sayfası   ***"+B);

            boolean flag = true;//flag bayrak olsun true->bayrak havada false->bayrak yerde
            //TRICK : flag iki farklı method'da da kullanıldıgı icin static yapmak daha clean code olur....

            if (kisiTuru.equalsIgnoreCase("OGRENCI")){//ogrenci arıyorsa if body çalışacak
                scan.nextLine();//dummy
                System.out.println();//bos satır print
                System.out.print("Aradıgınız ogrenci kimlik no giriniz : ");

                String arananKimlikNo=scan.next();

                for (Kisi k:ogrncListesi) {
                    if (k.getKimlikNo().equals(arananKimlikNo)){//flag havada
                        System.out.println("Aradıgınız ogrenci : "+k.getAdSoyad());
                        flag=false;
                    }

                }if (flag){//flag inince
                    System.out.println("Aradıgınız ogrenci mevcut değil ");
                }
            }else{//ogretmen aranıyorsa else body calışacak
                System.out.print("Aradıgınız ogretmenin kimlik no giriniz : ");
                String arananKimlikNo=scan.next();
                for (Kisi k: ogrtListesi) {
                    if (k.getKimlikNo().equalsIgnoreCase(arananKimlikNo)){//flag havada
                        System.out.println("Aradıgınız ogretmen : "+k.getAdSoyad());
                        flag=false;
                    }

                }if (flag){//flag inince
                    System.out.println("Aradıgınız ogretmen mevcut değil ");
                }
            }
        }
        private static void ekle() {
            System.out.println(R+"   ***   " + kisiTuru + " ekleme sayfası   ***"+B);
            System.out.print("Ad soyad giriniz : ");
            scan.nextLine();//dummy hayalet komut
            String adSoyad = scan.nextLine();
            System.out.print("Kimlik No giriniz : ");
            String kimlikNo = scan.next();
            System.out.print("Yas giriniz : ");
            int yas = scan.nextInt();
            if (kisiTuru.equals("OGRENCI")) {
                System.out.print("Ogrenci No giriniz : ");
                    String ogrcNo = scan.next();

                scan.nextLine();//dummy --> hayalet komut--> iki tane eşit scan.next(); komutu ayırmak için araya girmeli
                System.out.print("Sınıf giriniz : ");
                String sınıf = scan.next();

                Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrcNo, sınıf);//p'li cons ogrc obj create edildi
                ogrncListesi.add(ogrenci);

            } else {//kisiTuru öğrenci ise if çalısir değilse kisiTuru öğretmen demektir ki else body çalışır
                System.out.print("Sicil No giriniz : ");
                String sicilNo = scan.next();
                System.out.print("Bolum giriniz : ");
                String bolum = scan.next();
                Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, sicilNo, bolum);//p'li cons ogrtm obj create edildi
                ogrtListesi.add(ogretmen);
            }
        }
    }