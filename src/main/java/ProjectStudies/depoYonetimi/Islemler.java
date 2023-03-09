package ProjectStudies.depoYonetimi;

import java.util.*;

public class Islemler {
    static Scanner scan = new Scanner(System.in);
    public static Map<Integer, UrunTanimlama> urunListesiMap = new HashMap<Integer, UrunTanimlama>();
    public static int urunId = 500;

    public Islemler() {

    }

    public static void girisPaneli() {
        System.out.println("*******************\nDEPO YONETIM PANELI\n" +
                "********************\n"
                + "1- URUN TANIMLAMA\n2- URUN LİSTELEME\n3- DEPOYA URUN GİRİŞİ\n4- URUNU RAFA KOYMA\n5- DEPODAN URUN ÇIKIŞI YAPMA\n6- DEPO SİSTEMİNDEN ÇIKIŞ");
        System.out.print("Lutfen işlem seciniz : ");
        String secim = scan.next().toUpperCase();
        switch (secim) {
            case "1":
                urunTanimla();
                girisPaneli();
                break;
            case "2":
                urunListele();
                girisPaneli();
                break;
            case "3":
                urunGirisi();
                girisPaneli();
                break;
            case "4":
                urunuRafaKoy();
                girisPaneli();
                break;
            case "5":
                urunCikisi();
                girisPaneli();
                break;
            case "6":
                cikis();
                break;
            default:
                System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz. ");
                girisPaneli();
                break;
        }
    }
    private static void urunTanimla() {

        System.out.println("   ********* Urun Tanımlama Sayfası *********");
        System.out.println("Urunun ismini giriniz: ");
        scan.nextLine();
        String urunIsmi = scan.nextLine();

        System.out.println("Urunun üreticisini giriniz: ");
        String uretici = scan.nextLine();

        System.out.println("Urunun birimini giriniz: ");
        String birim = scan.next();

//        System.out.println("Urunun birimini giriniz: ");
//        int urunMiktar = scan.nextInt();
//
//        System.out.println("Urunun bulundugu rafi giriniz: ");
//        String raf = scan.next();

        int urunMiktar = 0;
        String raf = " - ";

        UrunTanimlama urun = new UrunTanimlama(urunIsmi, uretici, birim, urunMiktar, raf);
        urunListesiMap.put(urunId, urun);
        urunId++;
    }
    private static void urunListele() {
        Set<Map.Entry<Integer, UrunTanimlama>> urunEntrySeti = urunListesiMap.entrySet();
        System.out.println("*******************URUN LİSTESİ****************");
        System.out.println("urun id | urunismi | urununureticisi | urunbirim | urunmiktar | raf" +
                "\n***********************************************");
        for (Map.Entry<Integer, UrunTanimlama> e : urunEntrySeti) {
            Integer entryKey = e.getKey();
        System.out.printf("%-7d     |  %-13s   |  %-16s  |  %-14s |  %-11d  | %-8s\n", entryKey, urunListesiMap.get(entryKey).getUrunIsmi(), urunListesiMap.get(entryKey).getUretici(), urunListesiMap.get(entryKey).getBirim(), urunListesiMap.get(entryKey).getUrunMiktar(), urunListesiMap.get(entryKey).getRaf());
        }
    }
    private static void urunGirisi() {
        System.out.println("   ********* Urun Giriş Sayfası ********* ");
        System.out.println("Güncellemek istediğiniz ürünun id sini giriniz:");
        int arananId = scan.nextInt();
        if (urunListesiMap.keySet().contains(arananId)) {
            System.out.println("Miktar giriniz");
            int updatedamount = 0;
            boolean flag = true;
            do {
                try {
                    if (flag == true) {
                        scan.nextLine();
                    }
                    updatedamount = scan.nextInt();
                    scan.nextLine();
                    flag = false;
                } catch (Exception e) {
                    System.out.println("Lütfen geçerli miktar girisi yapınız");
                }
            } while (flag);
            urunListesiMap.get(arananId).setUrunMiktar(updatedamount + urunListesiMap.get(arananId).getUrunMiktar());
            System.out.println("Urun miktarı güncellendi\n güncel miktar: " + urunListesiMap.get(arananId).getUrunMiktar());
        } else {
            System.out.println("Aradığınız ürün bulunmamaktadir");
            urunGirisi();
        }
    }
    private static void urunuRafaKoy() {
        System.out.println("   ********* Urunu Rafa Koyma Sayfası ********* ");
        System.out.print("Rafa koymak istediginiz urunun ID sini giriniz : ");
        int arananId = scan.nextInt();
        if (urunListesiMap.keySet().contains(arananId)) {
            System.out.println("Hangi rafa kaldıracağınızı yazınız:");
            String updatedRaf = scan.next();
            urunListesiMap.get(arananId).setRaf(updatedRaf);
        } else {
            System.out.println("Bu ürün depoda mevcut değildir");
            urunuRafaKoy();
        }

    }
    private static void urunCikisi() {
        System.out.println("   ********* Urun Cıkış Sayfası ********* ");
        System.out.print("Cıkısını yapmak  istediginiz urunun ID sini giriniz : ");
        int arananId = scan.nextInt();
        if (urunListesiMap.keySet().contains(arananId)) {
            System.out.println("Miktarini giriniz");
            int updatedamount = 0;
            boolean flag = true;
            do {
                try {
                    if (flag == true) {
                        scan.nextLine();
                    }
                    updatedamount = scan.nextInt();
                    scan.nextLine();
                    flag = false;
                } catch (Exception e) {
                    System.out.println("Lütfen geçerli bir tamsayı giriniz");
                }
            } while (flag);

            if ( urunListesiMap.get(arananId).getUrunMiktar() - updatedamount < 0) {
                System.out.println("Deponuzda bu miktarda ürün yoktur.\n Mevcut miktar: " + urunListesiMap.get(arananId).getUrunMiktar());
            } else {
                urunListesiMap.get(arananId).setUrunMiktar( urunListesiMap.get(arananId).getUrunMiktar() - updatedamount);
                System.out.println("Urun miktarınız güncellendi\n Güncel miktar: " + urunListesiMap.get(arananId).getUrunMiktar());
            }

        } else {
            System.out.println("Aradığınız ürün bulunmamaktadir");
        }
    }

    private static void cikis() {

        System.out.println(" Depo dan çıkış yaptınız. Yine bekleriz..");
    }

}

