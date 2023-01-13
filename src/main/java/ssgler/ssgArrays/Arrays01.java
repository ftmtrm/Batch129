package ssgler.ssgArrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //verilen 3 elemanli bir arrayin tum elemanlarini bir soldaki konuma tasiyacak bir program yazin
        int arr [] = {1,2,3};
        int atanacaksayi = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = atanacaksayi;
        System.out.println(Arrays.toString(arr));
    }

}
