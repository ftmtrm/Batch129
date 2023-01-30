package ssgler.multidimensional;

import java.util.Arrays;

public class MDArrays03 {
    public static void main(String[] args) {
        /*
        soru 8) Verilen multi dimensional array
        in outer indexinin inner indexindeki elementleri bir soldaki
        konuma tasiyacak bir program yazin.
         */
        int sayilar[][]={{3,2,1}, {4,5,1,9,5}, {6,7,8}};
        for (int i = 0; i < sayilar.length; i++) {
            int temp=sayilar[i][0];
            for (int j = 0; j < sayilar[i].length-1; j++) {
                sayilar[i][j]=sayilar[i][j+1];

            }sayilar[i][sayilar[i].length-1]=temp;

        }
        System.out.println(Arrays.deepToString(sayilar));

    }
}

