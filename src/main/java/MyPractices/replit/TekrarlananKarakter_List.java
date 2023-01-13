package MyPractices.replit;

import java.util.ArrayList;
import java.util.Scanner;

public class TekrarlananKarakter_List {
    /*
           Write a code that returns the duplicate chars in a String array
           Bir String dizisinde yinelenen karakterleri yazdıran bir kod yaz.
            (javaisalsoeasy)                                                        INTERVIEW Q.
         */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir kelime/cümle giriniz.");
        String str = sc.nextLine().replaceAll(" ", "");

        ArrayList<Character> list = new ArrayList<>();

        // for loop

        for (int i = 0; i < str.length(); i++) {           // char ch=str.charAt(0);

            if (list.contains(str.charAt(i))) {
                System.out.print("Tekrarlanan harfler: ");
                System.out.println(str.charAt(i));

            } else {
                list.add(str.charAt(i));
            }

        }
        // while loop

        /*int idx = 0;
        while (idx < str.length()) {

            if (list.contains(str.charAt(idx))) {
                System.out.print("Tekrarlanan harfler: ");
                System.out.println(str.charAt(idx));

            } else {
                list.add(str.charAt(idx));
            }
            idx++;
    }
        // for each


        for (char ch : str.toCharArray()) {
            if (list.contains(ch)) {
                System.out.println(ch + " is a repeated character.");
            } else {
                list.add(ch);
                System.out.println("tekrarlanan harf yoktur");*/
            }


        }

