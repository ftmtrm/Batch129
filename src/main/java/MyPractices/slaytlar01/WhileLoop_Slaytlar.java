package MyPractices.slaytlar01;

import java.util.Scanner;

public class WhileLoop_Slaytlar {
    public static void main(String[] args) {
        int i = 3;
        while(i<14){
            if(i%2!=0) {
                System.out.print(i);
            }
            i++;
        }
        System.out.println();

        for (int j = 100; j <=999 ; j++) {
            if (j % 15 == 0 && j % 20 == 0 && j % 90 == 0) {
                System.out.print(j);
            }
        }
            System.out.println();

        int k = 100;
            while(k<1000){
                if(k%15==0 && k%20==0 && k%90==0){
                    System.out.print(k);
                }k++;
            }
        System.out.println();

        Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen baslangic degerini giriniz");
        int num= scan.nextInt();
        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen bitis degerini giriniz");
        int num1= input.nextInt();
        int m = num;
        while(m<=num1){
            if(m%2==0){
                System.out.print(m);
            }m++;
        }
        System.out.println();

        Scanner s = new Scanner (System.in);
        System.out.println("Lutfen baslangic harfini giriniz");
        char ch= s.next().toUpperCase().charAt(0);
        Scanner t = new Scanner (System.in);
        System.out.println("Lutfen bitis harfini giriniz");
        char ch2 = t.next().toUpperCase().charAt(0);

        char u = ch;
        while(u<=ch2){
            System.out.print(u);
            u++;
        }
        }
    }

