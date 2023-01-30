package day29_Exceptions;

import java.io.FileInputStream;//io==>input output kutuphanesi
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_Exceptions {
    //skip() methodu
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream fis = new FileInputStream("src/main/java/day29_Exceptions/Exceptions");
            fis.skip(45);//45 bytelik data atlanildi.
            System.out.println("45 byte'lik data atlanildi");
            int i = fis.read();
            while (i != -1) {
                System.out.print((char) i);
                i = fis.read();
            }
        } catch (Exception e) {
            System.err.print("File path yanlis ya da dosya silinmis : " + e.getMessage());
        }

            System.out.println("Durmak yok yola devam");//devaminda application'in calistigini
            //gostermek icin yazdik
        }

    }

