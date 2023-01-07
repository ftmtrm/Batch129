package day07ifStatement;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {
        //if it rains, I will cancel the picnic.
        //Ex1: verilen char bir karakter alalim
        // verilen karakter buyuk harf ise ekrana "Buyuk Harf" yazdiran kodu olusturunuz

        char ch = 'S';
        if (ch>='A'&& ch<='Z'){//Java A ve Z harfinin ASCII degerini gorur.yani deger 65ile 90 arasindaysa calisir
            System.out.println("Buyuk Harf");
        }//if body

        //Ex2: verilen bir sayi cift sayi ise ekrana "Cift Sayi" yazdiran kodu olusturunuz.
        byte  number = 20;
        if (number%2 ==0) {

            System.out.println("cift sayi");
        }//if body

        //Ex3: verilen bir sayi 300'den kucuk veya 1200'den
        // buyuk ise ekrana "Harika Sayi" yazdiran kodu olusturunuz.

        int number2 = 210;
        if(number2<300 || number2>=1200){
            System.out.println("Harika Sayi");
        }
//Ex4: kullanicidan alinan sayinin tek mi cift mi oldugunu ekrana yazdiriniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int number3 = input.nextInt();
        //burada 2 kontrol yapildi. Javaya fazladan is yaptirmis oluyoruz o nedenle ikinci yol kullanilir.
        if(number3%2==0){
            System.out.println("cift sayi");
        }
        if(number3%2!=0) {
            System.out.println("tek sayi");
        }

            //2.yol:
            if(number3%2==0){
                System.out.println("cift sayi");


        }else { //else diger tum ihtimaller
                //burada conditional yok tek kontrol var. Javaya daha az is yaptirmis oluyoruz.
            System.out.println("tek sayi");
        }
            //Ex5: verilen bir sayinin negatif, pozitif ya da notr oldugunu soyleyen kodu yazdiriniz.
        int number4 = -85;
            if (number4<0){
                System.out.println("negatif sayi");

            }else if(number4==0){
                System.out.println("notr sayi");

            }else {
                System.out.println("pozitif sayi");
            }


    }//main method body

}//class body
