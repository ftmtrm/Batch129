package MyPractices.slaytlar01;

import java.util.Scanner;

public class DoWhileLoopSlaytlar04 {
    public static void main(String[] args) {
        //Q4:
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int counter2 =0;
        int sum = 0;
        do {
            System.out.println("lutfen bir sayi giriniz...");
            int number = input.nextInt();
            sum += number;
            if (number>0){
                counter++;

            }else if (number == 0) {
                System.out.println(counter + " adet pozitif sayi girdiniz");
                System.out.println(counter2 + " adet negatif sayi girdiniz");
                System.out.println("Girdiginiz pozitif sayilar toplami =" + sum + "dir");
                break;

            }else if (number < 0) {
                counter2++;
                System.out.println("Negatif sayi giremezsiniz");
                sum-=number;
                continue;
            }

            }while (true) ;

    }
}
