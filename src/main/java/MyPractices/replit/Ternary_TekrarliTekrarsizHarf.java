package MyPractices.replit;

import java.util.Scanner;

public class Ternary_TekrarliTekrarsizHarf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string value");
        String s = input.nextLine().trim().replaceAll(" ", "").toLowerCase();
       String result="";
        for (int i =0; i < s.length(); i++) {
            char ch = s.charAt(i);
            result = s.indexOf(ch) != s.lastIndexOf(ch) ? "String has duplicate characters" : "String has unique characters" ;
        }
        System.out.println(result);
    }
}