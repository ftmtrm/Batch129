package MyPractices.interviewQuestions;

import java.util.Scanner;

public class PinKodu {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String pin = "fatos2904";
        int girisHakki = 5;

        while (true) {
            System.out.println("*****Hosgeldiniz*****");
            System.out.println("Lutfen pin kodunuzu giriniz");
            String girilenPin = scan.nextLine();

            if (pin.equalsIgnoreCase(girilenPin)) {
                System.out.println("Basarili bir sekilde giris yaptiniz");
                break;

            } else {
                System.out.println("Yanlis giris yaptiniz lutfen tekrar deneyiniz");
                girisHakki--;
                System.out.println(girisHakki + "hakkiniz kaldi");
            }
            if (girisHakki == 0) {
                System.out.println("Giris hakkiniz kalmamistir.Sim kartiniz bloke olmustur.");
                break;
            }

        }
    }
}