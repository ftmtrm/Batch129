package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        /* Ex1: kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        3==>3*1=3   3*2=6.........3*10=30

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz ");
        double num =input.nextDouble();
        int i = 1;
        while (i <11) {
            System.out.println(num + "x" + i + "=" + (num * i));
            i++;
        }
        //Ex2: Verilen bir String'te her harfin sonrasina yildiz sembolunu ekleyiniz
        // java==> J*a*v*a
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz ");
        String word = scan.next();
        String newWord ="";
        int k= 0;
        while (k<word.length()){
            newWord=newWord+word.charAt(k) + "*";//newWord+= word.charAt(k)+"*" seklinde de olur.
            k++;

        }
        System.out.println(newWord);

        }
    }

