package day37Lambda_SuleymanHoca;

import day36Lambda.Utils;
import day37Lambda.Utilities;

import java.lang.instrument.Instrumentation;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {
 public static void main(String[] args) {

  List<Integer> myList = new ArrayList<>();
  myList.add(12);
  myList.add(8);
  myList.add(23);
  myList.add(10);
  myList.add(7);
  System.out.println(getSumOfAllElements(myList));
  System.out.println(getSumfromSevenToSeventy());
  System.out.println(getMultiplyfromThreeToNine1());
  System.out.println(getMultiplyfromThreeToNine2());
  System.out.println(getFactorial(5));
  System.out.println(getSumOfEvensBetweenTwoInt(5,14));
  System.out.println(getSumOfDigitsBetweenTwoInt(12,18));

 }

 //1) Verilen list'teki tum sayilarin toplamini veren method'u olusturunuz.
 public static int getSumOfAllElements(List<Integer> myList) {
  return myList.stream().reduce(Math::addExact).get();
 }

 //2) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz.
 public static int getSumfromSevenToSeventy() {
  return IntStream.rangeClosed(7, 70).reduce(Math::addExact).getAsInt();
  //IntStream tum integer'lari yukardan asagiya getirir.
  //IntStream olunca getAsInt yazmak gerekir.
  //rangeClosed==> baslangis ve bitis araligi veriyor. rangeClosed-->[]
 }

 // 3) 3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
 public static int getMultiplyfromThreeToNine1() {
  return IntStream.rangeClosed(3, 9).reduce(Math::multiplyExact).getAsInt();
 }

 public static int getMultiplyfromThreeToNine2() {
  return IntStream.range(3, 10).reduce(Math::multiplyExact).getAsInt();//Integer::multiply yok Math daha kapsamli
  // ondan genelde Math kullanilir.range-->[)

 }

 //4) size verilen sayinin faktoriyelini hesaplayan kodu yaziniz
 public static int getFactorial(int x) {
  if (x == 0) {
   return 1;
  } else if (x < 0) {
   System.out.println("Faktoriyel islemi negatif sayilarla yapilamaz");
   return -1;// return type int oldugu icin buraya return -1 yazmazsak hata verir
   // ve return her zaman en son olmalidir
  } else
   return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
 }


 //5) Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
public static int getSumOfEvensBetweenTwoInt(int a,int b) {
 if (a > b) {
  int temp = a;
  a = b;
  b = temp;
 }
 return IntStream.range(a + 1, b).filter(Utilities::ciftMi).sum();
}
//6) Size verilen iki tamsayi arasindaki tum tamsayilarin rakamlari toplamini veren kodu yaziniz.
public static int getSumOfDigitsBetweenTwoInt(int a,int b) {
 if (a > b) {
  int temp = a;
  a = b;
  b = temp;
 }
 return IntStream.range(a + 1, b).map(Utils::getSumOfDigits).sum();


}
}