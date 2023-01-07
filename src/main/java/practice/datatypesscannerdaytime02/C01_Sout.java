package practice.datatypesscannerdaytime02;

public class C01_Sout {
    public static void main(String[] args) {
        /*
        \n ==> alt satira gecirir
        \t ==> bir tab bosluk birakir
        \b ==> gerisindeki ilk harfi siler
        \\ ==>  \ters slash prints a back slash
        \' ==> tek tirnak yazdirir.
        \" ==> cift tirnak yazdirir
        ctrl+alt+l ==> sayfayi duzenler
         */

        // TECHPRO EDUCATION kelimesini her bir harf alt alta gelecek sekilde console"da yazidiriniz.
        //1.yol:
        System.out.println("*******1.YOL*********");//uzun yol
        System.out.println("T");
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println(" ");
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");
        //2.yol:
        System.out.println("***************2.Yol**********");
        System.out.println("T\nE\nC\nH\nP\nR\nO\n\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");
        //ex: JAVA ILE GUZEL DUNYA ifadesinin her bir kelimesini alt satira yazdiran kodu tek bir sout ile yazdiriniz.
        System.out.println("JAVA\nILE\nGUZEL\nDUNYA");
        //ex2:JAVA ILE GUZEL DUNYA ifadesinin kelimeleri arasinda bir tab bosluk birakarak yazdiriniz.
        System.out.println("JAVA\tILE\tGUZEL\tDUNYA");

        //Ex3: "Techpro" ile Java cok 'kolay' yazdiran kodu yazdiriniz.
        System.out.println("\"Techpro\"\tile\tJava\tcok\t\'kolay\'");

        //Ex4: "  MAHARET" hic 'DUSMEMEK' degil;


        //  "Her dustugunde kalkabilmektir."
        //seklinde noktali virgulden sonra 3 satir alttan paragraf basi yaparak yazdiran kodu olusturunuz.

        System.out.println(" \"  MAHARET\" hic \'DUSMEMEK\' degil;\n\n\n\t\"Her dustugunde kalkabilmektir\"");


    }


}
