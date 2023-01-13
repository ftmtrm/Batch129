package practiceAdvanced06;

import java.util.Scanner;

public class Q02_Palindrome_StringBuilder {

    //Bir String değerin Palindrome olup olmadığını kontrol eden bir kod yazınız.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir String deger giriniz");
        String str = input.nextLine().replaceAll(" ","").toLowerCase();
        String strReverse = "";
        for (int i =str.length()-1 ; i >-1 ; i--) {
            strReverse+= str.charAt(i);
        }
        System.out.println("strReverse = " + strReverse);
        if(str.equals(strReverse)){
            System.out.println("Palindrome");
        }else
            System.out.println("Palindrome degil");

        System.out.println("Bir String deger giriniz");
        String str2 = input.nextLine().replaceAll(" ","").toLowerCase();
        StringBuilder stb = new StringBuilder(str2);
        //stringin mutable halidir.
        // methodlarla stringin orjinalini degistirebilecegiz
        System.out.println("stb="+ stb);
        String str2Reverse = stb.reverse().toString();
        System.out.println("Reverse() sonrasi stb: "+stb);
        if(str2.equals(str2Reverse)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Palindrome degil");
        }



    }

}
