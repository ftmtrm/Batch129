package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop03 {
    public static void main(String[] args) {
        /*
        Ex2: Asagidaki sekli cizen kodu yaziniz
           * * * *
           * * *
           * *
           *
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisi giriniz");
        int row = input.nextInt();
        for (int i = 1; i <=row ; i++) {
            for (int j = row; j >=i ; j--) {//4 yildiz var 4 satir ondan baslangic degeri row olcak
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
