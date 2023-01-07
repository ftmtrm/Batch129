package day11loops;

public class C04_ForLoop {
    public static void main(String[] args) {
        //Ex1: 1'den 100'e kadar 6ile bolunenler haric tum tamsayilari ekrana yazdiriniz


        for (int i = 1; i < 101; i++) {
            if (i%6==0){
                continue;//bosver demek alma diyor yani 6'nin katlarini

            }
            System.out.print(i+" ");
        }
        System.out.println();

        //Interview question
        //size verilen bir String'i ters ceviren kodu yaziniz//Reverse Order!!!!!!ONEMLI
        String str = "Mustafa";
        String ters = "";//yeni bir conteyner olusturduk ters'ten yazilan harfleri koymak icin

        for (int i = str.length()-1; i >-1 ; i--) {
            char harf = str.charAt(i);
            //ters=ters+harf;bunun yerine alttaki tercih edilmeli
            ters+=harf;

        }
        System.out.print(ters);

    }
}
