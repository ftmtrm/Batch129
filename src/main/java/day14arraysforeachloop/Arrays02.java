package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Ex2: Integer array olusturunuz
        //icine 6 tane eleman yerlestiriniz
        //bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz.

 int ages [] = new int[6];
 ages[0]=20;
 ages[1]=23;
 ages[2]=19;
 ages[3]=44;
 ages[4]=15;
 ages[5]=32;

 //1.yol:
       Arrays.sort(ages);//bu method Array'deki elemanlari kucukten buyuge siralar.
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]+ ages[ages.length-1]);

  //2.yol:
     int minimum = ages[0];
     int maksimum = ages[0];
     for (int w: ages) {
         minimum = Math.min(minimum, w);
         maksimum = Math.max(maksimum, w);

     }
        System.out.println(minimum+maksimum);
    }
}
