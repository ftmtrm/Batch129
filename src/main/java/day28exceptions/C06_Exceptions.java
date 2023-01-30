package day28exceptions;

public class C06_Exceptions {

    public static void main(String[] args) {

        //verilen bir String'i integer'a ceviriniz.Integer'i karakter sayisina bolunuz.

        //Parent EXCEPTION butun hatalari yakalar.
        // ustteki catch'in icine sadece numberFormatException'i yazalim
        // asagidaki catch'in icine ise
        // sadece Exception yazalim o zaman parent exception diger tum exceptionlar icin calisir
        
        double d = divideString("123k");
        System.out.println(d);
    }
    private static double divideString(String str) {
        int length = str.length();//nullPointerException,
        int length2 = str.length();// NumberFormatException
        int length3 = str.length();//Arithmetic Exception
        int i = 0;
        double sonuc = 0;
        try {
            length = str.length();
            i = Integer.valueOf(str);
            sonuc = i/length;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException verdi " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException verdi " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException verdi " + e.getMessage());

        }
        return sonuc;
    }



}
