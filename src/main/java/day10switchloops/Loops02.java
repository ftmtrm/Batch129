package day10switchloops;

public class Loops02 {
    public static void main(String[] args) {
        //Example1: 21'den 180'e kadar hem 4 hem de 6 ile bolunebilen tamsayilari ekrana yazdiran kodu yazdiriniz.
        for (int i = 21; i < 181; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
        //Example2: size verilen kucuk harfle yazilmis String'in indexi cift sayi olan
        // karakterlerini buyuk harf yapiniz
        //note: yazdiginiz kod belli senaryolar icin calisiyor
        // tum senaryolar icin calismiyorsa bu koda "hardcode" denir/
        //hardcode yanlis yazilmis koddur,mutlaka duzeltilmelidir.
        //note:Bir String'te son index = lenght()-1

        String s = "ankara";//lenght ()=6 index 5'tir.

        for (int i = 0; i<s.length();i++){
            String ch = s.substring(i,i+1);
            if (i%2==0){
                ch.toUpperCase();
                System.out.println(ch.toUpperCase());
            }
        }




    }
}
