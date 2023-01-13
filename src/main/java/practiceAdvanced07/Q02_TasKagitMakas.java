package practiceAdvanced07;

import java.util.Scanner;

public class Q02_TasKagitMakas {
    /*-Oyuncudan tahmin alınız.
	  -Bilgisayarın tahmini ile karşılaştırınız.
      -3'e ilk ulaşan kazanır
      -3 farkla kazanan Altın Skor, 2 farkla kazanan Gümüş Skor, 1 farkla kazanan bronz Skor ile kazanır.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oyuncuKazanmaSayisi = 0;
        int bilgisayarKazanmaSayisi = 0;
        int sayac = 0;

        while (oyuncuKazanmaSayisi < 3 && bilgisayarKazanmaSayisi < 3) {
            sayac++;
            System.out.println("Secim yap : \nTas \nKagit \nMakas");
            String oyuncuTahmini = input.next().toLowerCase();

            if (!(oyuncuTahmini.equals("tas") || oyuncuTahmini.equals("kagit") || oyuncuTahmini.equals("makas"))) {
                System.out.println("gecerli bir tahmin giriniz");
                sayac--;
                continue;
            }

            String[] arr = {"Tas", "Kagit", "Makas" };
            String bilgisayarTahmini = arr[(int) (Math.random() * 3)].toLowerCase();

            if (oyuncuTahmini.equals(bilgisayarTahmini)) {
                System.out.println("\nBerabere! skor: " + oyuncuKazanmaSayisi + "--" + bilgisayarKazanmaSayisi);

            } else if (oyuncuTahmini.equals("tas") && bilgisayarTahmini.equals("makas") || oyuncuTahmini.equals("kagit") && bilgisayarTahmini.equals("tas") || oyuncuTahmini.equals("makas") && bilgisayarTahmini.equals("kagit")) {
                oyuncuKazanmaSayisi++;
                System.out.println("\nKazandiniz! skor: " + oyuncuKazanmaSayisi + "--" + bilgisayarKazanmaSayisi);

            } else {
                bilgisayarKazanmaSayisi++;
                System.out.println("\nBilgisayar kazandi! Skor: " + oyuncuKazanmaSayisi + "--" + bilgisayarKazanmaSayisi);
            }
        }
        System.out.println("===GAME OVER===");
        String skor;
        if (oyuncuKazanmaSayisi == 3) {
            if (bilgisayarKazanmaSayisi == 0) {
                skor = "Altin";
            } else if (bilgisayarKazanmaSayisi == 1) {
                skor = "Gumus";
            } else {
                skor = "Bronz";

            }
            System.out.println(skor + "skor ile kazandiniz");

        } else {
            if (oyuncuKazanmaSayisi == 0) {
                skor = "Altin";
            } else if (oyuncuKazanmaSayisi == 1) {
                skor = "Gumus";
            } else {
                skor = "Bronz";
            }
            System.out.println("Bilgisayar " + skor + " skor ile kazandı.");
        }

    }
}