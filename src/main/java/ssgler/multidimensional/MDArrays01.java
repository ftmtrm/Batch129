package ssgler.multidimensional;

import java.util.Arrays;

public class MDArrays01 {
    public static void main(String[] args) {
        /*
        soru 6) bir multi-dimensional array olusturun ve outer indexlerin
        inner indexlerini tek tek kontrol edip en buyuk degerlerini yazdırın
        */
        int arr[][] = {{6, 5, 8}, {12, 15, 13}, {17, 20, 21}};

        //1.yol:
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
            System.out.println(max);
        }
        //2.yol:
        for (int i = 0; i < arr.length; i++) {

            Arrays.sort(arr[i]);
            System.out.println(arr[i][arr.length - 1]);

        }
    }
}

