package MyPractices;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {

         /*Question_1: Kullanicidan bir tamsayi isteyin sayi tek ise console'a tek tamsayi, cift ise cift tamsayi yazdirin.
         Question_2: Kullanicidan bir tam sayi isteyin sayi negatif ise console'a negatif tamsayi
         pozitif ise pozitif tamsayi yazdirin
          */
        // 1.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int num = input.nextInt();
        String result = num%2==0 ? "cift tamsayi": "tek tamsayi";
        System.out.println(result);
        System.out.println();

        // 2.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int num2 = input.nextInt();
        String result2 = num2<0 ? "negatif tamsayi": "pozitif tamsayi";
        System.out.println(result2);

    }
}






