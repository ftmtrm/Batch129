package MyPractices.zeynepQuestions;

import java.util.Scanner;

public class TasKagitMakas {
    public static void main(String[] args) {

        /* TASK:
         tas >makas
         makas >kagit
         kagit >tas

	Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
	Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
	While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
	Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
	Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
	Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
	En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
	dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.

	 */
    Scanner scan = new Scanner(System.in);

    int kullanici_puani = 0;
    int bilgisayar_puani = 0;
    String dewamkeee = "EVET";
    int kullanıcıSecim = 0;
    int count = 1;

    while (dewamkeee.equalsIgnoreCase("EVET")) {
        if (count == 1) {
            System.out.println("Tas kagit makas oyununa hos geldiniz :) ");
            System.out.println("1-Tas 2-Kagit 3-Makas");
        }
        System.out.println("Seciminiz : ");
        count = 0;
        kullanıcıSecim = scan.nextInt();
        int bilgisayarin_secimi = (int) (Math.random() * 3);
        if (kullanıcıSecim == 1) {
            if (bilgisayarin_secimi == 1) {
                System.out.println("Bilgisayarin secimi : Tas ===> Sonuc : Berabere");
                System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "
                        + bilgisayar_puani);
            } else if (bilgisayarin_secimi == 2) {

                System.out.println("Bilgisayarin secimi : Kagit ===> Sonuc : Kaybettiniz");

                bilgisayar_puani++;

                System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : " +

                        bilgisayar_puani);

            } else {

                System.out.println("Bilgisayarin secimi : Makas ===> Sonuc : Kazandiniz");

                kullanici_puani++;

                System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                        + bilgisayar_puani);
            }

        } else if (kullanıcıSecim == 2) {

            if (bilgisayarin_secimi == 1) {

                System.out.println("Bilgisayarin secimi : Tas ===> Sonuc : Kazandiniz");

                kullanici_puani++;

                System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                        + bilgisayar_puani);

            } else if (bilgisayarin_secimi == 2) {

                System.out.println("Bilgisayarin secimi : Kagit ===> Sonuc : Berabere");

                System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                        + bilgisayar_puani);

            } else {

                System.out.println("Bilgisayarin secimi : Makas ===> Sonuc : Kaybettiniz");

                bilgisayar_puani++;

                System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                        + bilgisayar_puani);
            }

        } else if (kullanıcıSecim == 3) {

            if (bilgisayarin_secimi == 1) {

                System.out.println("Bilgisayarin secimi : Tas ===> Sonuc : Kaybettiniz");

                bilgisayar_puani++;

                System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                        + bilgisayar_puani);

            } else if (bilgisayarin_secimi == 2) {

                System.out.println("Bilgisayarin secimi : Kagit ===> Sonuc : Kazandiniz");

                kullanici_puani++;

                System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                        + bilgisayar_puani);

            } else {

                System.out.println("Bilgisayarin secimi : Makas ===> Sonuc : Berabere");

                System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                        + bilgisayar_puani);
            }

        } else {

            System.out.println("Hatali giris yaptiniz, lutfen tekrar deneyiniz");

            continue;
        }

        if (kullanici_puani == 3) {

            System.out.println("Oyunu " + kullanici_puani + "-" + bilgisayar_puani + " kazandiniz");

            System.out.println("Oyun bitti, oyuna devam etmek istiyor musunuz : (EVET / HAYIR)");

            dewamkeee = scan.next();


            if (dewamkeee.equalsIgnoreCase("Evet")) {

                kullanici_puani = 0;

                bilgisayar_puani = 0;

                count = 1;
            }

        } else if (bilgisayar_puani == 3) {

            System.out.println("Oyunu " + bilgisayar_puani + "-" + kullanici_puani + " kaybettiniz");

            System.out.println("Oyun bitti, oyuna devam etmek istiyor musunuz : (EVET / HAYIR)");

            dewamkeee = scan.next();

            if (dewamkeee.equalsIgnoreCase("EVET")) {

                kullanici_puani = 0;

                bilgisayar_puani = 0;

                count = 1;

            }

        }

    }

}

}

