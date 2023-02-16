package MyPractices.javaqb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_DescendingOrder {
    public static void main(String[] args) {
        /*Check if elements are in descending order in a list
        Example: (Yellow, Blue, Red, Green) ==> Output: It is not in descending order
                 (Yellow, Red, Green, Blue) ==> Output: It is in descending order*/
        List<String> e = new ArrayList<>();
        e.add("Yellow");
        e.add("Red");
        e.add("Green");
        e.add("Blue");
        List<String> f = new ArrayList<>();
        f.addAll(e);
        Collections.sort(f);
        System.out.println(e);
        System.out.println(f);
        int size = e.size();
        int flag = 0;
        for (int i = 0; i < size; i++) {
            if (f.get(i).equals(e.get(size - 1 - i))) {
                flag++;
            }
        }
        if (flag == size) {
            System.out.println("e : It is in descending order");
        } else {
            System.out.println("e : It is not in descending order");
//2.yol:chat GPT
//            List<String> colors1 = List.of("Yellow", "Blue", "Red", "Green");
//            List<String> colors2 = List.of("Yellow", "Red", "Green", "Blue");
//
//            System.out.println("colors1:" + isDescendingOrder(colors1));
//            System.out.println("colors2: " + isDescendingOrder(colors2));
//        }
//
//        public static String isDescendingOrder(List<String> colors) {
//            for (int i = 0; i < colors.size() - 1; i++) {
//                if (colors.get(i).compareTo(colors.get(i + 1)) < 0) {
//                    return "It is not in descending order";
//                }
//            }
//            return "It is in descending order";
        }
    }

}


