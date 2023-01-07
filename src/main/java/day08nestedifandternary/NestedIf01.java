package day08nestedifandternary;

import java.util.Scanner;

public class NestedIf01 {
    //Java nested if leri calistirirken cok zamana ihtiyac duyar.bu nedenle cok tercih edilmez.
    public static void main(String[] args) {
        //Ex1:kullanicidan 3 tane sayi aliniz. bu 3 sayinin ucgen olusturma durumunu kontrol edin.
        //eger ucgen ise "eskenar"ucgen olma durumunu kontrol edin
        //info: ucgen olma sarti: herhangi iki kenar toplami ucuncu kenardan buyuk olmali
        //herhangi iki kenar farki ucuncu kenardan kucuk olmali
       // a+b>c>a-b
        //a+c>b>a-c
        //b+c>a>b-c
        //a=b=c ise eskenar ucgen
        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz...");
        //double a = Math.abs(input.nextDouble());//kullanicinin neg.sayi verme ihtimaline karsi mutlak degerini aldik
        //double b = Math.abs(input.nextDouble());
        //double c = Math.abs(input.nextDouble());

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        boolean ucgenmi = (a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c));
//kullanicinin negatif sayi girmesini affetmiyorum

        if (a<=0 || b<=0 || c<=0){
            System.out.println("Ucgenin kenarlari negatif olamaz");
        }else if(ucgenmi) {
            System.out.println("Sen ucgensin");//outer if
            if (a==b && b==c && a==c){
                System.out.println("ucgen hem de eskenar ucgen");//inner if

            }else{
                System.out.println("Ucgen ama eskenar degil");

            }

        }else{
            System.out.println("sen ucgen degilsin");

        }

    }
}
