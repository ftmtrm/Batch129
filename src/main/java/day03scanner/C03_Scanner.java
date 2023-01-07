package day03scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

//EX 1: kullanıcıdan sayıları alarak toplama işlemi yaptıran kodu yazınız

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen toplanacak olan ilk sayiyi yaziniz");
        double sayi1= input.nextDouble();

        System.out.println("Lutfen toplanacak olan ikinci sayiyi yaziniz");
        double sayi2 = input.nextDouble();

        System.out.println(sayi1+sayi2);





    }


}
