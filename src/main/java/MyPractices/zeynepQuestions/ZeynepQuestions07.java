package MyPractices.zeynepQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class ZeynepQuestions07 {
    public static void main(String[] args) {
        /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */
        String str = "Javacilar cook afilli";
        String str2 [] = str.trim().replace(" ","").split("");

        Arrays.sort(str2);
        System.out.println(Arrays.toString(str2));

        int counter = 0;
        for (int i = 1; i < str2.length ; i++) {
            if (str2[i - 1].equals(str2[i])) {
                counter++;
            } else {
                System.out.println(str2[i - 1] + " karakterinin sayisi =" +( counter+1));
                counter = 0;
            }
            if(i== str2.length - 1)
                System.out.println(str2[i]+ "karakterinin sayisi = "+(counter+1));

        }
 /* TASK :
           Elinizde bir miktar farklı boylarda somun ve bu somunlara uyacak civatalar olsun.
           Civataları somunlara eşlemek için nasıl bir algoritma yazarsınız.

        int[] arrSomun1 = {1, 3, 6, 5, 2};
        int[] arrCivata1 = {1, 2, 3, 6, 5};

        for (int i = 0; i <arrSomun.length ; i++) {
            for (int j = 0; j < arrCivata1.length ; j++) {
                if(arrSomun1[i]== arrCivata1[j]){
                    int [] uyum ={arrSomun1[i],arrCivata1[j]};

                    System.out.println(Arrays.toString(uyum));
                }

            }

        }*/

            int[] arrSomun = {1, 3, 6, 5, 2};
            int[] arrCivata = {1, 2, 3, 6, 5};

            arrSomun = dizinYap(arrSomun);
            arrCivata = dizinYap(arrCivata);
            for (int i = 0; i < arrCivata.length; i++) {
                System.out.println("arrCivata : " + arrCivata[i] + " = arrSomun :" + arrSomun[i]);
            }

        }

        public static int[] dizinYap(int[] arrA) {
            for (int i = 0; i < arrA.length; i++) {
                for (int j = 0; j < arrA.length; j++) {
                    if (arrA[i] < arrA[j]) {
                        int ef = arrA[i];
                        arrA[i] = arrA[j];
                        arrA[j] = ef;
                    }
                }
            }
            return arrA;
        }

    }






