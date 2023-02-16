package mini_projects.Bilet_Bus_SuleHoca;

import java.util.Scanner;

public class Bilet {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int km = 0;
        int yas = 0;
        int yolculukTipi = 1;
        String plakaNumarasi = "16 AYD 768";
        System.out.println("Lutfen gideceginiz mesafeyi km cinsinden giriniz");
        km = input.nextInt();
        System.out.println("Lutfen yasinizi giriniz");
        yas = input.nextInt();
        System.out.println("Lutfen yolculuk tipini giriniz" + "Sadece gidis ise 1\n gidis-donus ise 2");
        yolculukTipi = input.nextInt();
        if(km>0 && yas>0 && (yolculukTipi==1 || yolculukTipi==2)){
            double biletUcreti = km*0.1;
            double yasIndirimOrani = 0;

            if(yas<12){
                yasIndirimOrani = 0.5;
            }else if (yas<24){
                yasIndirimOrani = 0.1;
            }else if (yas>65){
                yasIndirimOrani = 0.3;
            }
            biletUcreti-=biletUcreti*yasIndirimOrani;
            if(yolculukTipi==2){
                biletUcreti-=biletUcreti*0.2;
                biletUcreti*=2;
            }
            biletDokum(plakaNumarasi,km,yolculukTipi,biletUcreti,yasIndirimOrani);

        }else
            System.out.println("Hatali veri girdiniz...");

    }
    private static void biletDokum(String plakaNumarasi, int km, int yolculukTipi, double biletUcreti,double yasIndirimOrani) {
        System.out.println("==============Bilet Dokumu=============");
        System.out.println("Otobusun Plakasi "+ plakaNumarasi);
        System.out.println("Mesafe "+ km);
        System.out.println("Yolculuk tipi "+(yolculukTipi==1?"Tek Yon":"Gidis donus"));
        System.out.println("Bilet ucreti "+biletUcreti);
        slowPrint(".....Keyifli yolculuklar dileriz....",50);//yavas yazdirma methodu 50 nano saniye gecikmeyle
        System.out.println();
    }

    public static void slowPrint(String text, int delay) {//yavas yazdirma methodu olusturduk
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
