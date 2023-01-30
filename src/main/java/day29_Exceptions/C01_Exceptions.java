package day29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;//genel oldugu icin parent oldugu anlasiliyor specific olanlar child olur

public class C01_Exceptions {
    public static void main(String[] args) throws IOException{//FileNotFoundException,NumberFormatException
        //eklenebilir
        // 6) FileNotFoundExceptions

        FileInputStream fis = new FileInputStream("src/main/java/day29_Exceptions/Exceptions");
        //dosya yolunu degistirirsek filenotfoundexception veriyor
        //bilgisayrdan tamamen silersek bulamaz catch'in icine yazdiklarimiz calisir.

        int i;
        try {
            while((i=fis.read()) != -1){
                //read'in altini kirmizi cizdi.sag tiklayip more actionsdan bakicaz

                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            System.err.print("Path is wrong or the file does not exist : "+e.getMessage());
            e.printStackTrace();
        }
    }

}
