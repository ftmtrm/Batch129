package day08nestedifandternary;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        //Ex1: kullanicidan iki sayi aliniz"buyuk olmayan"(kucuk veya esit olan) sayiyi yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi giriniz...");

        double a = input.nextDouble();
        double b = input.nextDouble();
        //1.yol: if else
        if(a<b){
            System.out.println(a);
        }else if (a>b){
            System.out.println(b);
        }else
            System.out.println("sayilar birbirine esit");

        //2.yol:ternary if else in yaptigi isi yapar.sadece sozdizimi farklidir.daha kisadir.
        //condition yaz ? koy condition true ise a kismi calisir. condition false ise b kismi calisir.
        double result = a<b ? a : b;//5<3 false oldugu icin ikinciyi alir sonuc olarak yani b'yi alir
        System.out.println(result);

    }
}
