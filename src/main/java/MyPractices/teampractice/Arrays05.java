package MyPractices.teampractice;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

    int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};

    countPositivesSumNegative(arr);
}

private static void countPositivesSumNegative(int[] arr) {

        if (arr.length==0){
        System.out.println(Arrays.toString(arr));
        }
        else {
        int sumNegatives=0;
        int countPositives=0;
        for (int w : arr) {
        if (w>0){
        countPositives++;
        }
        if (w<0){
        sumNegatives +=w ;
        }
        }
        int brr[]={countPositives,sumNegatives};
        System.out.println(Arrays.toString(brr));
        }

        }
        }

