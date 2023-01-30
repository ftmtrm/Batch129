package MyPractices.teampractice;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    //If a list has 20 or 30, remove them.

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(31);
        list.add(20);
        list.add(13);
        list.add(20);
        list.add(30);
        list.add(82);
        list.add(94);
        list.add(30);
        list.add(20);
        if (!list.contains(20) && !list.contains(30)) {
            System.out.println("The list does not contain 20 and 30");
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == 20) {
                    int idx20 = list.indexOf(20);
                    list.remove(idx20);
                    i--;
                }
                if (list.get(i) == 30) {
                    int idx30 = list.indexOf(30);
                    list.remove(idx30);
                    i--;
                }
            }
            System.out.println(list);
        }

    }
}
