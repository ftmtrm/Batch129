package day03scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //ex: kullanıcıdan alacağınız beş basamaklı bir sayının ilk iki ve son iki
        // basamağındaki rakamları toplamını yazdıran kodu yazınız
        //input objesi oluşturulcak input 12345== ise output bu olur 1+2+4+5=12

        Scanner input= new Scanner (System.in);
        System.out.println("Lutfen 5 basamaklı bir sayi giriniz");

        int num = input.nextInt();//12345
        int ilkIkiRkm=num/1000;
        System.out.println("ilkIkıRkm");

        int ilkIkiTop=(ilkIkiRkm % 10)+(ilkIkiRkm/10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);

        int sonIkiRkm = num % 100;//45
        System.out.println("sonIkiRkm = "+sonIkiRkm);

        int sonIkiTop = (sonIkiRkm%10)+(sonIkiRkm/10);
        System.out.println("sonIkiTop= "+sonIkiTop);

        int toplam=ilkIkiTop+sonIkiTop;
        System.out.println("toplam= "+toplam);




    }


}
