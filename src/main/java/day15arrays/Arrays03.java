package day15arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Ex: //INTERVIEW Question
        //        [0,2,3,0,12,0] sifirlari en sona koyunuz.

        int a [] = {0,2,3,0,12,0};
        int b [] = new int[a.length];//b = [0,0,0,0,0,0]
        int idx = 0;
        for (int w: a){//a'dan elemanlari al w'nun icine koy diyor
            if (w!= 0){//0!=0 false oldugu icin if calismamis oluyor diger arrayler icin calisir. b[0] = 2 koy w'ya
                b[idx] = w;//                                                                     b[1] = 3 koy w'ya diyor
                idx++;//                                                                          b[2] = 12 koy

            }

        }
        System.out.println(Arrays.toString(b));
    }
}
