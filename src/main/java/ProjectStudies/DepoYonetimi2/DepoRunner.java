package ProjectStudies.DepoYonetimi2;

import java.util.Scanner;

public class DepoRunner {
    public static void main(String[] args) {
        start();
    }

    public static void start(){
        Scanner inp=new Scanner(System.in);
        DepoService service=new DepoService();
        int select;
        do {
            System.out.println("=== DEPO YONETIM PANELI ===");
            System.out.println("1- URUN TANIMLAMA");
            System.out.println("2- URUN LİSTELEME");
            System.out.println("3- DEPOYA URUN GİRİŞİ");
            System.out.println("4- URUNU RAFA KOYMA");
            System.out.println("5- DEPODAN URUN ÇIKIŞI YAPMA");
            System.out.println("6- DEPO SİSTEMİNDEN ÇIKIŞ");
            System.out.println("Depo Yonetim Paneline hosgeldiniz! Lutfen seciminizi yapiniz");
            select= inp.nextInt();
            switch (select){
                case 1:
                    service.urunTanimla();
                    break;
                case 2:
                    service.urunListele();
                    break;
                case 3:
                    service.urunGirisi();
                    break;
                case 4:
                    service.urunuRafaKoy();
                    break;
                case 5:
                    service.urunCikisi();
                    break;
                case 6:
                    service.cikis();
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz!");
                    break;
            }
        }while (select!=0);

    }
}
