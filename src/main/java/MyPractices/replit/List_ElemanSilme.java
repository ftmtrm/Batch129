package MyPractices.replit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_ElemanSilme {
    public static void main(String[] args) {
        /*write a Java program to removes a specific element from an array and put the remaining elements in a new array and prints the new array
Input :{1,2,3,4,5,6} element:6  Output : [1,2,3,4,5]*/
      int arr [] = {1,2,3,4,5,6};
      List<Integer> newList = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen 1'den 6'ya kadar bir sayi giriniz");
      int element = sc.nextInt();
      for(int w: arr){
         if(w!=element){
             newList.add(w);

         }

         }
        System.out.println(newList);
    }
}
