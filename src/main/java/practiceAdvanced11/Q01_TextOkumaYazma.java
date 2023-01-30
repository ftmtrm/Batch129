package practiceAdvanced11;

import java.io.*;

public class Q01_TextOkumaYazma {
    //Bir text dosyasındaki her satırın kelime sayısını o dosyada her satırın sonuna yazdıran bir kod yazınız.
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/main/java/practiceAdvanced11/file");
        BufferedReader br = new BufferedReader(fr);
        String satir = br.readLine();//ilk satiri aldik
        String yeniDosya = "";


        while (satir != null) {
            yeniDosya += satir + " ==> satir kelime sayisi: " + satir.split(" ").length + "\n";
            satir = br.readLine();//bir sonraki satira gecmek icin yazdik
        }
        System.out.println("yeniDosya = " + yeniDosya);
        //System.out.println("satir = " + satir);//burda yazdirisak null verir bittigi icin satirlar
        br.close();
        FileWriter writer = new FileWriter("src/main/java/practiceAdvanced11/file");
        writer.write(yeniDosya);
        writer.close();
    }
}


