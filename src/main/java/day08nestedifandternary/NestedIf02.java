package day08nestedifandternary;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {
        //Ex2:kullanicidan bir ucgenin kenar uzunlugunu aliniz
        //uc kenari birbirne esit ise "eskenar ucgen" yazdiriniz
        //sadece iki kenar birbirine esitse "ikizkenar ucgen" yazidiriniz
        //tum kenarlari birbirinden farkli ise "cesitkenar ucgen" yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz...");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        boolean ucgenmi = (a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c));
      if (a<=0 || b<=0 || c<=0){
          System.out.println("gecerli kenar uzunlugu giriniz");
      } else if(ucgenmi){
        if(a==b && b==c && a==c){
            System.out.println("eskenar");
        } else if(a==b || b==c ||a==c) {
            System.out.println("ikizkenar");


        }else {
            System.out.println("cesitkenar");
        }
        }else {
        System.out.println("ucgen degil");
    }


    }
}
