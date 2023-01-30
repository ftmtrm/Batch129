package ssgler.ssg_if_nestedif;

import java.util.Scanner;

public class IfClass01 {

    public static void main(String[] args) {
        //girilen bir karakterin harf olup olmadigini bulan kodu yazdiriniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter =scan.next().toUpperCase().charAt(0);
        if(karakter>='A'&& karakter<= 'Z'){
            System.out.println("Girdiginiz karakter harftir");
        }else {
            System.out.println("Girdiginiz karakter harf degildir");
        }
        if ((karakter>='a' && karakter<='z')|| (karakter>='A' && karakter<'Z')){
            System.out.println("Harf");
        }else
            System.out.println("Harf degildir");
    }
}
