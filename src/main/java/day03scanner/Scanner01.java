package day03scanner;

import java.util.Scanner;

public class Scanner01 {
    // 1.adım:scanner classtan obje oluşturacağız 2. adım: kullanıcıdan ne istediğimize dair msj veriyoruz.
    // kullanıcıdan data alıp kodlarımızda kullanacağız.bunu scanner sayesinde yapar.
    //Objenin ismini input yaptım.çünkü  bu obje kullanıcıdan alınan datayı benim kodlarımın içine koyacak.
    //sytem.in kullanıcının verdiği datayı javanın sisteminin içine koymak demektir.
    //sonra aşağıda sout yapıp lutfen yasınızı girin yazdık.
    //3.adım: sonra input.nextByte ile kullanıcıdan datayı alıyoruz
    //sistemin içine sokmuş oluyoruz.
    //atama operatörü sayesinde ben bu datayı(37) age in içine koydum.

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen yasinizi giriniz...");
        byte age = input.nextByte();
        System.out.println(age);
    }


}
