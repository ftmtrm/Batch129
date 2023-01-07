package MyPractices;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Income {

        public static void main(String[] args) {

            List<String> gunler = new ArrayList<>();
            gunler.add("Pazartesi");
            gunler.add("Sali");
            gunler.add("Carsamba");
            gunler.add("Persembe");
            gunler.add("Cuma");
            gunler.add("Cumartesi");
            gunler.add("Pazar");

            List<Double> gunlukKazanclar = new ArrayList<>();
            //* 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.

            Scanner sc = new Scanner(System.in);
            int i = 0;
            while(i<7){
                System.out.println("Lutfen bir kazanc degeri giriniz...");
                double earning = sc.nextDouble();
                gunlukKazanclar.add(earning);
                i++;
            }

            double ortalamaKazanc = getOrtalamaKazanc(gunlukKazanclar);
            System.out.println("Ortalama kazanc: " + ortalamaKazanc);

            List<String> ortalamaninUstundeKazancGunleri = getOrtalamaninUstundeKazancGunleri(gunler, gunlukKazanclar, ortalamaKazanc);
            System.out.println("Ort Ustu Gunler: " + ortalamaninUstundeKazancGunleri);

            List<String> ortalamaninAltindaKazancGunleri = getOrtalamaninAltindaKazancGunleri(gunler, gunlukKazanclar, ortalamaKazanc);
            System.out.println("Ort Alti Gunler: " + ortalamaninAltindaKazancGunleri);


        }
        public static double getOrtalamaKazanc(List<Double> gunlukKazanclar) {
            double toplamKazanc = 0;
            for (Double w : gunlukKazanclar) {
                toplamKazanc += w;
            }
            return toplamKazanc / gunlukKazanclar.size();
        }
        public static List<String> getOrtalamaninUstundeKazancGunleri(List<String> gunler, List<Double> gunlukKazanclar, double ortalama) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < gunler.size(); i++) {
                if (gunlukKazanclar.get(i) > ortalama) {
                    result.add(gunler.get(i));
                }
            }
            return result;
        }
        public static List<String> getOrtalamaninAltindaKazancGunleri(List<String> gunler, List<Double> gunlukKazanclar, double ortalama) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < gunler.size(); i++) {
                if (gunlukKazanclar.get(i) < ortalama) {
                    result.add(gunler.get(i));
                }
            }
            return result;
        }

    }

