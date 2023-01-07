package MyPractices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaQuestionBank_Arka2 {
    public static void main(String[] args) {
        //String bir listede verilen tüm fiyatların toplamını bulunuz.
        //Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04

        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$54.45");
        double sum = 0;
        for (String w : myList) {
            double price = Double.valueOf(w.replace("$",""));
            sum+=price;
        }
        System.out.println(sum);

        //Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
        List<String> myList2 = new ArrayList<>();
        myList2.add("$12.99");
        myList2.add("$23.60");
        myList2.add("$8.25");
        myList2.add("$54.45");
        List<Double> decimalList = new ArrayList<>();
        for(String w : myList2) {
            Double price = Double.valueOf(w.replace("$", ""));
            decimalList.add(price);
        }
        Collections.sort(decimalList);
        Double sum1 = decimalList.get(0)+ decimalList.get(decimalList.size()-1);
        System.out.println(sum1);


    }
}
