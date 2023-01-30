package day29_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Exceptions {
  // 8) InputMismatchException
  public static void main(String[] args) {
      //verilen bir arrayden kullanicidan index isteyin verilen indexteki datayi yazdirin.
      //index yerine 'a' harfi ya da negatif deger verebilir o zaman InputMismatchException olusur.
      int arr [] = {2,3,5,9,7,45};
      Scanner input = new Scanner(System.in);
      System.out.println("Lutfen index icin sayi giriniz");
      int index = 0;
      try {
          index = input.nextInt();
          System.out.println("girilen indexteki eleman :"+arr[index]);
          //ArrayIndexOutOfBoundsException aldik index icin 8 yazinca
         //InputMismatchException aldik index icin 'a'girince
      } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Girdiginiz indexteki eleman arrayde yok "+e.getMessage());
          e.printStackTrace();
      } catch (InputMismatchException e) {
          System.out.println("Girdiginiz index sayi olmalidir InputMismatchException "+e.getMessage());
          e.printStackTrace();
      }
      System.out.println("Durmak yok yola devam");

  }

}
