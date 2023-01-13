package ssgler.ssgLists;

import java.util.Arrays;
import java.util.List;

public class Lists04 {
    // verilen bir array'i listeye cevirin
    public static void main(String[] args) {

        String arr[] = {"A", "B", "C"};

        arr[0]="F";

        List<String> arraydenList = Arrays.asList(arr);

        arraydenList.set(0,"D");

        System.out.println(arraydenList);

    }
}