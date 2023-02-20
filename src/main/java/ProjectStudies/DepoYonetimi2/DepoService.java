package ProjectStudies.DepoYonetimi2;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DepoService {
    private static int count = 1000;
    private int id;
    private Map<Integer, Urun> urunListesiMap = new HashMap<Integer, Urun>();
    static Scanner scan = new Scanner(System.in);

    public DepoService() {
        Urun urun1 = new Urun("un", "sinangil", "cuval", 5, "3");
        Urun urun2 = new Urun("seker", "balkupu", "cuval", 10, "4");
        Urun urun3 = new Urun("yag", "yudum", "sise", 4, "6");

        this.id = count;
        this.urunListesiMap.put(count++, urun1);
        this.urunListesiMap.put(count++, urun2);
        this.urunListesiMap.put(count++, urun3);
    }
    public void urunTanimla() {

        System.out.println("   ********* Urun Tanımlama Sayfası *********");
        System.out.println("Urunun ismini giriniz: ");
        String urunIsmi = scan.nextLine();

        System.out.println("Urunun üreticisini giriniz: ");
        String uretici = scan.nextLine();

        System.out.println("Urunun birimini giriniz: ");
        String birim = scan.next();

        int urunMiktar = 0;
        String raf = " - ";

        Urun urun = new Urun(urunIsmi, uretici, birim, urunMiktar, raf);
        this.urunListesiMap.put(count, urun);
        count++;
    }
        public void urunListele(){
            Set<Map.Entry<Integer, Urun>> urunEntrySeti = urunListesiMap.entrySet();
            System.out.println("         ****Urunlerimiz****              ");
            System.out.printf("%-3s  |   %-7s  |  %-7s  |  %-4s  |   %-5s  |   %-5s \n","UrunId","Urunismi","Uretici","Birimi","UrunMiktar","Raf");
            System.out.printf("%-3s  |   %-7s  |  %-7s  |  %-4s  |   %-5s  |   %-5s \n","------","--------","-------","------","----------","---");

            for (Map.Entry<Integer, Urun> e : urunEntrySeti) {
                Integer entryKey = e.getKey();
            System.out.printf("%-5s   |  %-7s    |  %-9s  |  %-4s  |   %-5s  |  %-5s\n", entryKey, urunListesiMap.get(entryKey).getUrunIsmi(), urunListesiMap.get(entryKey).getUretici(), urunListesiMap.get(entryKey).getBirim(), urunListesiMap.get(entryKey).getUrunMiktar(), urunListesiMap.get(entryKey).getRaf());
            }

            }
    public void urunGirisi() {
        System.out.println("   ********* Urun Giriş Sayfası ********* ");
        System.out.println("Güncellemek istediğiniz ürünun id sini giriniz:");
        int arananId = scan.nextInt();
            if (this.urunListesiMap.keySet().contains(arananId)) {
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
    public void urunuRafaKoy() {
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
    public void urunCikisi() {
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

    public static void cikis() {

        System.out.println(" Depo dan çıkış yaptınız. Yine bekleriz..");
    }



}
