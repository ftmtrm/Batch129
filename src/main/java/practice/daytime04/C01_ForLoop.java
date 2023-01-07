package practice.daytime04;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {

    /*kullanicidan aldiginiz bir String degerde 'c'den onceki 'a'
    harfinin String deger icerisinde kac kez gectigini bulan kodu yaziniz
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen String bir ifade veriniz");
        String str = input.nextLine().toLowerCase();
        int counter = 0;//memoryde yer acmak icin int counter; yazilamiyor
        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i) == 'a') {
                counter++;
            } else if (str.charAt(i) == 'c') {
                break;
            }
        }
        System.out.println("c oncesi 'a'larin sayisi = " + counter);
}
}

