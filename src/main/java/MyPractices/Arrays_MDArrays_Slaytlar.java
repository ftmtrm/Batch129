package MyPractices;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_MDArrays_Slaytlar {
    public static void main(String[] args) {
        // Q01: Asagidaki MD Arrayin ic arraylerindeki son elemanlarin carpimini console yazdiran kodu yaziniz.
        //{{1,2,3},{4,5},{6}}

        int arr[][] = {{1, 2, 3}, {4, 5}, {6}};
        int carpim = 1;

        for (int[] w : arr) {
            for (int k : w) {
                int last = w[w.length - 1];
                if (k == last) {
                    carpim *= k;
                }
            }
        }
        System.out.println(carpim);


        //  Q03: kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String str = input.nextLine();
        String crr[] = str.split(" ");
        System.out.println(Arrays.deepToString(crr));
        int w = crr.length;
        System.out.println(w);

        // Q04: verilen bir Array'den istenen degere esit olan elemanlari kaldirip
        // kalanlari yeni bir array olarak yazdiran bir method yaziniz.

        int drr[] = {1, 3, 3, 4, 5, 5, 7, 8, 8, 9};
        kalanYazdir(drr);
    }

    private static void kalanYazdir(int[] drr) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("0'dan buyuk bir rakam giriniz");
        int sayi = input1.nextInt();
        int counter = 0;
        for (int w : drr) {
            if (w != sayi) {
                counter++;
            }
        }
        int err[] = new int[counter];
        int idx = 0;
        for (int w : drr) {
            if (w != sayi) {
                err[idx] = w;
                idx++;
            }
            }
            System.out.println(Arrays.toString(err));
        }

    }







