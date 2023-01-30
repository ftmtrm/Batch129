package ssgler.arraylist;
import java.util.ArrayList;
import java.util.List;
public class ArrayList03 {
    public static void main(String[] args) {
       /*
       bir liste olusturun ve listede
       kac tane farkli elemanin oldugunu yazdirin
       */
        List<Integer> myList=new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(11);
        myList.add(89);
        myList.add(89);
        myList.add(65);
        myList.add(65);

        int toplam=0;
        System.out.println(myList);
        for (int i = 0; i < myList.size(); i++) {

            if (myList.indexOf(myList.get(i))==myList.lastIndexOf(myList.get(i)))
            {
                toplam++;
            }

        }System.out.println(toplam+((myList.size()-toplam)/2));

    }
}

