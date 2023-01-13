package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        //Example 1:Time'i formatlayiniz.

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

        //hh==>12'lik saat sistemini kullanir.(hh-mm a) olarak yazilir.
        //HH==> 24'luk saat sistemi kullanir.("HH-mm") olarak yazilir am pm demicek ondan a yazmiyoruz.
        //("hh:mm:ss a") olarak yazarsak saniyeyi de gsoterir.

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh-mm a");//am pm yazdirmak icin a koyulur
        System.out.println(myTime);//01-43 pm verdi
    }
}
