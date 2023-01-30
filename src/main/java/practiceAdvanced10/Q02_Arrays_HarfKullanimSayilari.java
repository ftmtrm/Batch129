package practiceAdvanced10;

import java.util.Arrays;

public class Q02_Arrays_HarfKullanimSayilari {
    public static void main(String[] args) {
        /*Girilen String'de hangi harfin kaç kere kullanıldığını yazan bir kod yazınız.
        Input: String str = "Java is so Good";
        Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1"*/
        String str = "Java is so Good";
        String arr[] = str.split("");
        String sonuc="";
        int kullanimSayisi;
        for (String w : arr) {
            kullanimSayisi = 0;
            for (String u : arr) {
                if (w.equals(u)) {
                    kullanimSayisi++;
                }
            }
            if(!sonuc.contains(w)){
                sonuc+=w+kullanimSayisi+" ";
            }
        }
        System.out.println("sonuc = " + sonuc);
    }
}