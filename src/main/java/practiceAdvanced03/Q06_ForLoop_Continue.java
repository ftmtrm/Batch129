package practiceAdvanced03;

import java.util.Scanner;

public class Q06_ForLoop_Continue {
    public static void main(String[] args) {
        /* Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        Not: 5 ve 10 dahil değil.*/

        Scanner input = new Scanner(System.in);
        int toplam = 0;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Bir tamsayi giriniz");
            int sayi = input.nextInt();
            if(sayi>5 && sayi<10){
                System.out.println("Girdiginiz sayi 5 ile 10 arasindadir. Toplama dahil olmayacaktir.");
                continue;
            }
            toplam+=sayi;
        }
        System.out.println("toplam "+toplam);
    }
}
