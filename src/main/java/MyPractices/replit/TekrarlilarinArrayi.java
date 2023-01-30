package MyPractices.replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TekrarlilarinArrayi {
    public static void main(String[] args) {
        // Write a code that returns the duplicate chars in a String array.(interview Question)
        String str = "Javaisalsoeasy";
        String d = "";
        for (Integer i = 0; i < str.length(); i++) {
            String c = str.substring(i, i + 1);
            if (str.indexOf(c) != str.lastIndexOf(c)) {
                if (!d.contains(c)) {
                    d = d + c;
                }
            }
        }
        String[] arr = d.split("");
        System.out.println(Arrays.toString(arr));

        String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
       // List<String> min = new ArrayList<>();
      int minChar = Integer.MAX_VALUE;//b[0].length de olur.ama java daha cok is yapar.
        String min = "";
        for (int i = 0; i < b.length; i++) {
            if (b[i].length() < minChar) {
                minChar = b[i].length();
            }
        }
            for (String w : b) {
                if (minChar == w.length())
                    min+=w+ " ";
            }
            System.out.println(min);

        }
    }


