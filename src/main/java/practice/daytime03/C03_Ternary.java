package practice.daytime03;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        //kullanicidan bir karakter girmesini isteyin
        //karakter harf ise kucuk harf olup olmadigini kontrol ediniz
        //karakter buyuk harf ise ekrana ""Buyuk harf"
        //karakter kucuk harf ise ekrana "kucuk harf"
        //harf degilse ekrana harf degil yazdiriniz.
        //97:a   122:z ascii degerleri
        //ASCII verilmeseydi char a = 'a'
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char ch = input.next().charAt(0);
        System.out.println("****Ternary****");
        boolean harfMi = (ch<='z' && ch>='a') || (ch<='Z' && ch>='A');
        boolean kucukHarf = (ch<='z' && ch>='a');
        
        String result = (harfMi) ? kucukHarf ? "Kucuk Harf" : "Buyuk Harf"   :"Harf Degil";
        System.out.println("result = " + result);
        
    }
}
