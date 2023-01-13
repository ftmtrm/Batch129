package MyPractices.replit;

import java.util.Scanner;

public class TerstenSayi {
    public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);
            System.out.print("Dort basamakli bir sayı giriniz: ");
            int sayi = scanner.nextInt();

           int i = 1;
       while(sayi<10000 && i<5) {
          int tersSayi = (sayi%10);
                  sayi/=10;

           System.out.print(tersSayi);
           i++;
        }


        /*Scanner scan = new Scanner(System.in);
        System.out.print("Sayıyı girin: ");
        int sayi1 = scanner.nextInt();


        int terstenSayi = 0;
        while (sayi1 != 0) {
            int sonRakam = sayi1 % 10;
            terstenSayi = terstenSayi * 10 + sonRakam;
            sayi /= 10;
        }
        System.out.println("Tersten sayı: " + terstenSayi);*/

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int reNum=input.nextInt();
        reNum=Math.abs(reNum);

        while (reNum>0){
            System.out.print(reNum%10);
            reNum/=10;

        }
        System.out.println();

    }


}
            







