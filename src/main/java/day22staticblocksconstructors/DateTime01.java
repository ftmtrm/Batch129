package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {

        Date myDate = new Date();
        System.out.println("myDate = " + myDate);
        System.out.println("myDate.getTime() = " + myDate.getTime());

        //gettime 1 ocak 1970'den bu yana kadarki milisaniyeleri verir
        //unique bir sayi elde edilmek istenildiginde kullanilir.
        //icinde bulundugumuz an nasil alinir? Local Date kullanilir
        //zaman icinde LocalTime kullanilir.
        //hem saat hem tarihi ogrenmek icin LocalDateTime kullanilir.

        System.out.println("LocalDate.now() = " + LocalDate.now());//2023-01-07
        System.out.println("LocalTime.now() = " + LocalTime.now());//23:36:32.335048200
        System.out.println(LocalDateTime.now());//2023-01-07T23:36:32.336047300

        // Dunyanin herhangi bir saat dilimindeki saati nasil aliriz?
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Paris")));//2023-01-07T21:44:16.310803100
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow")));

        //ileriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));

        //Geri bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));

        //ileriki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().plusHours(3));

        //Geri bir zamana nasil gidilir?
        System.out.println(LocalTime.now().minusMinutes(45));

        //Zamanda belli bir bolumu nasil aliriz?
        System.out.println(LocalTime.now().getHour() + ":"+ LocalTime.now().getMinute());//16:2

        //Tarihte belli bir bolumu nasil aliriz?
        System.out.println(LocalDate.now().getMonth() + ":" + LocalDate.now().getDayOfMonth());//1:7

        //Iki tarih nasil karsilastirilir?
        //02/13/2005 - 03/01/2007
      boolean result = LocalDate.of(2005,02,13).isBefore(LocalDate.of(2007,03,01));
        System.out.println("result = " + result);
        boolean result2 = LocalDate.of(2005,02,13).isAfter(LocalDate.of(2007,03,01));
        System.out.println("result2 = " + result2);

        //Tarihlerin formatlari nasil degistirilir?
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //M tek rakamla ay nosunu yazar
        //MM iki rakamla ay nosunu yazar.
        //MMM yazarsak Jan yazar
        //MMMM January yazar.
        //kucuk m'ler dakika icin kullaniliyor ondan aylar buuk M ile yaziliyor.
        //d tek rakamla gun nosunu yazar.
        //dd iki rakamla gun nosunu yazar
        //yy yaparsak 23 yazar yilin son iki rakamini yazar


        System.out.println(dtf.format(LocalDateTime.now()));


    }

}