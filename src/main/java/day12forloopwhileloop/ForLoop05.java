package day12forloopwhileloop;

public class ForLoop05 {
    public static void main(String[] args) {
        //hic sayi kullanmadan 1'den 100'e kadar olan sayilari console'a yazdiriniz
        for (int i = 'd' / 'd'; i <= 'd'; i++) {
            System.out.print(i + " ");

        }
        // note1:Bazi looplar hic calismayabilir
        for (int i = 1; i < 0; i--) {//false oldugu icin loop kirilir calismaz. zero execution
            System.out.println("Hi!");
        }
        //note2: bazi looplar sonsuz kez calisabilir.bu tarz looplara infinite loop denir.
        //bu genelde increment decrement kisminda yapilan hatadan kaynaklanir.

            /*for(int i= 1; i<10; i--){
                System.out.println("Java is money...");

        }//loop olusturdugunuzda ikinci kismi yazmazsaniz infinite loop olur.

            for (int i = 1; ; ) {
                System.out.println("Hi!");*/


    }
    }

