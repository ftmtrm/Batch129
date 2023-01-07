package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {
        /* OYUN!!!
        Kullanicidan bir tamsayi aliniz.
        tamsayi 100'den kucuk ise kullaniciya "kaybettiniz" msji vererek oyunu sonlandiriniz
        tamsayi 100 ve 100'den buyuk ise kullaniciya "kazandiniz" msji vererek oyunu devam ettiriniz.
         */
        Scanner input = new Scanner(System.in);
        int num = 0;
        do{
            System.out.println("Bir sayi giriniz...");
            num = input.nextInt();
            if(num>=100){
                System.out.println("Kazandiniz!");
            }
        }while (num>=100);
        System.out.println("Kaybettiniz!");

    }
}
