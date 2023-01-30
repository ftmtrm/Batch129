package MyPractices.zeynepQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class ZeynepQuestions03 {
    public static void main(String[] args) {
          /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
           */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir ulke ismi giriniz");
        String ulke = input.next();
        String arr[]=ulke.split("");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int counter = 0;
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i - 1].equals(arr[i])) {
                counter++;
            } else {
                System.out.println(arr[i - 1] + " sayisi " + (counter + 1));
                counter = 0;
            }
            if (i == arr.length - 1) {
                System.out.println(arr[i] + " sayisi " + (counter + 1));
            }

        }

    }
}
