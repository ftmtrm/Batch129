package day28exceptions;

public class C04_Exceptions {

    //4)NullPointerExceptions:

    //Bir String'te bulunan karakter sayisini veren kodu yaziniz.

    public static void main(String[] args) {
        String str = "Fatma";
        String str2 = "";
        String str3 = null;

        getNumOfChars(str);//5
        getNumOfChars(str2);//0
        getNumOfChars(str3);//NullPointerException verdi

    }

    private static void getNumOfChars(String str3) {
        try {
            System.out.println(str3.length());//NullPointerException verdi
        } catch (NullPointerException e) {
            System.err.println("Length() hata olustu");
            e.printStackTrace();
        }
    }
}
