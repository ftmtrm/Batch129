package ProjectStudies.Hastane_ProjectStudy_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DoktorIslemler extends VeriBankasi{

        static Map<String ,String> doktorListesi = new HashMap<>();

        static Scanner input=new Scanner(System.in);
        public static void doktorMenu(){

            System.out.println("==============DOKTOR MENUSU==============");
            System.out.println("1-Doktor Ekle\n" +
                    "2-Doktor Listesi\n" +
                    "3-Doktor Bulma\n" +
                    "4-Doktor Silme\n" +
                    "5-Verileri Yukle\n" +
                    "6-Ana Menu\n" +
                    "7-Cikis ");

            String secim;

            secim = input.next().substring(0,1);

            switch (secim){
                case "1":
                    doktorEkle();
                    doktorMenu();
                    break;
                case "2":
                    doktorListesi();
                    doktorMenu();
                    break;
                case "3":
                    doktorBul();
                    doktorMenu();
                    break;
                case "4":
                    doktorSil();
                    doktorMenu();
                    break;
                case "5":
                    veriBankasiDoktorlariEkle();
                    doktorMenu();
                    break;
                case "6":
                    HastaneIslemler.hastaneMenusu();
                    break;
                case "7":
                    System.out.println("Sistemden cikis yapiliyor...");
                    break;
                default:
                    System.out.println("Gecerli bir deger giriniz...");
                    doktorMenu();
                    break;

            }

        }

        private static void doktorEkle() {
            System.out.println("Doktor adini giriniz: ");
            input.nextLine();
            String isim=input.nextLine();
            System.out.println("Doktor soyadi giriniz: ");
            String soyIsim=input.nextLine();
            System.out.println("Doktor unvan giriniz: ");
            String unvan=input.nextLine();

            doktorListesi.put(unvan,isim+" "+soyIsim);
            System.out.println(doktorListesi);

        }

        private static void doktorListesi() {

            for (Map.Entry<String, String> w : doktorListesi.entrySet()) {
                System.out.println(w.getKey()+", "+w.getValue());
            }

        }

        private static void doktorBul() {
            System.out.println("Aradiginiz doktorun unvanini giriniz: ");
            input.nextLine();
            String unvan=input.nextLine();

            boolean flag=true;

            for (Map.Entry<String, String> w : doktorListesi.entrySet()) {

                if (w.getKey().equalsIgnoreCase(unvan)){
                    System.out.println(w.getKey()+" "+w.getValue());
                    flag=false;
                }
            }
            if (flag){
                System.out.println("Aradiginiz unvanda doktor yoktur...");
                doktorMenu();
            }

        }

        private static void doktorSil() {

            System.out.println("Silmek istediginiz doktorun unvanini giriniz: ");
            input.nextLine();
            String unvan=input.nextLine();

            boolean flag=true;

            try {
                for (Map.Entry<String, String> w : doktorListesi.entrySet()) {

                    if (w.getKey().equalsIgnoreCase(unvan)){
                        doktorListesi.remove(w.getKey());
                        System.out.println(doktorListesi);
                        flag=false;
                    }
                }
            } catch (Exception e) {

            }
            if (flag){
                System.out.println("Silmek istediginiz unvanda doktor yoktur...");

            }

        }
        private static void veriBankasiDoktorlariEkle(){
            for (int i = 0; i < unvanlar.length; i++) {
                doktorListesi.put(unvanlar[i],doctorIsimleri[i]+" "+doctorSoyIsimleri[i] );

            }
        }

    }

