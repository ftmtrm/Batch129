package day10switchloops;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //Ex1: Ay numarasini soyleyince numrasini verilen aydan baslayip
        // 12.aya kadar tum aylarin isimlerini yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Baslangic ayinin kacinci ay oldugunu giriniz...");
        int numOfMonth = input.nextInt();
        //Switch'de string,int,byte,short,char data typelari kullanilabilir.long,float,boolean,double kullanilmaz
        switch (numOfMonth) {
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
                //burada break yazilmazsa kullanici gecerli ay numarasi girdigi halde sonda
            // "Gecerli bir ay numarasi veriniz" yazar
            default:
                System.out.println("Gecerli bir ay numarasi veriniz");
        }
    }
}
