package MyPractices.loops;

import java.util.Scanner;

public class MyLoops02 {
    public static void main(String[] args) {
        //Ex6: Kullanicidan 100'den kucuk bir tamsayi isteyin.
        // 1'den baslayarak girilen sayiya kadar tum sayilari yazdirin.Ancak
        //sayi 3'un kati ise sayi yerine "Java",
        //sayi 5'in kati ise sayi yerine "Guzeldir",
        //sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir"yazdirin.

        Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen 100'den kucuk bir tamsayi giriniz");
        int num= scan.nextInt();
        String s = "Java";
        String t = "Guzeldir";

        for (int i = 1; i < num+1 ; i++) {

            if(i%3==0 && i%5==0) {
                System.out.print(s  +  t + " ");
            }else if (i%5==0) {
                System.out.print(t+ " ");
            }else if (i%3==0) {
                System.out.print(s+" ");
            }else {
                System.out.print(i+" ");
            }




            }

        }
    }

