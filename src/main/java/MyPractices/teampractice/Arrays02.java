package MyPractices.teampractice;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i;
        }

        int counter = 0;
        for (int num : numbers) {
            if (num % 3 == 0) {
                counter++;
            }
        }

        int[] uceBolunen = new int[counter-1];
        int idx = 0;
        for (int num : numbers) {
            if (num % 3 == 0 && num!=0){
                uceBolunen[idx++] = num;
            }
        }
        System.out.println(Arrays.toString(uceBolunen));

        System.out.println();

        System.out.println(" 3'e bölünen toplam sayı :" + (counter-1) );
    }
}





