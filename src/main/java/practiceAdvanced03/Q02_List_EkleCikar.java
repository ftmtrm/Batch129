package practiceAdvanced03;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_EkleCikar {
    public static void main(String[] args) {
        //Kullanıcidan aldığınız bir sayıyı bir list'e ekleyen,
        // list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.

        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();


        while (true) {
            System.out.println("Ekleme yapmak icin: 'add'\n" +
                    "Guncellemek icin: 'set' \n" +
                    "Silmek icin 'remove'\n" +
                    "Cikmak icin 'break' komutunu giriniz.");
            String komut = input.next();

            if (komut.equalsIgnoreCase("add")) {
                System.out.println("Eklemek istediginiz tamsayiyi giriniz");
                list.add(input.nextInt());//yeni conteyner acmak yerine dogrudan listin icine yazdik
            } else if (komut.equalsIgnoreCase("set")) {
                System.out.println("Guncellemek istediginiz sayiyi giriniz");
                Integer guncellenecekSayi = input.nextInt();
               int guncellenecekIndex = list.indexOf(guncellenecekSayi); //int guncellenecekIndex = input.nextInt();
                System.out.println("Yerine eklemek istediginiz sayiyi giriniz");
                int yeniSayi = input.nextInt();//bazi durumlarda obje kullanmak gerekebilir
                // o durumda Wrapper class (Integer) kullanilmasi gerekir.
                list.set(guncellenecekIndex,yeniSayi);
            } else if (komut.equalsIgnoreCase("remove")) {
                System.out.println("Silmek istediginiz sayiyi giriniz");
                Integer silinecekSayi = input.nextInt();
                //Objectle calisrsa girdigimiz objeyi siler int olarak girersek onun indexinden siler
                list.remove(silinecekSayi);

            } else if (komut.equalsIgnoreCase("break")) {
                break;

            } else {
                System.out.println("Gecerli bir komut giriniz");

            }
            System.out.println(list);
        }
        System.out.println("Gule gule");

    }
}
