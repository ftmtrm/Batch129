package practiceAdvanced07;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_Arrays_OrtaElement {
    //Elementlerini kullanıcidan aldığınız bir integer array içindeki orta elementi bulan bir kod yazınız.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Array limitini giriniz.");
        int arr[] = new int[input.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ". elementi giriniz");
            arr[i] = input.nextInt();

        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int ortaIdx = arr.length/2;
        if (arr.length % 2 != 0) {
            System.out.println("orta eleman = " + arr[ortaIdx]);
        }else {
            System.out.println("Orta eleman: "+(arr[ortaIdx]+arr[ortaIdx-1])/2.0);
        }
    }
}