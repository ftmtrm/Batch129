package MyPractices.replit;

import java.util.Arrays;
import java.util.Scanner;

public class EnfazlaTekrarEdenKarakter {
   /* Write a Java program to get a String from user as input and find
   the maximum occurring character in that string. (Ignore case sensitivity)
Learning java is easy==> maximum occurring character is : a*/
   public static void main(String[] args) {

      /* 1. Yol:
      Scanner input = new Scanner(System.in);
      System.out.println("Lutfen bir cumle giriniz");
      String s = input.nextLine().trim().replaceAll(" ", "").toLowerCase();
      int counter = 0;
      for (Integer i = 1; i < s.length(); i++) {
         String c = s.substring(i - 1,i);
         if (s.indexOf(c) == s.lastIndexOf(c)) {
            System.out.println(c + " karakteri Stringte " + (counter + 1) + " kez kullanilmistir");
         } else if (s.contains(c)) {
            counter++;
            System.out.println(c + " karakteri Stringte " + (counter + 1) + " kez kullanilmistir");

         }
      }*/

      // 2. Yol:
      Scanner input = new Scanner(System.in);
      String str= input.nextLine().toLowerCase();
      String alphabet="abcdefghijklmnopqrstuvwxyz";
      int counter=0;
      int numOfMaxOccuring=0;     // En cok tekrar eden harfin tekrar sayisi
      char mostRepeated='a';      // En cok tekrar eden harf

      for (int i = 0; i < alphabet.length(); i++) {       //Alfabe ile String'i kiyaslayacagimiz icin nested Loop kullandim,
         for (int j = 0; j < str.length(); j++) {        // alphabet.charAt(i) ile str.charAt(j)) 'nin birbirine esitliklerini kontrol ediyoruz

            if (alphabet.charAt(i)==str.charAt(j)){     // counter bize alfabedeki her bir harfin kac defa tekrar ettigini veriyor
               counter++;
            }
         }

         if (counter>numOfMaxOccuring){
            numOfMaxOccuring=counter;           //  Eger burada kosul saglanirsa numOfMaxOccuring degerini counter degeri ile guncelliyoruz
            mostRepeated=alphabet.charAt(i);    //  Ve alphabet.charAt(i) ' deki harfi mostRepeated char konteynirinin icine koyuyoruz
         }
         counter=0;      // counter'i sifirliyoruz ki Loop bir sonraki harfe gecerken saymaya sifirdan baslasin
      }
      System.out.println(mostRepeated+" harfi "+numOfMaxOccuring+" defa tekrar ediyor");
      System.out.println();


         Scanner input1 = new Scanner(System.in);
         System.out.print("Enter a string: ");
         String str1 = input1.nextLine().toLowerCase();

         int[] count = new int[26];
         int max = 0;
         char maxChar = ' ';

         for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
               count[c - 'a']++;
               if (count[c - 'a'] > max) {
                  max = count[c - 'a'];
                  maxChar = c;
               }
            }
         }

         System.out.println("Maximum occurring character is '" + maxChar + "' with count " + max);
      }
   }

