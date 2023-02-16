package ProjectStudies.Hastane_ProjectStudy_Map;

    import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class HastaIslemler extends VeriBankasi{

        static Scanner input=new Scanner(System.in);

        static Map<Integer ,String> hastaListesi = new HashMap<>();

        static int hastaID=107;

        public static void hastaMenu(){

            System.out.println("==============HASTA MENUSU==============");
            System.out.println("1-Hasta Ekle\n" +
                    "2-Hasta Listesi\n" +
                    "3-Hasta Durumu Listesi\n" +
                    "4-Hasta Silme\n" +
                    "5-Hasta Bulma\n" +
                    "6-Verileri Yukle\n" +
                    "7-Ana Menu\n" +
                    "8-Cikis ");

            int secim=input.nextInt();

            switch (secim) {
                case 1:
                    hastaEkle();
                    hastaMenu();
                    break;
                case 2:
                    hastaListesi();
                    hastaMenu();
                    break;
                case 3:
                    hastaDurumuListesi();
                    hastaMenu();
                    break;
                case 4:
                    hastaSil();
                    hastaMenu();
                    break;
                case 5:
                    hastaBul();
                    hastaMenu();
                    break;
                case 6:
                    veriBankasiHastalariEkle();
                    hastaMenu();
                    break;
                case 7:
                    HastaneIslemler.hastaneMenusu();
                    break;
                case 8:
                    System.out.println("Sistemden cikis yapiliyor...");
                    break;
                default:
                    System.out.println("Gecerli bir deger giriniz...");
                    hastaMenu();
                    break;

            }
        }

        private static void hastaEkle() {

            System.out.println("Hasta adi giriniz: ");
            input.nextLine();
            String isim= input.nextLine();
            System.out.println("Hasta soyadi giriniz: ");
            String soyIsim=input.nextLine();
            System.out.println("Hasta durumu giriniz: ");
            String durum=input.nextLine();
            boolean aciliyet;
            if (durum.toLowerCase().contains("kalp")||durum.toLowerCase().contains("beyin kanamasi")){
                aciliyet=true;
            }else {
                aciliyet=false;
            }
            hastaListesi.put(hastaID,isim+" "+soyIsim+", " +durum+ ", Aciliyet: "+aciliyet);
            System.out.println(hastaListesi);
            hastaID++;


        }

        private static void hastaListesi() {
            for (Map.Entry<Integer, String> w : hastaListesi.entrySet()) {
                System.out.println(w.getKey()+" "+w.getValue());
            }
        }

        private static void hastaDurumuListesi() {
            for (Map.Entry<Integer, String> w : hastaListesi.entrySet()) {
                System.out.println(w.getValue().substring(0,w.getValue().indexOf(", Aciliyet")));
            }
        }

        private static void hastaSil() {
            System.out.println("Silmek istediginiz hastanin ID'sini giriniz: ");
            int ID=input.nextInt();

            boolean flag=true;

            for (Integer w : hastaListesi.keySet()) {
                if (w==ID){
                    hastaListesi.remove(w);
                    flag=false;
                }
            }
            if (flag){
                System.out.println("Aradiginiz ID'ye ait hasta bulunmamaktadir...");
            }
        }

        private static void hastaBul() {

            System.out.println("Bulmak istediginiz hastanin ID'sini giriniz: ");
            int ID=input.nextInt();

            boolean flag=true;

            for (Map.Entry<Integer, String> w : hastaListesi.entrySet()) {
                if (w.getKey()==ID){
                    System.out.println(w.getKey()+" "+w.getValue());
                    flag=false;
                }
            }
            if (flag){
                System.out.println("Aradiginiz ID'ye ait hasta bulunmamaktadir...");
            }

        }

        private static void veriBankasiHastalariEkle() {

            boolean aciliyet;
            for (int i = 0; i < hastaIsimleri.length; i++) {

                if (durumlar[i].toLowerCase().contains("kalp")){
                    aciliyet=true;
                }else {
                    aciliyet=false;
                }
                hastaListesi.put(hastaIDleri[i],hastaIsimleri[i]+" "+hastaSoyIsimleri[i]+", "+durumlar[i]+", Aciliyet: "+aciliyet );
            }

        }

    }

