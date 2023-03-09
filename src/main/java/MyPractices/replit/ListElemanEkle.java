package MyPractices.replit;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListElemanEkle {
    /*Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.
Array List:  siyah,mavi,kirmizi,beyaz en başa: **pembe**         mavi-kirmizi arasına **yesil**  renk eklenecek.*/
    public static void main(String[] args) {

        List<String> colours = new ArrayList<>();
                colours.add("siyah");
                colours.add("mavi");
                colours.add("kirmizi");
                colours.add("beyaz");
        colours.add(0,"pembe");
        colours.add(3,"yesil");
        System.out.println(colours);
        colours.add(colours.indexOf("mavi"),"turuncu");
        colours.remove("mavi");

        System.out.println(colours);

    }
}

