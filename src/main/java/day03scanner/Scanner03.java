package day03scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //kullanıcıdan adresini alınız ve ekrana yazdırınız
        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen adresinizi giriniz...");
        String address= input.nextLine ();
        //kullanıcıdan çok kelimeli String almak için nextLine () methodu kullanılır.
        System.out.println(address);
    }
}
