package day03scanner;

import java.util.Scanner;

public class C02_Scanner {

    //Scanner classi kullanıcı ile etkileşim kurmamizi saglar
    //Scanner bir Classtır. Java util kutuphanesinden getirldiği için import ister.

    public static void main(String[] args) {
        //kullanıcıdan data almak için
        //1.adim Scanner Classından object oluşturun
        Scanner input= new Scanner(System.in);
        //Scanner scan new Scanner (System.in); şeklindede yazılabilir.

        //2.adim kullanıcıya ne yapacağını söyle
        System.out.println("Lutfen yaşinizi giriniz");

        //3.adim kullanıcıdan aldığınız datayı variable içine koyun
        byte age= input.nextByte();
        //kullanıcıya ad, memleket, yaş, boy, yaşadığı yeri sevip sevmediğini soran bir program yazınız

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scan.nextLine();//kullanıcıdan string bir deger istedik ve nextline seçtik
        System.out.println("Lutfen memleketinizi giriniz....");

        String memleket = scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz.....");
        int yas=scan.nextInt();

        System.out.println("Lutfen boyunuzu giriniz");
        short boy= scan.nextShort();

        System.out.println("Lutfen yasadiginiz yeri sevip sevmedigini yaziniz");
        boolean seviyorMu = scan.nextBoolean();

        System.out.println("******************");
        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);





    }



}
