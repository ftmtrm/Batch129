package day12forloopwhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        //Ex1: 3'den 10'a kadar tamsayilari console'a yazdiriniz.

        //1.yol:
        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //2.yol:
        int i = 3;
        while (i < 7) { //genelde while kullanilir daha okunurdur.for ile farki yok ayni islevi yapar.
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        //Ex2:23'den 12'ye kadar cift tamsayilari yazdiriniz.

        int j = 23;
        while (j > 11){
            if (j % 2 == 0) {
                System.out.print(j+" ");
            }
        j--;
        }
        System.out.println();

        //Ex3:verilen bir tamsayinin rakamlari toplamini konsola yazdiran kodu yazdiriniz.

        //1.yol;while loop
        int num =578;
        int sum = 0;
        while (num>0){
            sum=sum+num%10;
            num/=10;
        }
        System.out.println(sum);

        //2.yol: for loop
        int a = 6841;
        int sum2 = 0;
        for (int k = a; k > 0; k/=10) {
            sum2=sum2+k%10;

        }
        System.out.println(sum2);





    }
}
