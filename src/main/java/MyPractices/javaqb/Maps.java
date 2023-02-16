package MyPractices.javaqb;

import java.util.*;

public class Maps {
    /*Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
    bulunmaktadır. Ürünler arasında " Laptop " olup olmadığını kontrol etmek için kodu
    yazınız.*/
    public static void main(String[] args) {

        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        String expectedProduct = "Laptop";

        if (product.containsKey(expectedProduct)) {
            System.out.println(expectedProduct + " vardir");
        } else {
            System.out.println(expectedProduct + " yoktur");
        }

        /*Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
        bulunmaktadır. Ürün sayılarını artan sırada yazdırınız.*/

        Map<String, Integer> product2 = new HashMap<>();
        product2.put("Laptop", 82);
        product2.put("TV", 53);
        product2.put("Refrigerator", 12);
        product2.put("Music System", 87);
        product2.put("Mobile Phone", 53);
        Object[] product2Number = product2.values().toArray();
        Arrays.sort(product2Number);
        System.out.println(Arrays.toString(product2Number));
        //2.yol:
//       Collection<Integer> numofProducts=product2.values();
//       List<Integer>newlist=new ArrayList<>(numofProducts);
//        Collections.sort(newlist);
//        System.out.println(newlist);

        /*Bir String’ deki kelimelerin kaç defa tekrarlandığını ifade eden kod yazınız.
        (Büyük/küçük harfe duyarlı değil)*/
        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";
        s = s.replaceAll("\\p{Punct}","").toLowerCase();
        Map<String, Integer> wordOccurence = new HashMap<>();
        String[] words = s.split(" ");
        for(String w : words){
            Integer numOfOccurence = wordOccurence.get(w);
            if(numOfOccurence == null ){
                wordOccurence.put(w, 1);
            }else{
                wordOccurence.put(w, numOfOccurence+1);
            }
        }
        System.out.println(wordOccurence);

       /* Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir?*/
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);
        Map<Integer, Integer> myMap = new HashMap<>();
        for(Integer w : myList){
            Integer numOfOccurence2 = myMap.get(w);
            if(numOfOccurence2==null){
                myMap.put(w, 1);
            }else{
                myMap.put(w, numOfOccurence2+1);
            }
        }
        System.out.println(myMap);
        Collection<Integer> myValues = myMap.values();
        Integer counter = 0;
        for(Integer w : myValues){
            if(w>1){
                counter++;
            }
        }
        System.out.println("Tekrarlanan oge sayisi " + counter + " adettir");
    }
}
