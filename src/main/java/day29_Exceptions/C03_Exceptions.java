package day29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_Exceptions {
    public static void main(String[] args) throws IOException {// child gitti parent geldi kaygisini giderdi
        //artik kirmizi cizmiyor.

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/main/java/day29_Exceptions/Exceptions");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        System.out.println("Kullanilabilir byte sayisini bize verir."+fis.available());//6795
        fis.read();
        fis.read();
        fis.read();//dosyadan toplam 3 byte'lik data okudu.
        System.out.println("Kullanilabilir byte sayisini bize verir."+fis.available());//6792


    }



}
