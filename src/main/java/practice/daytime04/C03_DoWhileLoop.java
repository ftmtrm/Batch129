package practice.daytime04;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*INTERVIEW Question
        adada yalniz yasayan bir maymun var hergun 4 muz yemesi gerekiyor
         o adada sadece 165 muz var maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz
         */
        int numberofbananas = 165;//4 8  12 .....164==>geriye 1 muz kaldi
        int survivaldays = 1;//1 2 3 .........41==> 42.gun oldu
        boolean monkeyalive = true;
        do{
            System.out.println("************* maymunlar gunde 4 muz yer*********");
            numberofbananas-=4;//toplam muz sayisindan hergun 4 muz eksiltir.
            System.out.println("Kalan muz sayisi "+numberofbananas);
            survivaldays++;
            if(numberofbananas<4){
                monkeyalive=false;
                System.out.println("Bugun "+survivaldays+ ".gun yeterli muz kalmadi maymun rahmetli");
                System.out.println("Maymun "+survivaldays+ ".gun rahmetli");

            }else {
                System.out.println("Bugun "+survivaldays+ ".gun; maymun hala yasiyor");
            }

        }while(monkeyalive);//do while
    }
}