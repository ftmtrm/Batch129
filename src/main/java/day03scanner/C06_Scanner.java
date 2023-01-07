package day03scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan aldığınız şekil ile aşağıdaki gibi bir görsel oluşturunuz

        /*
        A    // 5 karakter var bosbosAbosbos
       A A   //5 karakter var bosAbosAbos
      A A A //5 karakter var  AbosAbosA

         */
        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen bir karakter giriniz");

        char ch= input.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);
        //  /n alt satıra atar
        //ctrl+z kodu geri alır
        //  /t bir tab boşluk bırakır
        //ctrl+alt+l classı düzenler
        // /b gerisindeki ilk harfi siler
        // ctrl+d çoğaltır

    }

}
