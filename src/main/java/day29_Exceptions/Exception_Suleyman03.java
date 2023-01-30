package day29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception_Suleyman03 {
    public static void main(String[] args) {

        try {

            FileInputStream fis = new FileInputStream("src/main/java/day29_Exceptions/Exceptions");

            int k = 0;

            while((k= fis.read()) != -1 ){
                //tek tek her karakteri okudugu icin java'yi cok yorar.satir satir okuma daha mantikli olur.
                //loop her dondugunde bir satiri okur.Buffer Reader

                System.out.print((char)k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the file does not exist");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        System.out.println("Hi!");

    }

}

