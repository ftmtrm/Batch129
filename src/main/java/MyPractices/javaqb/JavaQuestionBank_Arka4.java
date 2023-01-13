package MyPractices.javaqb;

import java.util.Arrays;

public class JavaQuestionBank_Arka4 {
    //Bir string'te tekrarlanan karakterleri yazdiran kodu yaziniz.

    public static void main(String[] args) {
        String s = "accessories";
        String arr[] = s.split("");

        int counter = 0;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].equals(arr[i - 1])) {
                counter++;
            }

            }
            int idx = 0;
            String brr[] = new String[counter];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].equals(arr[i - 1])) {
                brr[idx++] = arr[i - 1];

            }

        }
        System.out.println(Arrays.toString(brr));
    }
}

















