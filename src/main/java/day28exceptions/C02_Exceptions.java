package day28exceptions;

public class C02_Exceptions {
   // 2)StringOutOfBounds Exceptions:


   public static void main(String[] args) {
       //Bir String'in istedigimiz indexteki datasini bize veren kodu yaziniz.
       //index 5 olmadigi icin indexoutofboundException verir.
       //terminalde kirmizi yazan yere "log akisi" denir.terminalde soft wrap aciksa cok fazla yazi olur

       char ch = getCharFromString("Hakan",5);
       System.out.println("ch = " + ch);
   }

    private static char getCharFromString(String str, int i) {
       char c = ' ';
        try {
            c = str.charAt(i);
        } catch (Exception e) {
            System.out.println("StringOutOfBounds Exception calisti olmayan elemani getiremedi.");
            System.out.println("kendi ekledigim e.getMessage calisti==>"+ e.getMessage());
        }
        return c;
    }




}
