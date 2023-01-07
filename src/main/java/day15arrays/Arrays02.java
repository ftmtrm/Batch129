package day15arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //bir stringteki sesli harflerin sayisini bulan kodu yaziniz

        String s = "Java brings you money";
        //1.yol: use replacaAll()//aslinda kendi icinde loop kullanir.
        int vowels = s.replaceAll("[^aeiouAEIOU]", "").length();
        System.out.println((vowels));

        //2.yol: use Array - Loop
        String letters[] = s.split("");//split methodu bize Array verir.
        System.out.println(Arrays.toString(letters));

        int counter = 0;
        for (String w : letters) {
            switch (w.toLowerCase()) {
                case "a":
                case "e":
                case "o":
                case "u":
                case "i":
                    counter++;
            }


        }
        System.out.println(counter);
    }
}
