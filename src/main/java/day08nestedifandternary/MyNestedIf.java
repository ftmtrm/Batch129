package day08nestedifandternary;

import java.util.Scanner;

public class MyNestedIf {
   // Ex1:kullanicidan 3 tane sayi aliniz. bu 3 sayinin ucgen olusturma durumunu kontrol edin.
    //eger ucgen ise "eskenar"ucgen olma durumunu kontrol edin
    //info: ucgen olma sarti: herhangi iki kenar toplami ucuncu kenardan buyuk olmali
    //herhangi iki kenar farki ucuncu kenardan kucuk olmali
    // a+b>c>a-b
    //a+c>b>a-c
    //b+c>a>b-c
    //a=b=c ise eskenar ucgen
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("ucgenin kenarlari icin 3 tane uzunluk giriniz");
       double x = input.nextDouble();
       double y = input.nextDouble();
       double z = input.nextDouble();

       boolean ucgenmi = (x+y>z && z>Math.abs(x-y) && (x+z>y && y>Math.abs(x-z)) && y+z>y && z>Math.abs(y-z));
       if(x<=0 || y<=0 || z<=0) {
           System.out.println("ucgenin kenarlari neg.olamaz");
       }else if (ucgenmi){
           System.out.println("sen ucgensin");

           if(x==y && y==z && x==z){
               System.out.println("ucgen hem de eskenar ucgen");

           }else {
               System.out.println("ucgen ama eskenar degil");
           }

       }else{
               System.out.println("sen ucgen degilsin");
           }

   }

}
