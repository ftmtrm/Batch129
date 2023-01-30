package MyPractices.teampractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arrays04 {
    public static void main(String[] args) {
        String cümle="Java is fun";
        System.out.println(cümle);

        String arr1[]=cümle.split(" ");

        List<String> list = Arrays.asList(arr1);
        Collections.reverse(list);
        String str=String.join(" ",list);
        System.out.println(str);

    }
}