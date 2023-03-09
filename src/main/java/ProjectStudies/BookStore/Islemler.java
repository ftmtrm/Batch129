package ProjectStudies.BookStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

        static List<Kitap> kitapListesi = new ArrayList<>();
        static List<Defter> defterListesi = new ArrayList<>();
        static Scanner scan = new Scanner(System.in);
        static String kitapDefterSecimi;
        public static int kitapdefterID=100;
        public static final String R = "\u001B[31m";
        public static final String G = "\u001B[32m";
        public static final String Y = "\u001B[33m";
        public static final String B = "\u001B[34m";

        public static void giris() {
            System.out.println(R+"**********************************    "+Y+" \nKITAP VE DEFTER SATIS SITESI\n"+G+"**********************************");
            System.out.println(B+"1- KITAP SATISI\n2- DEFTER SATISI\nQ- CIKIS ");
            System.out.print("Lutfen yapmak istediginiz islemi giriniz : ");
            System.out.print("isleminizi seciniz : ");
            String secim = scan.next().toUpperCase();
            switch (secim) {
                case "1":
                    kitapDefterSecimi = "KITAP";
                    islemMenusu();
                    break;
                case "2":
                    kitapDefterSecimi = "DEFTER";
                    islemMenusu();
                    break;

                case "Q":
                    cikis();
                    break;
                default:
                    System.out.println("hatalı giriş yaptınız");
                    giris();
                    break;
            }

        }
        private static void cikis() {
            System.out.println("Tesekkur ederiz yine bekleriz");
        }

        public static void islemMenusu() {
            System.out.println("Sectiginiz islem turu: "+kitapDefterSecimi+", Lutfen asagidaki islemlerden tercih yapiniz.\n"
                    +R+"*********** "+kitapDefterSecimi+" ISLEMLER ************\n"+B+" 1-EKLEME\n 2-ARAMA\n 3-LISTELEME\n 4-SILME\n 0-ANA MENU");
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
                    giris();
                    break;
                default:
                    System.out.println("Lutfen birsey giriniz ");
                    islemMenusu();
                    break;
            }

        }
        private static void sil() {

            System.out.println(R+"   ***   " + kitapDefterSecimi + " silme sayfası   ***"+B);

            boolean flag = true;

            if (kitapDefterSecimi.equalsIgnoreCase("KITAP")){
                scan.nextLine();
                System.out.println();
                System.out.print("Silinecek kitap ID nosunu giriniz : ");

                int silinecekKitapID=scan.nextInt();

                for (KitapDefter k:kitapListesi) {
                    if (k.getKitapdefterID()==silinecekKitapID){
                        System.out.println("Silinen kitap : "+k.getKitapdefterID());
                        kitapListesi.remove(k);
                        flag=false;
                        break;
                    }

                }if (flag){
                    System.out.println("Silinecek kitap mevcut değil ");
                }
            }else{
                System.out.print("silinecek defterin ID nosunu giriniz : ");
                int silinecekdefterIDNo=scan.nextInt();
                for (KitapDefter k: defterListesi) {
                    if (k.getKitapdefterID()==silinecekdefterIDNo){
                        System.out.println("Silinen defter : "+k.getKitapdefterID());
                        defterListesi.remove(k);
                        flag=false;
                        break;
                    }

                }if (flag){
                    System.out.println("Silinecek defter mevcut değil ");
                }
            }

        }
        private static void listele() {

            System.out.println(B + "   ***   " + kitapDefterSecimi + " listeleme sayfası   ***" + R);
                boolean flag = true;

                if (kitapDefterSecimi.equalsIgnoreCase("KITAP")) {
                    scan.nextLine();
                    System.out.println();
                    System.out.print("Listemek istediginiz kitabin yayinevini giriniz : ");

                    String listenecekKtpYaynevi = scan.next();

                    for (Kitap k : kitapListesi) {
                        if (k.getYayinevi().equals(listenecekKtpYaynevi)) {
                            System.out.println("Listelenen kitap : " + k.getKitapdefterID()+" "+k.getYazarAdi());
                            System.out.println(kitapListesi);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("Listenecek kitap mevcut değil ");

                    }
                }else if(kitapDefterSecimi.equalsIgnoreCase("DEFTER")){
            System.out.print("Aradıgınız defterin markasini giriniz : ");
            String listenecekdeftermarka=scan.next();
            for (Defter k: defterListesi) {
            if (k.getMarka().equalsIgnoreCase(listenecekdeftermarka)){
                System.out.println("Listelenen defter : "+k.getKitapdefterID()+k.getYaprakSayisi());
                System.out.println(defterListesi);
                flag=false;
            }

        }if (flag){
            System.out.println("Listenecek defter mevcut değil ");

        }
            }
        }

        private static void arama() {
            System.out.println(R+"   ***   " + kitapDefterSecimi + " arama sayfası   ***"+B);

            boolean flag = true;

            if (kitapDefterSecimi.equalsIgnoreCase("KITAP")){
                scan.nextLine();
                System.out.println();
                System.out.print("Aradıgınız kitabin ID Nosunu giriniz : ");

                int arananIDNo=scan.nextInt();

                for (KitapDefter k:kitapListesi) {
                    if (k.getKitapdefterID()==arananIDNo){
                        System.out.println("Aradıgınız kitap : "+k.getKitapdefterID());
                        flag=false;
                    }

                }if (flag){
                    System.out.println("Aradıgınız kitap mevcut değil ");
                }
            }else{
                System.out.print("Aradıgınız defterin ID Nosunu giriniz : ");
                int arananIDNo=scan.nextInt();
                for (KitapDefter k: defterListesi) {
                    if (k.getKitapdefterID()==arananIDNo){
                        System.out.println("Aradıgınız defter : "+k.getKitapdefterID());
                        flag=false;
                    }

                }if (flag){
                    System.out.println("Aradıgınız defter mevcut değil ");
                }
            }
        }
        private static void ekle() {
            System.out.println(R+"   ***   " + kitapDefterSecimi + " ekleme sayfası   ***"+B);
            System.out.print("Birim fiyat giriniz : ");
            int birimFiyat = scan.nextInt();
            System.out.print("Stok sayisi giriniz : ");
            int stok = scan.nextInt();
            if (kitapDefterSecimi.equals("KITAP")) {
                System.out.print("Yayinevi giriniz : ");
                String yayinevi = scan.next();
                scan.nextLine();
                System.out.print("Yazar adi giriniz : ");
                String yazarAdi = scan.nextLine();

                Kitap kitap = new Kitap(kitapdefterID,birimFiyat,stok,yayinevi,yazarAdi);
                kitapListesi.add(kitap);
                kitapdefterID++;

            } else {
                System.out.print("Marka giriniz : ");
                String marka = scan.next();
                System.out.print("Yaprak sayisi giriniz : ");
                int yaprakSayisi = scan.nextInt();
                Defter defter = new Defter(kitapdefterID, birimFiyat, stok, marka, yaprakSayisi);
                defterListesi.add(defter);
                kitapdefterID++;
            }
        }
    }

