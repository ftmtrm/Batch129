package practiceAdvanced02;

import java.util.Arrays;

public class Q03_Arrays_IkinciMax {
    public static void main(String[] args) {

        /*Bir array icerisindeki min ve max ve ikinci max. degerlerini bulan kodu yaziniz
         */
        //1.yol:
        int [] arr = {100,10001,-90,845,8787,898,0,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//natural order
        System.out.println("min :"+arr[0]+" max: "+arr[arr.length-1]+" secMax: "+arr[arr.length-2]);

        //2.yol:
        int min = arr[0];
        int max = arr[0];
        int secMax = arr[0];

        for (int w :arr){
            if(w<min){
                min = w;
            }else if (w>max){
                secMax = max;
                max = w;
            }else if (w>secMax){
                secMax = w;
            }
        }
        System.out.println("min : "+ min + " max: "+max+" secMax: "+secMax);
        }
    }

