package day07ifStatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {
        /*
        iki tane String datanin birbirine esit olup omadigini anlamak icin == kullanilmaz
        onun yerine "equals"methodu kullanilir.
        //Ex1: equals () ==> Buyuk kucuk harf onemser.
        equalsIgnoreCase () ==> buyuk kucuk harf onemsemez ayni kabul eder.
         */
        //Ex1:kullanicidan gun isimlerini aliniz ve h.ici mi h.sonu mu oldugunu yazdiran kodu olusturunuz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi = input.next();
        if(gunIsmi.equalsIgnoreCase("Cumartesi")||gunIsmi.equalsIgnoreCase("Pazar")){
            System.out.println("Haftasonu");

        }else if (gunIsmi.equalsIgnoreCase("Pazartesi")||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma")){
            System.out.println("Haftaici");

        }else {
            System.out.println("gecerli bir gun ismi giriniz");
        }

            //2.yol:
            boolean haftaici = gunIsmi.equalsIgnoreCase("Pazartesi")||
                    gunIsmi.equalsIgnoreCase("Sali") ||
                    gunIsmi.equalsIgnoreCase("Carsamba") ||
                    gunIsmi.equalsIgnoreCase("Persembe") ||
                    gunIsmi.equalsIgnoreCase("Cuma");

            boolean haftasonu = gunIsmi.equalsIgnoreCase("Cumartesi")||gunIsmi.equalsIgnoreCase("Pazar");
            if(haftaici){
                System.out.println("Haftaici");

            }else if(haftasonu){
                System.out.println("Haftasonu");
            }else {
                System.out.println("gecerli bir gun ismi giriniz");
        }

    }
}
