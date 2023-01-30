package day28exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
       /*Kodlarin yazim asamasinda meydana gelen hatalara Compile Time Error(CTE) denir.
        Kodlari calistirdiktan sonra olusan hata tipine Run Time Error(RTE) denir.

        1) Number Format Exception://uygun olmayan formatta data verildiginde olusan hata turudur.
        //positive scenario(happy scenario) ya da negative scenario olabilir.
        hata verme ihtimali olan durumlarda Code==>Surround with==>Try catch sececegiz.
        (ctrl+alt+t kisa yolu)Integer.valueOf(str) icinde sayi disinda bisey varsa hata verebilir
        */
     //Bir String'i alip integer'a ceviren kodu yaziniz.

    String str = "123";//positive scenario
    int result =convertStringtoInteger(str);//String'i integer'a cevir.
        System.out.println((result)+5);

    String st = "123a";//negative scenario
        int result2 = convertStringtoInteger(st);
        System.out.println("result2+10 = " + result2+10);
    }

    private static int convertStringtoInteger(String str) {
        int i = 0;
        System.out.println("Burasi try bolumu "+i);
        try {
            i= Integer.valueOf(str);
        } catch (NumberFormatException e) {
            System.out.println("Rakam olmayan karakter iceren String'ler integer'a cevrilemez.");
        }
        return i;

    }
}
