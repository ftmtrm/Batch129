package MyPractices;

import java.util.ArrayList;
import java.util.List;

public class JavaQuestionBank_Arka3 {
    public static void main(String[] args) {
        //Döngüleri kullanarak tamsayılardan oluşan bir listenin tüm öğelerinin benzersiz (tekrarsız)
        // olup olmadığını kontrol ediniz.
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(10);
        int counter = 0;
        ArrayList<Integer> yeniList = new ArrayList<>();
        for (Integer w : myList) {
            for (Integer k : yeniList) {
                if (w == k) {
                    counter++;
                }
            }
        }
        if (counter == myList.size()) {
            System.out.println("Tekrarlanan oge yoktur");

        } else {
            System.out.println("En az bir oge tekrarlanmistir.");
        }
    }
}


