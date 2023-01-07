package day10switchloops;

public class Loops01 {

    /*
    code standards
    1.tekrar(repetition) olmamalidir.
    2.dinamik olmalidir.
    3.tamir (fix) ve update kolay yapilabilmelidir.
     */
    public static void main(String[] args) {
        //EX1: Ekrana 5 kere "Hi" yazdiriniz.
        //1.yol:soutla 5kez yazmak==>tavsiye edilmez
        //2.yol:ayni adimlar tekrar tekrar yapilmasi gerektiginde looplar kullanilir.4 tane loop vardir.
        //for-loop, while-loop, do-while-loop, for-each-loop

        //for(baslangic degeri==>bir kere calistirilir;
        // loop'un calisma sarti==>cok calistirilir;increment/Decrement==>cok calistirilir)
        //1<6 ;asagida Hi yazdirdi i++ ile i=2 oldu sonra
        // i'nin degeri 3,4,5 olcak o kadar Hi yazdiracak 6 olunca calismaz 6<6 false verir loop kirilir.
        for(int i = 1;i<6; i++ ){
            System.out.println("Hi");

        }
        //Ex2: 11'den 44'e kadar tum tamsayilari ekrana yazdiran kodu yaziniz.
        for(int i= 11; i<45;i++){
            System.out.println(i);
        }
        //Ex3: 40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz
        for(int i = 40; i>22 ; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        }



    }


