package MyPractices.loops;

import java.util.Scanner;

public class MyLoops03 {
    public static void main(String[] args) {
        //Kullanicidan baslangic ve bitis degerlerini alin.
        // baslangictan bitise kadar tum cift tamsayilari yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic degeri giriniz");
        int start = scan.nextInt();
        System.out.println("Lutfen bitis degeri giriniz");
        int end = scan.nextInt();
        if (start > end) {
            System.out.println("Baslangic degeri bitis degerinden kucuk olamaz");
        }else {
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }

            }
            System.out.println();
        }


        for (int i = 1; i <=5; i++) {
            for (int j = 5 - i; j > 1; j--) {
                System.out.print(i + j);

            }
            System.out.println();
        }

            //Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen bir ulke adi giriniz");
            String s = input.nextLine();
            String t = " ";
            for (int k = s.length()-1 ; k>=0; k--) {
                 t+= s.charAt(k);

            }
            System.out.print(t);
        }
    }

