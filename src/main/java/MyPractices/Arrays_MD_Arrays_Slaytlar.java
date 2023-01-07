package MyPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_MD_Arrays_Slaytlar {
    public static void main(String[] args) {

        //Q02:Asagidaki MD arrayin icindeki tum elemanlarin toplamini ayri ayri aliniz ve
        // bu elemanlar icin yeni bir array olusturup yazdiriniz

        int[][] arr = {{1, 2, 3}, {4, 5}, {6, 7}};
        int[] arrsum = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {

                sum += arr[i][j];
                arrsum[i] = sum;

            }
            System.out.println("sum = " + sum);

        }
        System.out.println(Arrays.toString(arrsum));
    }

}